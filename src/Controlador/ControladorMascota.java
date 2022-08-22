package Controlador;

import Modelo.*;
import Vista.*;
import Datos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorMascota {

    private frmMascota vista;
    private MascotaArreglo modelo;

    //a
    public ControladorMascota(frmMascota vista, MascotaArreglo modelo) {
        this.vista = vista;
        this.modelo = modelo;

        //botones
        this.vista.btnRegistrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //comienza
                //Mascota mascota1 = new Mascota("Peque",especie1,"Mostaza","12-08-2018");
                Mascota m = new Mascota(vista.txtNombreMascota.getText(), (Especie) vista.cmbEspecie.getSelectedItem(),
                        vista.txtRazaMascota.getText(),
                        vista.txtColorMascota.getText(), vista.txtFechaNacimientoMascota.getText());
                //Agregamos las mascotas al repo
                Repositorio.mascotas.agregar(m);
                System.out.println("MASCOTA AGREGADA");
                JOptionPane.showMessageDialog(null, "Mascota Agregada");
                JOptionPane.showMessageDialog(null, m.toString());
                //Actualizar tabla
                actualizarTabla();
                System.out.println(Repositorio.mascotas.toString());//mascotas que estan en repo

            }
        }
        );
        this.vista.btnRegresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                ControladorPrincipal controlador = new ControladorPrincipal(new Usuario("admin", "123"), new frmPrincipal());
                //en lugar de crear otro usuario debemos traerlo del repo
                controlador.iniciar();
                vista.dispose();
            }
        }
        );

        this.vista.btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int fila = vista.tblMascotasRepo.getSelectedRow();//seleccion de fila de la tabla
                
                //eliminar
                if (fila == -1) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una mascota");
                } else {
                    int valor = Integer.parseInt(vista.tblMascotasRepo.getValueAt(fila, 0).toString());//codigo de mascota
                    Repositorio.mascotas.eliminar(valor);//metodo para eliminar(de un arreglo de mascotas)
                    actualizarTabla();//actualizamos
                    System.out.println(Repositorio.mascotas.toString());//mascotas que estan en repo
                    JOptionPane.showMessageDialog(null, "Mascota Eliminada");
                }

            }
        }
        );
    }

    public void actualizarTabla() {
        //lo del jtable
        DefaultTableModel modelotabla = new DefaultTableModel(this.modelo.getDatos(), this.modelo.getCabecera());
        this.vista.tblMascotasRepo.setModel(modelotabla);
    }

    public void iniciar() {
        this.vista.setLocationRelativeTo(null);

        this.vista.setVisible(true);

        //lo del combobox
        DefaultComboBoxModel modeloCboEspecies = new DefaultComboBoxModel();
        //traer todos los usuarios del repo
        for (Especie u : Repositorio.especies.getDatosCombo()) {
            modeloCboEspecies.addElement(u);
        }
        //le doy al combo del form el modelo
        this.vista.cmbEspecie.setModel(modeloCboEspecies);

        //lo del jtable
        actualizarTabla();
        System.out.println(Repositorio.mascotas.toString());//mascotas que estan en repo
    }
}
