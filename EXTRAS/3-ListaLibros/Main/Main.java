/*
// Curso Egg FullStack
 */
package Main;

//@author JulianCVidal
import Constantes.Constantes;
import Entidades.Libro;
import Servicios.ServiciosLibreria;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        ServiciosLibreria ServLib = new ServiciosLibreria();
        HashSet<Libro> listaLibros = new HashSet();

        String opc;

        do {
            listaLibros.add(ServLib.crearLibro());
            System.out.print("\n¿Desea ingresar otro libro (Y/N)? ");
            opc = leer.next().substring(0, 1).toUpperCase();

        } while (!opc.equals("N"));

        do {
            System.out.println("Opciones disponibles: ");
            System.out.println("P.Pedir un libro");
            System.out.println("D.Devolver un libro");
            System.out.println("S.Salir");
            System.out.println("Seleccione una opción: ");
            opc = leer.next().substring(0, 1).toUpperCase();

            if (!opc.equals("P") && !opc.equals("D")) {
                if (!opc.equals("S")) {
                    System.out.println("No ha ingresado una opción válida");
                }
                continue;
            }

            switch (opc) {
                case "P":
                    if(ServLib.prestamo(listaLibros)){
                        System.out.println(Constantes.PRESTAMO_REALIZADO);   
                    }
                    break;

                case "D":
                    if(ServLib.devolucion(listaLibros)){
                        System.out.println(Constantes.DEVOLUCION_REALIZADA);
                    }
            }

            presionarEnter();
        } while (!opc.equals("S"));
    }

    private static void presionarEnter() {
        System.out.println("Presione Enter para continuar.");
        String pass = leer.next();
    }

}
