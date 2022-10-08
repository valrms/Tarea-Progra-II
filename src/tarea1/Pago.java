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