
package tareaprog;

import java.time.LocalDateTime;
import java.util.ArrayList;

class Articulo {
    
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;
    
    public Articulo (float weight, String name, String d, float price) {
        
        peso = weight;
        nombre = name;
        descripcion = d;
        precio = price;
        
    }
    
    public float DarPeso () {
        return peso;
    }
    
    public String DarNombre () {
        return nombre;
    }
    
    public String DarDescripcion () {
        return descripcion;
    }
    
    public float DarPrecio () {
        return precio;
    }    
            
}