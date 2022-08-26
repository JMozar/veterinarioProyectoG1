
package Controlador;
import Modelo.*;
import Vista.*;
import Datos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorCita {
    private frmCita vista;
    private CitasArreglo modelo;
    
         public ControladorCita(frmCita vista, CitasArreglo modelo){
             this.vista = vista;
             this.modelo = modelo;  
             
             this.vista.botonRegistrar.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        Citas c= new Citas(vista.txtFechacita.getText(), vista.txtDiagnostico.getText(), vista.txtDiagnostico.getText(),
                                (Empleado)vista.comboEmpleado.getSelectedItem(),(Mascota)vista.comboMascotas.getSelectedItem(),
                                Integer.parseInt(vista.txtTalla.getText()), Integer.parseInt(vista.txtPeso.getText()));
                     
                    Repositorio.citas.agregar(c);                 
                                     
                System.out.println("Cita AGREGADA");
                JOptionPane.showMessageDialog(null, "Cita AGREGADA");
                JOptionPane.showMessageDialog(null, c.toString());
                actualizarTabla();
                System.out.println(Repositorio.citas.toString());
                 }
             }
             );
            this.vista.botonRegresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                ControladorPrincipal controlador = new ControladorPrincipal(new Usuario("admin", "123"), new frmPrincipal());
                controlador.iniciar();
                vista.dispose();
                }
            }
            );
            this.vista.botonEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int fila = vista.tblCitasRepo.getSelectedRow();
                
                if (fila == -1) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar alguna Cita");
                } else {
                    int valor = Integer.parseInt(vista.tblCitasRepo.getValueAt(fila, 0).toString());
                    Repositorio.CitasArreglo.eliminar(valor);
                    actualizarTabla();
                    System.out.println(Repositorio.citas.toString());                    
                }
            }
        }
      );
    }
       public void actualizarTabla() {
        //lo del jtable
        DefaultTableModel modelotabla = new DefaultTableModel(this.modelo.getDatos(), this.modelo.getCabecera());
        this.vista.tblCitasRepo.setModel(modelotabla);
    }  
}
