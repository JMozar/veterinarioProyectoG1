package Controlador;

import Modelo.*;
import Vista.*;
import Datos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorFamilias {

    private frmFamilia vista;
    private ClienteFamiliaArreglo modelo;

    public ControladorFamilias(frmFamilia vista, ClienteFamiliaArreglo modelo) {
        this.vista = vista;
        this.modelo = modelo;

        this.vista.btnGuardarFamilia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numIntegrantes;
                if (vista.txtNroIntegrantes.getText().isEmpty() || vista.txtNroMascotas.getText().isEmpty() ||
                vista.txtApellido.getText().isEmpty() || vista.txtCtaB.getText().isEmpty() || vista.txtDireccion.getText().isEmpty() || vista.txtCel.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Complete todos los campos");
                } else {
                        numIntegrantes = Integer.parseInt(vista.txtNroIntegrantes.getText());
                        ClienteFamilia f = new ClienteFamilia( numIntegrantes, 
                        Integer.parseInt(vista.txtNroMascotas.getText()), vista.txtApellido.getText(), 
                        vista.txtCtaB.getText(), vista.txtDireccion.getText(), vista.txtCel.getText());
                        //Agregamos las familia al repo
                        Repositorio.familias.agregar(f);

                        System.out.println("FAMILIA AGREGADA");
                        JOptionPane.showMessageDialog(null, "Familia Agregada");
                        
                        //Actualizar tabla
                        actualizarTabla();
                        System.out.println(Repositorio.familias.toString());//familias que estan en repo
                        
                        vista.txtApellido.setText("");
                        vista.txtCtaB.setText("");
                        vista.txtDireccion.setText("");
                        vista.txtNroIntegrantes.setText("");
                        vista.txtNroMascotas.setText("");
                        vista.txtCel.setText("");
                                       
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
                
        this.vista.btnMascota.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int fila = vista.tblFamiliaRepo.getSelectedRow();//seleccion de fila de la tabla
                if (fila == -1) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una familia");
                } else {
                    int valor = Integer.parseInt(vista.tblFamiliaRepo.getValueAt(fila, 0).toString());//codigo de mascota
                    Mascota f= null;
                                        
                    f=Repositorio.mascotas.devolverMascota(valor);
                    ControladorMascotasFamilia controladorh = new ControladorMascotasFamilia(new frmMascotasFamilia(), f);
                    controladorh.iniciar();
                }
            }
        }
        );
        
        this.vista.btnIntegrantes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int fila = vista.tblFamiliaRepo.getSelectedRow();//seleccion de fila de la tabla
                if (fila == -1) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una familia");
                }
                else {
                    int valor = Integer.parseInt(vista.tblFamiliaRepo.getValueAt(fila, 0).toString());//codigo de mascota
                    ClienteFamilia f= null;
                    Repositorio.familias.devolverFamilia(valor);
                    
                    f=Repositorio.familias.devolverFamilia(valor);
                    ControladorIntegrantesFamilia controladorh = new ControladorIntegrantesFamilia(new frmIntegrantesFamilia(), f);
                    controladorh.iniciar();
                }
            }
        }
        );
        
        this.vista.btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int fila = vista.tblFamiliaRepo.getSelectedRow();//seleccion de fila de la tabla
                
                //eliminar
                if (fila == -1) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una familia");
                } else {
                    int valor = Integer.parseInt(vista.tblFamiliaRepo.getValueAt(fila, 0).toString());//codigo de familia
                    Repositorio.familias.eliminar(valor);//metodo para eliminar(de un arreglo de familias)
                    actualizarTabla();//actualizamos
                    System.out.println(Repositorio.familias.toString());//familias que estan en repo
                    JOptionPane.showMessageDialog(null, "Familia Eliminada");
                }

            }
        }
        );
    }
    
    public void actualizarTabla() {
        //lo del jtable
        DefaultTableModel modelotabla = new DefaultTableModel(this.modelo.getDatos(), this.modelo.getCabecera());
        this.vista.tblFamiliaRepo.setModel(modelotabla);
    }
    
    public void iniciar() {
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
