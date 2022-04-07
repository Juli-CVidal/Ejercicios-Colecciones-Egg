/*
// Curso Egg FullStack
 */
package Servicios;

// @author JulianCVidal
import Constantes.Constantes;
import Entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;

public class ServiciosLibreria {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() {
        System.out.print("Ingrese el título del libro: ");
        String titulo = leer.next();

        System.out.print("El autor: ");
        String autor = leer.next();

        System.out.print("Y la cantidad de ejemplares disponibles: ");
        Integer ejemplares = leer.nextInt();

        return new Libro(titulo, autor, ejemplares);
    }

    public boolean prestamo(HashSet<Libro> listaLibros) {
        System.out.print(Constantes.PEDIR_TITULO);
        String tituloBuscar = leer.next();
        Libro lib = buscarPorTitulo(listaLibros, tituloBuscar);

        if (lib == null) {
            System.out.println(Constantes.NO_ENCONTRADO);
            return false;
        }
        if (lib.getEjemplaresPrestados() == lib.getEjemplares()) {
            System.out.println(Constantes.SIN_EJEMPLARES);
            return false;
        }

        lib.setEjemplaresPrestados(lib.getEjemplaresPrestados() + 1);
        return true;
    }

    public boolean devolucion(HashSet<Libro> listaLibros) {
        System.out.print(Constantes.PEDIR_TITULO);
        String tituloBuscar = leer.next();
        Libro lib = buscarPorTitulo(listaLibros, tituloBuscar);
        
        if (lib == null){
            System.out.println(Constantes.SIN_EJEMPLARES);
            return false;
        }
        
        lib.setEjemplaresPrestados(lib.getEjemplaresPrestados() - 1);
        return true;
    }

    private Libro buscarPorTitulo(HashSet<Libro> listaLibros, String titulo) {
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    
    private void mostrarLibros(HashSet<Libro> listaLibros){
        for (Libro libro : listaLibros) {
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Ejemplares disponibles: " + libro.getEjemplares());
        }
    }
    
    
}
