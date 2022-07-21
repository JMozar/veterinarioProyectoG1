package Modelo;

import java.util.Date;

public class Mascota {
    private String codigo;
    private String nombre;
    private String colorPelo;
    private Date fechaNacimiento;

    public Mascota(String codigo, String nombre, Date fechaNacimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void llenarCita (String codigo, String nombre, String colorPelo, Date fechaNacimiento){
        
    }
}
