/*
// Curso Egg FullStack
 */
package Servicios;

// @author JulianCVidal
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServiciosListaCiudades {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void añadirCiudad(HashMap<Integer, String> listaCiudades) {
        System.out.print("Ingrese el nombre de la ciudad: ");
        String ciudad = leer.next();

        System.out.print("Y su código postal: ");
        Integer codigoPostal = leer.nextInt();

        listaCiudades.put(codigoPostal, ciudad);
    }

    public void mostrarCiudades(HashMap<Integer, String> listaCiudades) {
        for (Map.Entry<Integer, String> ciudad : listaCiudades.entrySet()) {
            System.out.println("Ciudad: " + ciudad.getValue() + ", código postal: " + ciudad.getKey());
        }
    }

    public void mostrarSegunCodigo(HashMap<Integer, String> listaCiudades) {
        System.out.print("Ingrese el código postal de la ciudad a buscar: ");
        Integer codigoPostal = leer.nextInt();

        if (!listaCiudades.containsKey(codigoPostal)) {
            System.out.println("La lista no contiene ese código postal.");
            return;
        }

        System.out.println("La ciudad que contiene ese código es: " + listaCiudades.get(codigoPostal));
    }

    public void eliminarCiudad(HashMap<Integer, String> listaCiudades) {
        System.out.print("Ingrese el nombre de la ciudad a eliminar: ");
        String ciudadEliminar = leer.next();

        if (!listaCiudades.containsValue(ciudadEliminar)) {
            System.out.println("La lista no contiene esa ciudad.");
            return;
        }

        listaCiudades.values().remove(ciudadEliminar);
    }
}
