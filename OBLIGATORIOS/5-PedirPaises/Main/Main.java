/*
// Curso Egg FullStack
 */
package Main;

//@author JulianCVidal
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        TreeSet<String> paises = new TreeSet();

        String paisAñadir = "", paisEliminar;
        System.out.println("Recuerde ingresar 'N' para finalizar");

        while (!paisAñadir.toUpperCase().equals("N")) {
            System.out.print("Por favor ingrese un país: ");
            paisAñadir = leer.next();

            if (paisAñadir.toUpperCase().equals("N")) {
                continue;
            }

            paises.add(paisAñadir);

        }

        System.out.println("\nLos paises añadidos son: ");
        mostrarPaises(paises);

        System.out.print("\nIngrese el elemento a eliminar: ");
        paisEliminar = leer.next();

        if (buscarYEliminar(paises, paisEliminar)) {
            System.out.println("Se ha encontrado y eliminado el elemento, la lista resultante es: ");
            mostrarPaises(paises);
        }else{
            System.out.println("No se ha encontrado el elemento, no se han hecho cambios en la lista");
        }

    }

    public static boolean buscarYEliminar(TreeSet<String> paises, String paisEliminar) {
        Iterator curr = paises.iterator();

        while (curr.hasNext()) {
            if (curr.next().equals(paisEliminar)) {
                paises.remove(paisEliminar);
                return true;
            }
        }
        return false;
    }

    public static void mostrarPaises(TreeSet<String> paises) {
        System.out.print("[");
        for (String pais : paises) {
            System.out.print(pais + ", ");
        }
        System.out.println("]");
    }
}
