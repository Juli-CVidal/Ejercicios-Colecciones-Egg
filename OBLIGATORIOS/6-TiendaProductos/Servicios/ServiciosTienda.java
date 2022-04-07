/*
// Curso Egg FullStack
 */
package Servicios;

// @author JulianCVidal
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServiciosTienda {

    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void añadirProducto(HashMap<String, Double> productos){
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = leer.next();
        
        System.out.print("Y su precio: ");
        Double precio = leer.nextDouble();
        
        productos.put(nombre, precio);
    }
    
    public boolean modificarPrecio(HashMap<String,Double> productos){
        System.out.print("¿A qué producto quiere cambiarle el precio? ");
        String nombre = leer.next();
        if (!productos.containsKey(nombre)){
            System.out.println("El producto no se encuentra en la tienda.");
            return false;
        }
        
        System.out.print("Ingrese el nuevo precio: ");
        Double precio = leer.nextDouble();
        productos.replace(nombre, precio);
        return true;
    }
    
    public boolean eliminarProducto(HashMap<String,Double> productos){
        System.out.print("¿Qué producto quiere eliminar? ");
        String nombre = leer.next();
        
        if (!productos.containsKey(nombre)){
            System.out.println("El producto no se encuentra en la tienda.");
            return false;
        }
        
        productos.remove(nombre);
        return true;
    }
    
    
    public void mostrarProductos(HashMap<String, Double> productos){
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            
            System.out.println("Nombre del producto: " + key);
            System.out.println("Precio: " + value + "\n");
        }
    }
}
