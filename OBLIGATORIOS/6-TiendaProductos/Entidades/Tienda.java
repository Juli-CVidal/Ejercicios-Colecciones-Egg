/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
import java.util.HashMap;

public class Tienda {

    private HashMap<String, Double> productos;

    public Tienda() {
        this.productos = new HashMap();
    }

    public HashMap<String, Double> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<String, Double> productos) {
        this.productos = productos;
    }

}
