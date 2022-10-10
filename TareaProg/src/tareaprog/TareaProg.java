
package tareaprog;

public class TareaProg {

    public static void main(String[] args) {
        Articulo articulo = new Articulo(5, "silla", "marron", 80000);
        DetalleCompra details = new DetalleCompra (5, articulo);
        details.adding(5, articulo);
        OrdenCompra orders = new OrdenCompra(details);
        float precio = orders.calcPrecioSinIVA();
        System.out.println(precio);
        
        Articulo articulo2 = new Articulo(1, "mesa de comedor", "marron", 399000);
        DetalleCompra details2 = new DetalleCompra (1, articulo2);
        details2.adding(1, articulo2);
        OrdenCompra orders2 = new OrdenCompra (details2);
        float precio2 = orders2.calcPrecio();
        System.out.println(precio2);
        
        Articulo articulo3 = new Articulo(3, "cortinas", "beige", 30000);
        DetalleCompra details3 = new DetalleCompra (3, articulo3);
        details3.adding(3, articulo3);
        OrdenCompra orders3 = new OrdenCompra(details3);
        float precio3 = orders3.calcPrecio();
        System.out.println(precio3);
        
        Articulo articulo4 = new Articulo(2, "muebles", "beige", 400000);
        Articulo articulo5 = new Articulo(1, "alfombra", "marron", 99990);
    }
    
}
