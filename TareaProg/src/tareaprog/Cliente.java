package tareaprog;

public class Cliente {
      private String nombre;
      private String rut;
      private Direccion Dcliente;
      public Cliente(String nombre, String rut, String direccion){
          this.nombre = nombre;
          this.rut = rut;
          Dcliente = new Direccion(direccion);
      }
    public String GetRut(){
        return rut;
    }
    public String Getnombre(){
        return nombre;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + " RUT: " + rut + "Direccion del cliente: " + Dcliente;
    }

}
