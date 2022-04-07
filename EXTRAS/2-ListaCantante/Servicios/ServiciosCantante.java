/*
// Curso Egg FullStack
 */
package Servicios;

// @author JulianCVidal
import Entidades.CantanteFamoso;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ServiciosCantante {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CantanteFamoso crearCantante() {
        System.out.print("Ingrese el nombre del cantante: ");
        String nombre = leer.next();

        System.out.print("Y del disco con más ventas: ");
        String discoConMasVentas = leer.next();

        return new CantanteFamoso(nombre, discoConMasVentas);
    }

    public void mostrarCantantes(HashSet<CantanteFamoso> listaCantantes) {
        for (CantanteFamoso cantante : listaCantantes) {
            System.out.println("Nombre: " + cantante.getNombre());
            System.out.println("Disco con más ventas: " + cantante.getDiscoConMasVentas());
            System.out.println();
        }
    }

    public boolean eliminarCantante(HashSet<CantanteFamoso> listaCantantes) {
        System.out.print("Ingrese el nombre del cantante a eliminar: ");
        String nombre = leer.next();

        for (Iterator<CantanteFamoso> iterator = listaCantantes.iterator(); iterator.hasNext();) {
            CantanteFamoso next = iterator.next();

            if (next.getNombre().equals(nombre)) {
                listaCantantes.remove(next);
                return true;
            }
        }
        return false;
    }
}
