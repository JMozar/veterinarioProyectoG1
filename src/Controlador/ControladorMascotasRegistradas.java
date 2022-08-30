
package Controlador;


import Modelo.MascotaArreglo;
import Vista.frmMascotasRegistradas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;


public class ControladorMascotasRegistradas {
    private frmMascotasRegistradas vista;
    private MascotaArreglo modelo;

    public ControladorMascotasRegistradas(frmMascotasRegistradas vista, MascotaArreglo modelo) {
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
        this.vista.tblMascotasRegistradas.setModel(modelotabla);
    }

    public void iniciar() {
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);

        actualizarTabla();
    }
}
