
package Modelo;

import java.util.Date;


public class InyeccionVacuna {
    private static int contador;
    private int codigo;
    private int nroVacuna;
    private String tipoVacuna;
    private String fecha;     //CAMBIAR A DATE
    private Mascota mascota;
    private Empleado empleado;

    
    //metodos
    //contructor
    //agregar vacuna
    //agregar empleado

    public InyeccionVacuna(int nroVacuna, String tipoVacuna, String fecha, Mascota mascota, Empleado empleado) {
        this.codigo = contador;
        contador++;
        this.nroVacuna = nroVacuna;
        this.tipoVacuna = tipoVacuna;
        this.fecha = fecha;
        this.mascota = mascota;
        this.empleado = empleado;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    /*
    public void vacunarmascota(Mascota mascota, int numero){
        mascota.vacunar(numero);
    }
    */

    @Override
    public String toString() {
        return "InyeccionVacuna{" + "codigo=" + codigo + ", nroVacuna=" + nroVacuna + ", tipoVacuna=" + tipoVacuna + ", fecha=" + fecha + ", mascota=" + mascota + ", empleado=" + empleado.getNombre()+" "+empleado.getApellido()+ '}';
    }
}
