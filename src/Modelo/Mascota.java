package Modelo;

import java.util.Date;

public class Mascota {
    protected String codigo;
    protected String nombre;
    protected String colorPelo;
    protected Date fechaNacimiento;

    public Mascota(){
    }
    
    public Mascota(String codigo, String nombre, Date fechaNacimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //añadir metodos(añadir, eliminar, ) o busquen p
    //validar codigo que sea numero o que se aumente automticamente
    
}
