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
                        JOptionPane.showMessageDialog(null, cp.toString());
                        actualizarTabla();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Digite un num. celular valido");
                    }

                }

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
        this.vista.btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int fila = vista.tblPersonasRepo.getSelectedRow();//seleccion de fila de la tabla

                //eliminar
                if (fila == -1) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una persona");
                } else {
                    int valor = Integer.parseInt(vista.tblPersonasRepo.getValueAt(fila, 0).toString());//codigo de mascota
                    Repositorio.personas.eliminar(valor);//metodo para eliminar(de un arreglo de mascotas)
                    actualizarTabla();//actualizamos
                    System.out.println(Repositorio.personas.toString());//mascotas que estan en repo
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

    public void iniciar() {
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);

        actualizarTabla();
        System.out.println(Repositorio.personas.toString());//personas que estan en repo
    }
}
