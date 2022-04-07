/*
// Curso Egg FullStack
 */
package Main;

//@author JulianCVidal
import Entidades.Alumno;
import Entidades.ServiciosAlumno;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static ServiciosAlumno servAl = new ServiciosAlumno();

    public static void main(String[] args) {
        String opc = "Y";
        ArrayList<Alumno> listaAlumnos = new ArrayList();

        System.out.println("Le solicitaremos alumnos hasta que ingrese 'N'");
        
        while (!opc.equals("N")) {
            listaAlumnos.add(servAl.crearAlumno());
            System.out.print("\n¿Desea ingresar otro alumno (Y/N)? ");
            
            opc = leer.next().substring(0,1).toUpperCase();
        }

        System.out.println("Alumnos ingresados correctamente");

        System.out.print("Ingrese el nombre del alumno al que quiere calcular su nota final: ");
        String nombreBuscar = leer.next();
        boolean found = false;
        
        for (Alumno curr : listaAlumnos) {
            if (curr.getNombre().equals(nombreBuscar)){
                System.out.println("El alumno ingresado tiene una nota final de: " + servAl.notaFinal(curr.getNotas()));
                found = true;
                break;
            }
        }
        
        if (!found){
            System.out.println("El alumno ingresado no se encuentra en la lista");
        }
    }
}
