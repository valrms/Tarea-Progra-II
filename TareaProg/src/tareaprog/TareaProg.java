
package tareaprog;

public class TareaProg {

    public static void main(String[] args) {
        Articulo articulo = new Articulo(5, "silla", "marron", 80000);
        DetalleCompra details = new DetalleCompra (4, articulo);
        details.adding(5, articulo);
        OrdenCompra orders = new OrdenCompra(details);
        float valor = orders.calcPrecioSinIVA();
        System.out.println(valor);
    }
    
}
