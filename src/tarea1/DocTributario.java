package tarea1;

import java.util.Date;

public class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;
    private Direccion Dlocal;
    
    public DocTributario (String numero, String rut, String direccion){
        this.numero = numero;
        this.rut = rut;
        fecha = new Date();
        Dlocal = new Direccion(direccion);
    }
    
    protected String GetNumero(){
        return numero;
    }
    
     protected String GetRut(){
        return rut;
    }
     
      protected Date Getfecha(){
        return fecha;
    }
      protected Direccion GetDireccion(){
        return Dlocal;
    }
    @Override
        public String toString(){
            return "numero: " + GetNumero() + "Rut: " + GetRut() + "Direccion del local: " +  GetDireccion() + "Fecha: " + Getfecha();
    } 
}

class Boleta extends DocTributario{
    public Boleta(String numero, String rut, String direccion){
        super(numero,rut,direccion);
    }
}

class Factura extends DocTributario{
    public Factura (String numero, String rut, String direccion){
        super(numero,rut,direccion);
    }
}

