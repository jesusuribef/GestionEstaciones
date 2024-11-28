package Enums.GestionEstaciones.src.servicios;
import Enums.GestionEstaciones.src.enums.*;


import java.util.Scanner;

public class Menu {

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Mostrar meses de las estaciones del año");
            System.out.println("2. Determinar estación del año para un mes");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    EstacionDelAnio.imprimirEstaciones();
                    break;
                case 2:
                    System.out.print("Ingrese el número del mes (1-12): ");
                    int numeroMes = scanner.nextInt();
                    Mes mes = Mes.obtenerPorNumero(numeroMes);
                    if (mes != null) {
                        Estacion estacion = EstacionDelAnio.obtenerEstacion(mes);
                        System.out.println("El mes " + mes + " pertenece a la estación: " + estacion);
                    } else {
                        System.out.println("Número de mes no válido.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
