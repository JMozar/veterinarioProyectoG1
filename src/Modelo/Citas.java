
package Modelo;

import java.util.Date;


public class Citas {
    //revisar lo de vacuna
    //fecha a String

    private static int contador=0;
    private int codigo;
    private String Fecha; //CAMBIAR a DATE
    private String Diagnostico;//¿Que tiene?
    private String Tratamiento;//Como se quita
    private String Vacunas; // 

    private Empleado empleado;
    private Mascota mascota;
    private ClienteFamilia familia;
    private float registroTalla;
    private float registroPeso;

    public Citas(String Fecha, String Diagnostico, String Tratamiento, Empleado empleado, Mascota mascota, ClienteFamilia familia, float talla, float peso) {
        this.codigo=contador;
        contador++;
        
        this.Fecha = Fecha;
        this.Diagnostico = Diagnostico;
        this.Tratamiento = Tratamiento;
        this.empleado = empleado;
        this.mascota = mascota;
        this.familia = familia;
        modificarPesoMascota(peso);
        modificarTallaMascota(talla);
        registroTalla=peso;
        registroPeso=talla;
        
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }



    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }



    public void identificar(String codigoP) {

    }

    public void modificarTallaMascota(float talla) {
        if(talla>0){
            this.mascota.setTalla(talla);
        }else{
            System.out.println("Talla invalida");
        }
        
    }
    
    public void modificarPesoMascota(float peso){
        if(peso>0){
            this.mascota.setPeso(peso);
        }else{
            System.out.println("Peso invalido");
        }
        
    }

    @Override
    public String toString() {
        
        return "Citas{" + "Codigo=" + codigo + ", Fecha=" + Fecha + ", \nDiagnostico=" + 
                Diagnostico + ", \nTratamiento=" + Tratamiento + ", Vacunas=" + Vacunas + 
                ", \nPeso=" + registroPeso + ", Talla=" + registroTalla + 
                ", \nEmpleado=" + empleado.getNombre()+" "+empleado.getApellido() + 
                ", Mascota=" + mascota + ", familia=" + familia +"\n"+ '}';
    }
    
}
