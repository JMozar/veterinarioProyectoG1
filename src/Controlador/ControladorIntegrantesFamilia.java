package Controlador;

import Modelo.*;
import Vista.*;
import Datos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorIntegrantesFamilia {
    private frmIntegrantesFamilia vista;
    private ClientePersonaArreglo modelo;
    
    
    public ControladorIntegrantesFamilia (frmIntegrantesFamilia vista, ClientePersonaArreglo modelo){
        this.vista = vista;
        this.modelo = modelo;
        
        this.vista.btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                if (vista.txtCodPersona.getText().isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "Digite un numero");

                } else {
                    try {
                        ClientePersona p=Repositorio.personas.devolverPersona(Integer.parseInt(vista.txtCodPersona.getText()));
                        //
                        modelo.agregar(p);
                        System.out.println("PERSONA AGREGADA");
                        JOptionPane.showMessageDialog(null, "Persona Agregada a la familia");
                        actualizarTabla();
                        
                        vista.txtCodPersona.setText("");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Digite un numero valido");
                    }
                        

                }
            }
        }
        );
        
        this.vista.btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int fila = vista.tblIntegrantesFamilia.getSelectedRow();
                
                //eliminar
                if (fila == -1) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una persona");
                } else {
                    
                    int valor = Integer.parseInt(vista.tblIntegrantesFamilia.getValueAt(fila, 0).toString());
                    modelo.eliminar(valor);//metodo para eliminar(de un arreglo de familias)
                    actualizarTabla();//actualizamos
                    
                    JOptionPane.showMessageDialog(null, "Persona eliminada de la familia");
                }

            }
        }
        );
        
        this.vista.btnRegresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
            }
        }
        );
        
        this.vista.btnPersonasRegistradas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ControladorPersonasRegistradas controlador = new ControladorPersonasRegistradas( new frmPersonasRegistradas(),Repositorio.personas);
                controlador.iniciar();
            }
        }
        );
    }
    
    public void actualizarTabla() {
        //lo del jtable
        DefaultTableModel modelotabla = new DefaultTableModel(this.modelo.getDatos(), this.modelo.getCabecera());
        this.vista.tblIntegrantesFamilia.setModel(modelotabla);
    }
    
    public void iniciar() {
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        
        actualizarTabla();
        System.out.println(Repositorio.mascotas.toString());
    }
}
