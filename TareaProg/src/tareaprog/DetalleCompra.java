
package tareaprog;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class DetalleCompra {
    
    private int cantidad;
    private float s;
    private Articulo a;
    ArrayList<Articulo> buying_List = new ArrayList<Articulo>();
    
    public DetalleCompra (int c, Articulo producto) {
        
        for (int i = 0; i < c; i++) {
            
            buying_List.add(i, producto);
            
        }
        
        cantidad = c;
        s = 0;
    }
    
    public void adding (int w, Articulo s) {
        
        for (int i = cantidad; i < w; i++) {
            
            buying_List.add(s);
        }
        
    }
    
    public float calcPrecioSinIVA () {
        
        for (int i = 0; i < buying_List.size(); i++) {
            
            a = buying_List.get(i);
            float n = a.DarPrecio();
            float aux = (n * 19)/100;
            float sinIVA = n - aux;
            s = s + sinIVA;
            
        }
        
        return s;
    }
    
    public float calcIVA () {
        
        for (int i = 0; i < buying_List.size(); i++) {
            
            a = buying_List.get(i);
            float n = a.DarPrecio();
            float aux = (n * 19)/100;
            s = aux;
        }
        
        return s;
        
    }
    
    public float calcPrecio() {
        
         for (int i = 0; i < buying_List.size(); i++) {
             
             a = buying_List.get(i);
             float n = a.DarPrecio();
             s = s + n;
         }
         
         return s;
    }
    
    public float calcPeso () {
        
        for (int i = 0; i < buying_List.size(); i++) {
            
            a = buying_List.get(i);
            float n = a.DarPeso();
            s = s + n;
        }
        
        return s;
    }
    
}

class OrdenCompra {
    
    LocalDateTime date = LocalDateTime.now();
    public String estado;
    private DetalleCompra ca;
    
    public OrdenCompra (DetalleCompra m) {
        
        ca = m;
    }
    
    public float calcPrecioSinIVA () {
        
        return(ca.calcPrecioSinIVA());
    }
    
    public float calcIVA () {
        
        return(ca.calcIVA());
    }
    
    public float calcPrecio() {
        
        return(ca.calcPrecio());
    }
    
    public float calcPeso () {
        
        return(ca.calcPeso());
    } 
    
}

