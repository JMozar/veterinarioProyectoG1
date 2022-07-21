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
    private String Nombre_Usuario;
    private String Contraseña;
    public void validar_User(String nombre){
        while(nombre ==""){
         Nombre_Usuario = nombre;
        }
    }
}
