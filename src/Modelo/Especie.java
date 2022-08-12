package Modelo;

import java.util.Date;

public class Especie{
    
    private String nombreEspecie;

    public Especie (String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }

    public String getNombreEspecie() {
        return nombreEspecie;
    }

    public void setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }

    @Override
    public String toString() {
        return nombreEspecie ;
    }
    
    
    
}