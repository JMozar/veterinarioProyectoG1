package Controlador;

import Modelo.*;
import Vista.*;
import Datos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorRegistrarPersona {
    private frmClientePersona vista;
    private ClientePersonaArreglo modelo;

    public ControladorRegistrarPersona(frmClientePersona vista, ClientePersonaArreglo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        this.vista.btnRegistrarRP.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                ClientePersona cp = new ClientePersona(vista.lblNombrePersona.getText(), 
                        vista.lblApellidoPersona.getText(), vista.lblDNIPersona.getText(), Integer.parseInt(vista.lblTelefonoPersona.getText()));
                Repositorio.personas.agregar(cp);
                System.out.println("PERSONA AGREGADA");
                JOptionPane.showMessageDialog(null, "Persona Agregada");
                JOptionPane.showMessageDialog(null, cp.toString());
                }
            }
        );
        this.vista.btnCancelarRP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ControladorPrincipal controlador = new ControladorPrincipal(new Usuario("admin", "123"), new frmPrincipal());
                //en lugar de crear otro usuario debemos traerlo del repo
                controlador.iniciar();
                vista.dispose();
                }
            }
        );
    }
    public void iniciar() {
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
