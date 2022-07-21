
package Modelo;

import java.util.Date;


public class CalendarioVacuna {
    private String enfermedad;
    private int dosis;
    private int edadMascota;
    private int intervaloVacuna;
    private Date fechaInicioVacuna;
    private Date fechaFinalVacuna;

    public CalendarioVacuna(String enfermedad, int dosis, int edadMascota, int intervaloVacuna, Date fechaInicioVacuna, Date fechaFinalVacuna) {
        
        this.enfermedad = enfermedad;
        this.dosis = dosis;
        this.edadMascota = edadMascota;
        this.intervaloVacuna = intervaloVacuna;
        this.fechaInicioVacuna = fechaInicioVacuna;
        this.fechaFinalVacuna = fechaFinalVacuna;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }

    public int getIntervaloVacuna() {
        return intervaloVacuna;
    }

    public void setIntervaloVacuna(int intervaloVacuna) {
        this.intervaloVacuna = intervaloVacuna;
    }

    public Date getFechaInicioVacuna() {
        return fechaInicioVacuna;
    }

    public void setFechaInicioVacuna(Date fechaInicioVacuna) {
        this.fechaInicioVacuna = fechaInicioVacuna;
    }

    public Date getFechaFinalVacuna() {
        return fechaFinalVacuna;
    }

    public void setFechaFinalVacuna(Date fechaFinalVacuna) {
        this.fechaFinalVacuna = fechaFinalVacuna;
    }

    @Override
    public String toString() {
        return "CalendarioVacuna{" + "enfermedad=" + enfermedad + ", dosis=" + dosis + ", edadMascota=" + edadMascota + ", intervaloVacuna=" + intervaloVacuna + ", fechaInicioVacuna=" + fechaInicioVacuna + ", fechaFinalVacuna=" + fechaFinalVacuna + '}';
    }
    
}
