package Controlador;

import Modelo.*;
import Vista.*;
import Datos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorIntegrantesFamilia {
    private frmIntegrantesFamilia vista;
    private ClienteFamilia modelo;
    
    public ControladorIntegrantesFamilia (frmIntegrantesFamilia vista, ClienteFamilia modelo){
        this.vista = vista;
        this.modelo = modelo;
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
        //this.vista.txtAreaHistorial.setEditable(false);
        //mostrarHistorial();
    }
}
