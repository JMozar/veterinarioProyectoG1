
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.*;
import Vista.*;
import Datos.*;


public class ControladorPrincipal {
    private frmPrincipal vista;
    private Usuario modelo;
    
    
    public ControladorPrincipal(Usuario modelo, frmPrincipal vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        
        
        this.vista.btnMascotas.addActionListener( new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    
                    ControladorMascota controlador = new ControladorMascota( new frmMascota(),Repositorio.mascotas);
                    controlador.iniciar();
                    vista.dispose();
                }
            }
        );
        
        this.vista.btnFamilias.addActionListener( new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    
                    ControladorFamilias controlador = new ControladorFamilias( new frmFamilia(),Repositorio.familias);
                    controlador.iniciar();
                    vista.dispose();
                }
            }
        );
        
        

    } 
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        //traer usuario validado y ponerlo en el label
        this.vista.lblUsuario.setText(modelo.getUsuario());
    }

    
}
