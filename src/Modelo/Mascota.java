package Modelo;

import java.io.Serializable;

public class Mascota {
    private Especie especie;
    private String raza;
    private static int contador=0;
    private int codigo;
    private String nombre;
    private ClienteFamilia dueño;
    private String colorPelo;
    private String fechaNacimiento;
    private float talla;
    private float peso;
    private HistorialMedico HistorialMascota;
    //private CitasArreglo citas;
    private CalendarioVacuna vacunasDesignadas;
    //private historialMedico
    

    public Mascota(String nombre, Especie especie, String raza,String colorPelo, String fechaNacimiento) {//falta pelo, fecha nacimiento
        this.codigo = contador;
        contador++;
        this.nombre = nombre;
        this.especie=especie;
        this.raza=raza;
        this.colorPelo=colorPelo;
        this.fechaNacimiento=fechaNacimiento;
        this.HistorialMascota=new HistorialMedico(this);
        this.vacunasDesignadas= new CalendarioVacuna(especie);
    }

    
    public void registrarInyeccionHistorial(InyeccionVacuna inyeccion){
        HistorialMascota.añadirInyeccines(inyeccion);
    }
    
    public void registrarCitaHistorial(Citas cita){
        HistorialMascota.añadirCitas(cita);
    }
    
    public String mostrarHistorialmedico(){
        return HistorialMascota.mostrarHistorial();
    }
    
    
    public void revisarEstado(){
        
    }
    
    public String mostrarVacunas(){
        return vacunasDesignadas.CalendarioVacunas();
    }

    public void vacunar(int numeroVacuna){//el numero de la vacuna que deseas colocar
        if(vacunasDesignadas.devolverVacunas()[numeroVacuna].isRecurrente()==false){
            vacunasDesignadas.devolverVacunas()[numeroVacuna].setEstado(true);
        }else{
            vacunasDesignadas.devolverVacunas()[numeroVacuna].aumentarAplicacionesAnuales();
        }
        
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getRaza() {
        return raza;
    }
    
    public String getEspecie() {
        return especie.getNombreEspecie();
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTalla() {
        return talla;
    }

    public void setTalla(float talla) {
        this.talla = talla;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public ClienteFamilia getDueño() {
        return dueño;
    }

    public void setDueño(ClienteFamilia dueño) {
        this.dueño = dueño;
    }

    public CalendarioVacuna getVacunasDesignadas() {
        return vacunasDesignadas;
    }

    public void setVacunasDesignadas(CalendarioVacuna vacunasDesignadas) {
        this.vacunasDesignadas = vacunasDesignadas;
    }
    

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
    
}
