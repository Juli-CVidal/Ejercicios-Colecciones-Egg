/*
// Curso Egg FullStack
 */
package Main;

//@author JulianCVidal
import Entidades.CantanteFamoso;
import Servicios.ServiciosCantante;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    private static final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        ServiciosCantante ServCan = new ServiciosCantante();
        HashSet<CantanteFamoso> listaCantantes = new HashSet();

        System.out.println("Le pediremos 5 cantantes: ");
        for (int i = 0; i < 5; i++) {
            listaCantantes.add(ServCan.crearCantante());
            System.out.println();
        }

        Integer opc;

        do {
            System.out.println("Opciones disponibles: ");
            System.out.println("1.Añadir un cantante \n2.Mostrar todo \n3.Eliminar un cantante");
            System.out.print("4.Salir \nIngrese una opción: ");
            opc = leer.nextInt();

            if (opc <= 0 || opc >= 4) {
                if (opc != 4) {
                    System.out.println("No ha ingresado una opción válida");
                }

                continue;
            }

            switch (opc) {
                case 1:
                    listaCantantes.add(ServCan.crearCantante());
                    break;

                case 2:
                    ServCan.mostrarCantantes(listaCantantes);
                    break;

                case 3:
                    if (!ServCan.eliminarCantante(listaCantantes)) {
                        System.out.println("El cantante no se encuentra en la lista.");
                    } else {
                        System.out.println("Se ha eliminado el cantante.");
                    }
                    break;
            }
            
            presionarEnter();
        } while (opc != 4);
    }
    
    private static void presionarEnter(){
        System.out.println("Presione Enter para continuar.");
        String pass = leer.next();
    }
}
