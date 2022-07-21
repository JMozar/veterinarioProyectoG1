
package Modelo;

import java.util.Date;


public class Vacuna {
    private String mascota;
    private String numVacuna;
    private String codigoDelPaciente;
    private String tipoDeVacuna;
    private Date fecha;
    

    public Vacuna(String numVacuna, String tipoDeVacuna, Date fecha) {//agregar vacuna
        this.numVacuna = numVacuna;
        this.tipoDeVacuna = tipoDeVacuna;
        this.fecha = fecha;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public String getNumVacuna() {
        return numVacuna;
    }

    public void setNumVacuna(String numVacuna) {
        this.numVacuna = numVacuna;
    }

    public String getCodigoDelPaciente() {
        return codigoDelPaciente;
    }

    public void setCodigoDelPaciente(String codigoDelPaciente) {
        this.codigoDelPaciente = codigoDelPaciente;
    }

    public String getTipoDeVacuna() {
        return tipoDeVacuna;
    }

    public void setTipoDeVacuna(String tipoDeVacuna) {
        this.tipoDeVacuna = tipoDeVacuna;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
