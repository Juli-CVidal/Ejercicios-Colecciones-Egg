/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
import java.util.ArrayList;

public class Alumno {

    private final String nombre;
    private final ArrayList<Integer> notas;

    public Alumno(String nombre, ArrayList notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }
}
