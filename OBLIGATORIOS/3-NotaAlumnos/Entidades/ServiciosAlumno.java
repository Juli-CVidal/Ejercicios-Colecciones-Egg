/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServiciosAlumno {

    public Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alumno crearAlumno() {
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = leer.next();

        ArrayList<Integer> notas = new ArrayList();
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la nota Nº" + (i + 1) + ": ");
            notas.add(leer.nextInt());
        }

        return new Alumno(nombre, notas);
    }

    public double notaFinal(ArrayList notas) {
        double notaF = 0;

        for (Iterator it = notas.iterator(); it.hasNext();) {
            int nota = (int) it.next();
            notaF+=nota;
        }
        return notaF/3;
    }
}
