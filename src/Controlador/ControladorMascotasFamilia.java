package Controlador;

import Modelo.*;
import Vista.*;
import Datos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class ControladorMascotasFamilia {
    private frmMascotasFamilia vista;
    private ClienteFamilia modelo;
    
    public ControladorMascotasFamilia (frmMascotasFamilia vista, ClienteFamilia modelo){
        this.vista = vista;
        this.modelo = modelo;
        
        this.vista.btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        }
        );
        
        this.vista.btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
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
    
    public void iniciar() {
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
