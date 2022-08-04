/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author enzol
 */
public class Empleado extends Persona {
    private String especialidad;
    private int codigo;
    private float sueldo;

  
    public Empleado(float sueldo, int codigo, String DNI, String nombre, String especialidad) {
        this.especialidad= especialidad;
        this.sueldo = sueldo;
        this.codigo = codigo;        
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    public void validar(){
        
    }
}
