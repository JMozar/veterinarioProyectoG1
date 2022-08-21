
package Controlador;
import Modelo.*;
import Vista.*;
import Datos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ControladorMascota {
    private frmMascota vista;
    private MascotaArreglo modelo;
    //a
    public ControladorMascota(frmMascota vista, MascotaArreglo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        //botones
        this.vista.btnRegistrar.addActionListener( new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    //comienza
                    //Mascota mascota1 = new Mascota("Peque",especie1,"Mostaza","12-08-2018");
                    Mascota m = new Mascota(vista.txtNombreMascota.getText(), (Especie) vista.cmbEspecie.getSelectedItem(),
                            vista.txtColorMascota.getText(),vista.txtFechaNacimientoMascota.getText());
                    //Agregamos las mascotas al repo
                    Repositorio.mascotas.agregar(m);
                    System.out.println("MASCOTA AGREGADA");
                    JOptionPane.showMessageDialog(null, "Mascota Agregada");
                    JOptionPane.showMessageDialog(null, m.toString());
                }
            }
        );
        this.vista.btnRegresar.addActionListener( new ActionListener() {
                public void actionPerformed(ActionEvent e){

                    ControladorPrincipal controlador = new ControladorPrincipal( new Usuario("admin","123"), new frmPrincipal()  );
                    //en lugar de crear otro usuario debemos traerlo del repo
                    controlador.iniciar();
                    vista.dispose();
                }
            }
        );
    }
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        
        this.vista.setVisible(true);
        
        //lo del combobox
        DefaultComboBoxModel modeloCboEspecies =new DefaultComboBoxModel();
        //traer todos los usuarios del repo
        for(Especie u: Repositorio.especies.getDatosCombo()){
            modeloCboEspecies.addElement(u);
        }
        //le doy al combo del form el modelo
        this.vista.cmbEspecie.setModel(modeloCboEspecies);
    }
}

