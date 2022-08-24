package Controlador;

import Modelo.*;
import Vista.*;
import Datos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorRegistrarEmpleados {
    private frmEmpleado vista;
    private EmpleadoArreglo modelo;

    public ControladorRegistrarEmpleados(frmEmpleado vista, EmpleadoArreglo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        this.vista.btnRegistrar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Empleado em = new Empleado(vista.txtEspecialidad.getText(), 
                        Float.parseFloat(vista.txtSueldo.getText()), vista.txtNombreEmpleado.getText(), 
                        vista.txtApellidoEmpleado.getText(),vista.txtDNIEmpleado.getText(),
                Integer.parseInt(vista.lblTelefonoEmpleado.getText()));
                Repositorio.empleados.agregar(em);
                System.out.println("Empleado AGREGADO");
                JOptionPane.showMessageDialog(null, "Empleado Agregada");
                JOptionPane.showMessageDialog(null, em.toString());
                actualizarTabla();
                }
            }
                
        );
        this.vista.btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ControladorPrincipal controlador = new ControladorPrincipal(new Usuario("admin", "123"), new frmPrincipal());
                //en lugar de crear otro usuario debemos traerlo del repo
                controlador.iniciar();
                vista.dispose();
                }
            }
        );
        this.vista.btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int fila = vista.tblEmpleadoRepo.getSelectedRow();//seleccion de fila de la tabla
                
                //eliminar
                if (fila == -1) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una empleado");
                } else {
                    int valor = Integer.parseInt(vista.tblEmpleadoRepo.getValueAt(fila, 0).toString());//codigo de mascota
                    Repositorio.empleados.eliminar(valor);//metodo para eliminar(de un arreglo de mascotas)
                    actualizarTabla();//actualizamos
                    System.out.println(Repositorio.empleados.toString());//mascotas que estan en repo
                    JOptionPane.showMessageDialog(null, "Empleado Eliminado");
                }

            }
        }
        );
        
    }
    public void actualizarTabla() {
        //lo del jtable
        DefaultTableModel modelotabla = new DefaultTableModel(this.modelo.getDatos(), this.modelo.getCabecera());
        this.vista.tblEmpleadoRepo.setModel(modelotabla);
    }
    public void iniciar() {
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        
        actualizarTabla();
        System.out.println(Repositorio.personas.toString());//mascotas que estan en repo
    }
}
