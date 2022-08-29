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
    private ClienteFamilia modelo;
    
    public ControladorIntegrantesFamilia (frmIntegrantesFamilia vista, ClienteFamilia modelo){
        this.vista = vista;
        this.modelo = modelo;
        
        this.vista.btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
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
                    Repositorio.familias.eliminar(valor);//metodo para eliminar(de un arreglo de familias)
                    actualizarTabla();//actualizamos
                    System.out.println(Repositorio.familias.toString());//familias que estan en repo
                    JOptionPane.showMessageDialog(null, "Persona eliminada");
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
    }
    
    public void actualizarTabla() {
        //lo del jtable
        //DefaultTableModel modelotabla = new DefaultTableModel(this.modelo.getDatos(), this.modelo.getCabecera());
        //this.vista.tblIntegrantesFamilia.setModel(modelotabla);
    }
    
    public void iniciar() {
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        
        actualizarTabla();
        System.out.println(Repositorio.mascotas.toString());
    }
}
