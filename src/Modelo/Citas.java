/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author enzol
 */
public class Citas {
    private Date Fecha;
    private String Diagnostico;
    private String Tratamiento;
    private String Vacunas;
    private float Peso;
    private float Talla;
    private String Nombre_Empleado;

    public Citas(Date Fecha, float Peso, float Talla) {
        this.Fecha = Fecha;
        this.Peso = Peso;
        this.Talla = Talla;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public float getTalla() {
        return Talla;
    }

    public void setTalla(float Talla) {
        this.Talla = Talla;
    }
    public void identificar(String codigoP){
        
    }
            
}
