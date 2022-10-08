package tarea1;

import java.util.Date;


public class Pago {
    private float monto;
    private Date fecha;
    public Pago(float monto){
        this.monto = monto;
        fecha = new Date();
    }
    protected float Getmonto(){
        return monto;
    }
    protected Date GetFecha(){
        return fecha;
    }
    @Override
    public String toString(){
        return "monto:" + monto + "fecha:" + fecha;
    } 
}



class Efectivo extends Pago{
    public Efectivo(float Getmonto){
        super(Getmonto);
    }
    public float calcDevolucion(float dinero){
        if (Getmonto() == dinero) {
            return 0;  
        } else if (Getmonto() > dinero){
           return -1;
        } else {         
          return dinero - Getmonto();
        }
    }
}

class Transferencia extends Pago{
    private String banco;
    private String numCuenta;
    public Transferencia(float Getmonto, String banco, String numCuenta){
        super(Getmonto);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }
    public String Getbanco(){
        return banco;
    }
    
    public String GetnumCuenta(){
        return numCuenta;
    }
    @Override
    public String toString(){
        return "monto:" + Getmonto() + "banco:" + banco + "numCuenta:" + numCuenta;
    } 
    
}



class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
    public Tarjeta(float Getmonto, String tipo, String numTransaccion){
        super(Getmonto);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }
    public String Gettipo(){
        if (tipo == "credito") {
            return "credito";
        } else if (tipo == "debito"){
            return "debito";
        } else {
            return "tarjeta no valida";
        }
    }
    
    public String GetnumTransaccion(){
        return numTransaccion;
    }
    @Override
    public String toString(){
        return "monto:" + Getmonto() + "tipo de tarjeta:" +  tipo + "numTransaccion:" + numTransaccion;
    } 
}