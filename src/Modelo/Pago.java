package Modelo;

import java.util.Date;

public class Pago {
    private Date fecha;
    private float monto;
    private String numTarjeta;
    
    private ClientePersona client;
    private Empleado empleado; 
    //metodos
    //HallarPrecioTotal
    //verificar si es con tarjeta o efectivo
    
    public float getMonto() {
        return monto;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }
    
    public void metodoPago(){
        
    }
    
    public boolean pagoRealizado (){
        return false;
    }
}
