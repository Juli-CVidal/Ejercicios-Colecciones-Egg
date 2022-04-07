/*
// Curso Egg FullStack
 */
package Main;

//@author JulianCVidal
import Servicios.ServiciosTienda;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        ServiciosTienda ServTien = new ServiciosTienda();
        HashMap<String, Double> productos = new HashMap();
        int opc;

        do {
            System.out.println("Opciones disponibles: ");
            System.out.println("1.Añadir un producto \n2.Modificar el precio de un producto");
            System.out.println("3.Eliminar un producto \n4.mostrar todos los productos");
            System.out.print("5.Salir \nElija una opción: ");
            opc = leer.nextInt();

            if (opc <= 0 || opc > 5) {
                System.out.println("No ha ingresado una opción válida.");
                continue;
            }
            if (opc == 5) {
                continue;
            }

            switch (opc) {
                case 1:
                    ServTien.añadirProducto(productos);
                    break;
                case 2:
                    ServTien.modificarPrecio(productos);
                    break;
                case 3:
                    ServTien.eliminarProducto(productos);
                    break;
                case 4:
                    ServTien.mostrarProductos(productos);
                    break;
            }

            esperarTecla();

        } while (opc != 5);
    }

    public static void esperarTecla() {
        System.out.println("Presione una Enter para continuar");
        String pass = leer.next();
    }
}
