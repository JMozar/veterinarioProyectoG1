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
public class Usuario {
    
    //Cambien las variables 
    private String Usuario;
    private String clave;
    private boolean activo;

    public Usuario(String Usuario, String clave) {
        this.Usuario = Usuario;
        this.clave = clave;
        this.activo = false;
    }

    public String getUsuario() {
        return Usuario;
    }

    public boolean isActivo() {
        return activo;
    }

    public boolean ingresar(String Usuario, String clave){
        boolean result = false;
        if( this.Usuario.equalsIgnoreCase(Usuario) && 
                this.clave.equals(clave)&&
                !isActivo() ){
            this.activo = true;
            result = true;
        }
            
        return result; 
    }
    
    public boolean salir(){
        boolean result = false;
        if(this.activo){
            this.activo = false;
            result = true;
        }
        return result;
    }
    
    
}
