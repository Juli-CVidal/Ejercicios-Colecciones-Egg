/*
// Curso Egg FullStack
 */
package Main;

//@author JulianCVidal
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        String opc = "Y";
        ArrayList<String> razas = new ArrayList();

        while (!opc.equals("N")) {
            System.out.print("Ingrese una raza: ");
            razas.add(leer.next());

            System.out.print("¿Desea ingresar otra raza? (Y/N) ");
            opc = leer.next().substring(0, 1).toUpperCase();
        }

        System.out.println("Las razas ingresadas son: ");
        mostrarLista(razas);

        //Inicio del punto 2
        System.out.print("Ingrese la raza del perro a eliminar: ");
        String delete = leer.next();
        if (eliminarElementoLista(razas,delete)) {
            System.out.println("Se ha encontrado y eliminado la raza ingresada");
        } else {
            System.out.println("No se ha encontrado la raza en la lista");
        }

        System.out.println("La lista ordenada es: ");
        Collections.sort(razas);
        mostrarLista(razas);
    }

    public static boolean eliminarElementoLista(ArrayList lista, String elemento) {
        Iterator curr = lista.iterator();
        
        while (curr.hasNext()) {
            if (curr.next().equals(elemento)) {
                curr.remove();
                return true;
            }
        }

        return false;
    }

    public static void mostrarLista(ArrayList lista) {
        Iterator curr = lista.iterator();
        System.out.print("[");
        while (curr.hasNext()) {
            System.out.print(curr.next());
            if (curr.hasNext()) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
