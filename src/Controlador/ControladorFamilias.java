package Controlador;

import Modelo.*;
import Vista.*;
import Datos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ControladorFamilias {

    private frmFamilia vista;
    private ClienteFamiliaArreglo modelo;

    public ControladorFamilias(frmFamilia vista, ClienteFamiliaArreglo modelo) {
        this.vista = vista;
        this.modelo = modelo;

        this.vista.btnGuardarFamilia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //comienza

                ClienteFamilia f = new ClienteFamilia(Integer.parseInt(vista.txtNroIntegrantes.getText()), Integer.parseInt(vista.txtNroMascotas.getText()), vista.txtApellido.getText(), vista.txtCtaB.getText(), vista.txtDireccion.getText(), vista.txtCel.getText());
                System.out.println("FAMILIA AGREGADA ");
                //lo agregamos al repositorio
                Repositorio.familias.agregar(f);
                
                JOptionPane.showMessageDialog(null, "Familia Agregada ");
                JOptionPane.showMessageDialog(null, f.toString());
            }
        }
        );
        this.vista.btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

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
