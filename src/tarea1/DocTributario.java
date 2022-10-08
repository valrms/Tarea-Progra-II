package tarea1;

import java.util.Date;

class Direccion {
    private String direccion;
    public Direccion(String direccion){
        this.direccion = direccion;
    }
    public String getDireccion() {
        return direccion;
    }
}

public class DocTributario {
    private String numero;
    private String rut;
    private Direccion local;
    private Date fecha;
    
    public DocTributario (String numero, String rut, Direccion direccion){
        this.numero = numero;
        this.rut = rut;
        fecha = new Date();
        local = direccion;
    }
    
    protected String GetNumero(){
        return numero;
    }
    
     protected String GetRut(){
        return rut;
    }
     
      protected Direccion GetDireccion(){
        return local;
    }
      protected Date Getfecha(){
        return fecha;
    }
    @Override
        public String toString(){
            return "numero: " + GetNumero() + "Rut: " + GetRut() + "Direccion: " + GetDireccion() + "Fecha: " + Getfecha();
    } 
}

class Boleta extends DocTributario{
    public Boleta(String numero, String rut, Direccion direccion){
        super(numero,rut,direccion);
    }
}

class Factura extends DocTributario{
    public Factura (String numero, String rut, Direccion direccion){
        super(numero,rut,direccion);
    }
}

