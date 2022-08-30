package Controlador;

import Modelo.*;
import Vista.*;
import Datos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorMascotasFamilia {
    private frmMascotasFamilia vista;
    private MascotaArreglo modelo;
    private ClienteFamilia modelo2;
    
    
    public ControladorMascotasFamilia (frmMascotasFamilia vista, MascotaArreglo modelo, ClienteFamilia modelo2){
        this.vista = vista;
        this.modelo = modelo;
        
        
        this.vista.btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                if (vista.txtCodMascota.getText().isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "Digite un numero");

                } else {
                    try {
                        
                        Mascota m=Repositorio.mascotas.devolverMascota(Integer.parseInt(vista.txtCodMascota.getText()));
                        if(m.getDueño()==null){
                            //modelo.agregar(m);//agregamos la mascota a la familia
                        //f.AñadirMascotas(m);
                        modelo2.AñadirMascotas(m);
                        
                        System.out.println("MASCOTA AGREGADA");
                        JOptionPane.showMessageDialog(null, "Mascota Agregada a la familia");
                        actualizarTabla();
                        vista.txtCodMascota.setText("");
                        }else{
                            JOptionPane.showMessageDialog(null, "Esta mascota ya tiene dueño");
                        }
                        //
                        
                        
                        
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Digite un numero valido");
                    }
                }
            }
        }
        );
        
        this.vista.btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int fila = vista.tblMascotasFamilia.getSelectedRow();
                
                //eliminar
                if (fila == -1) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una mascota");
                } else {
                    int valor = Integer.parseInt(vista.tblMascotasFamilia.getValueAt(fila, 0).toString());
                    //modelo.eliminar(valor);//metodo para eliminar(de un arreglo de familias)
                    modelo2.EliminarMascotaAsginada(valor);
                    actualizarTabla();//actualizamos
                    
                    System.out.println(Repositorio.mascotas.toString());//familias que estan en repo
                    JOptionPane.showMessageDialog(null, "Mascota Eliminada de la familia");
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
        
        this.vista.btnMascotasRegistradas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ControladorMascotasRegistradas controlador = new ControladorMascotasRegistradas( new frmMascotasRegistradas(),Repositorio.mascotas);
                controlador.iniciar();
            }
        }
        );
    }
    
    public void actualizarTabla() {
        //lo del jtable
        DefaultTableModel modelotabla = new DefaultTableModel(this.modelo.getDatos(), this.modelo.getCabecera());
        this.vista.tblMascotasFamilia.setModel(modelotabla);
    }
    
    public void iniciar() {
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        
        actualizarTabla();
        System.out.println(Repositorio.mascotas.toString());
    }
    
}
