
package Controlador;

import Modelo.ClientePersonaArreglo;
import Vista.frmPersonasRegistradas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;


public class ControladorPersonasRegistradas {
    private frmPersonasRegistradas vista;
    private ClientePersonaArreglo modelo;

    public ControladorPersonasRegistradas(frmPersonasRegistradas vista, ClientePersonaArreglo modelo) {
        this.vista = vista;
        this.modelo = modelo;

        
        this.vista.btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                vista.dispose();
            }
        }
        );
    }
    public void actualizarTabla() {
        //lo del jtable
        DefaultTableModel modelotabla = new DefaultTableModel(this.modelo.getDatos(), this.modelo.getCabecera());
        this.vista.tblPersonasRegistradas.setModel(modelotabla);
    }

    public void iniciar() {
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);

        actualizarTabla();
    }
}
