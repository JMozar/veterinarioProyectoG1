package Controlador;

import Modelo.*;
import Vista.*;
import Datos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorRegistrarPersona {

    private frmClientePersona vista;
    private ClientePersonaArreglo modelo;

    public ControladorRegistrarPersona(frmClientePersona vista, ClientePersonaArreglo modelo) {
        this.vista = vista;
        this.modelo = modelo;

        this.vista.btnRegistrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numTelefono;
                if (vista.lblNombrePersona.getText().isEmpty() || vista.lblApellidoPersona.getText().isEmpty()
                        || vista.lblDNIPersona.getText().isEmpty() || vista.lblTelefonoPersona.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Complete todos los campos");

                } else {
                    try {
                        numTelefono = Integer.parseInt(vista.lblTelefonoPersona.getText());
                        ClientePersona cp = new ClientePersona(vista.lblNombrePersona.getText(),
                                vista.lblApellidoPersona.getText(), vista.lblDNIPersona.getText(),
                                numTelefono);
                        Repositorio.personas.agregar(cp);
                        System.out.println("PERSONA AGREGADA");
                        JOptionPane.showMessageDialog(null, "Persona Agregada");
                        actualizarTabla();
                        limpiarCampos();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Digite un num. celular valido");
                    }

                }

            }
        }
        );
        this.vista.btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ControladorPrincipal controlador = new ControladorPrincipal(Repositorio.usuario_validado, new frmPrincipal());
                controlador.iniciar();
                vista.dispose();
            }
        }
        );
        this.vista.btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int fila = vista.tblPersonasRepo.getSelectedRow();//seleccion de fila de la tabla

                //eliminar
                if (fila == -1) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una persona");
                } else {
                    int valor = Integer.parseInt(vista.tblPersonasRepo.getValueAt(fila, 0).toString());//codigo 
                    Repositorio.personas.eliminar(valor);//metodo para eliminar
                    actualizarTabla();//actualizamos
                    System.out.println("Persona Eliminada");
                    JOptionPane.showMessageDialog(null, "Persona Eliminada");
                }

            }
        }
        );

    }
    public void actualizarTabla() {
        //lo del jtable
        DefaultTableModel modelotabla = new DefaultTableModel(this.modelo.getDatos(), this.modelo.getCabecera());
        this.vista.tblPersonasRepo.setModel(modelotabla);
    }
    public void limpiarCampos(){
        //fecha talla peso diagnostico tratamiento
        this.vista.lblNombrePersona.setText("");
        this.vista.lblApellidoPersona.setText("");
        this.vista.lblDNIPersona.setText("");
        this.vista.lblTelefonoPersona.setText("");       
        
    }

    public void iniciar() {
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);

        actualizarTabla();
    }
}
