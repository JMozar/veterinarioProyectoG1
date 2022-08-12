package Modelo;

import java.util.Date;

public class Mascota {
    private Especie especie;
    private Raza raza;
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
    

    public Mascota(String nombre, Especie especie, String colorPelo, String fechaNacimiento) {//falta pelo, fecha nacimiento
        this.codigo = contador;
        contador++;
        this.nombre = nombre;
        this.especie=especie;
        this.colorPelo=colorPelo;
        this.fechaNacimiento=fechaNacimiento;
        this.HistorialMascota=new HistorialMedico(this,dueño);
        this.vacunasDesignadas= new CalendarioVacuna(especie);
    }

    
    public void registrarInyeccionHistorial(InyeccionVacuna inyeccion){
        HistorialMascota.añadirInyeccines(inyeccion);
    }
    
    public void registrarCitaHistorial(Citas cita){
        HistorialMascota.añadirCitas(cita);
    }
    public void mostrarHistorialmedico(){
        HistorialMascota.mostrarHistorialMedico();
    }
    
    
    public void revisarEstado(){
        
    }
    
    public void mostrarVacunas(){
        System.out.println("Estado de vacunas de "+this.nombre+": ");
        vacunasDesignadas.mostrarCalendario();
    }
    /*
    public void vacunar(int numeroVacuna){//el numero de la vacuna que deseas colocar
        vacunasDesignadas.devolverVacunasDesignadas()[numeroVacuna].setEstado(true);
    }
    */
    public void vacunar(int numeroVacuna){//el numero de la vacuna que deseas colocar
        if(vacunasDesignadas.devolverVacunas()[numeroVacuna].isRecurrente()==false){
            vacunasDesignadas.devolverVacunas()[numeroVacuna].setEstado(true);
        }else{
            vacunasDesignadas.devolverVacunas()[numeroVacuna].aumentarAplicacionesAnuales();
        }
        
    }
    
    //añadir metodos(añadir, eliminar, ) o busquen p
    //validar codigo que sea numero o que se aumente automticamente
    //saberedad de mascota en meses

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //get y set de talla y peso que sera modificado en cada cita

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
    

    @Override
    public String toString() {
        return "Mascota{" + "codigo=" + codigo + ", nombre=" + nombre + ", especie="+especie+'}';
    }
    
    
    
}
