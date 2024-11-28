package Enums.GestionEstaciones.src.servicios;
import Enums.GestionEstaciones.src.enums.*;

public class EstacionDelAnio {

    public static Estacion obtenerEstacion(Mes mes) {
        switch (mes) {
            case DICIEMBRE:
            case ENERO:
            case FEBRERO:
                return Estacion.VERANO;
            case MARZO:
            case ABRIL:
            case MAYO:
                return Estacion.OTOÑO;
            case JUNIO:
            case JULIO:
            case AGOSTO:
                return Estacion.INVIERNO;
            case SEPTIEMBRE:
            case OCTUBRE:
            case NOVIEMBRE:
                return Estacion.PRIMAVERA;
            default:
                throw new IllegalArgumentException("Mes no válido: " + mes);
        }
    }

    public static void imprimirEstaciones() {
        for (Estacion estacion : Estacion.values()) {
            System.out.print(estacion + ": ");
            for (Mes mes : Mes.values()) {
                if (obtenerEstacion(mes) == estacion) {
                    System.out.print(mes + " ");
                }
            }
            System.out.println();
        }
    }
}
