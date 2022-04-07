/*
// Curso Egg FullStack
 */
package Main;

//@author JulianCVidal
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList();
        Integer numIngresado = 0;
        System.out.println("Le pediremos números enteros hasta que ingrese -99");
        
        while (numIngresado != -99){
            System.out.print("Ingrese un número: ");
            numIngresado = leer.nextInt();
            
            if (numIngresado == -99){
                continue;
            }
            
            listaNumeros.add(numIngresado);
        }
        Integer suma = calcularSuma(listaNumeros);
        Integer cantidad = listaNumeros.size();
        
        System.out.println("Se han ingresado " + cantidad + " números, que sumados dan un total de: " + suma );
        System.out.println("El promedio de los números es: " + suma/cantidad);
    }
    
    public static Integer calcularSuma(ArrayList<Integer> listaNumeros){
        Integer suma = 0;
        for (Integer num : listaNumeros) {
            suma+=num;
        }
        return suma;
    }
}
