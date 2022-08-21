
package Modelo;

import java.util.Date;


public class Vacuna {
    private String medicamentos;
    private String dosis;
    private String gramos;
    private String fechaVacunacion;
    private boolean recurrente;//
    private int vecesAplicadas;
    //aplicada?
    private boolean estado;//fue aplicada o aun no?
    
    //de repente se tendra clase arreglo de Vacunas
    //constructor, get, set
    
    //recurrente o de una dosis
    
    //vacunas de una sola aplicacion
    public Vacuna (String medicamentos, String dosis, String gramos, String fechaVacunacion) {
        this.medicamentos = medicamentos;
        this.dosis = dosis;
        this.gramos = gramos;
        this.fechaVacunacion = fechaVacunacion;
        this.estado=false;//siempre estara sin aplicar a menos que se vacune
    }
    
    //vacunas anuales
    public Vacuna (String medicamentos, String gramos, String fechaVacunacion, int vecesAplicadas) {
        this.medicamentos = medicamentos;
        this.gramos = gramos;
        this.fechaVacunacion = fechaVacunacion;
        this.vecesAplicadas = vecesAplicadas;
        this.recurrente=true;
    }
    

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getGramos() {
        return gramos;
    }

    public void setGramos(String gramos) {
        this.gramos = gramos;
    }

    public String getFechaVacunacion() {
        return fechaVacunacion;
    }

    public void setFechaVacunacion(String fechaVacunacion) {
        this.fechaVacunacion = fechaVacunacion;
    }
    
    //fue aplicada o aun no?(para vacunas unicas)
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    //es recurrente o no?

    public boolean isRecurrente() {
        return recurrente;
    }

    public void setRecurrente(boolean recurrente) {
        this.recurrente = recurrente;
    }
    
    
    public String estadoVacuna(){
        String estado;
        if(this.estado==false){
            estado="NO aplicado";
        }else{
            estado="Aplicado";
        }
        return estado;
    }
    public void aumentarAplicacionesAnuales(){
        vecesAplicadas++;
    }
    

    @Override
    public String toString() {
        String datosVacuna="";
        if(recurrente==false){
            datosVacuna="Vacuna{" + "medicamentos=" + medicamentos + ", dosis=" + dosis +
                ", gramos=" + gramos + ", fechaVacunacion=" + fechaVacunacion +
                ", estado=" + estadoVacuna()+"";
        }else{
            datosVacuna="Vacuna{" + "medicamentos=" + medicamentos +
                ", gramos=" + gramos + ", fechaVacunacion=" + fechaVacunacion +
                ", Veces aplicada="+vecesAplicadas;
        }
        return datosVacuna;
    }
    
    
}