/*
// Curso Egg FullStack
 */
package Main;

//@author JulianCVidal
import Servicios.ServiciosListaCiudades;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        ServiciosListaCiudades ServCiud = new ServiciosListaCiudades();
        HashMap<Integer, String> listaCiudades = new HashMap();
        Integer opc;

        do {
            System.out.println("Opciones disponibles: ");
            System.out.println("1.Añadir una ciudad");
            System.out.println("2.Mostrar todas las ciudades");
            System.out.println("3.Mostrar una ciudad según su código");
            System.out.println("4.Eliminar una ciudad");
            System.out.print("5.Salir \nElija una opción: ");
            opc = leer.nextInt();

            if (opc <= 0 || opc >= 5) {
                if (opc != 5) {
                    System.out.println("No ha ingresado una opción válida.");
                }
                continue;
            }

            switch (opc) {
                case 1:
                    ServCiud.añadirCiudad(listaCiudades);
                    break;

                case 2:
                    ServCiud.mostrarCiudades(listaCiudades);
                    break;

                case 3:
                    ServCiud.mostrarSegunCodigo(listaCiudades);
                    break;

                case 4:
                    ServCiud.eliminarCiudad(listaCiudades);
                    break;
            }
        } while (opc != 5);
    }

}
