package Modelo;

import java.util.Date;

public class Especie extends Mascota{
    
    private String nomEspecie;
    private String nomRaza;
    
    public Especie(){
        super();
    }

    public Especie(String nomEspecie, String nomRaza, String codigo, String nombre, Date fechaNacimiento) {
        super(codigo, nombre, fechaNacimiento);
        this.nomEspecie = nomEspecie;
        this.nomRaza = nomRaza;
    }
    
    
}
