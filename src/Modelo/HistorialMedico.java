
package Modelo;


public class HistorialMedico {

    private Mascota mascota;
    private ClienteFamilia dueño;
    private CitasArreglo citas;//arreglo de citas
    private InyeccionVacunaArreglo inyecciones;//areglo de inyecciones
    
    //agregar citas
    //mostrar citas de un paciente

    public HistorialMedico (Mascota mascota, ClienteFamilia dueño) {
        this.mascota = mascota;
        this.dueño = dueño;
        this.citas = new CitasArreglo(5);
        this.inyecciones = new InyeccionVacunaArreglo(5);
    }
    
    public void añadirCitas(Citas cita){
        this.citas.agregar(cita);
    }
    public void añadirInyeccines(InyeccionVacuna inyeccion){
        this.inyecciones.agregar(inyeccion);
    }

    public String mostrarHistorial(){
        return  "El dueño de esta mascota es la familia : "+mascota.getDueño().getApellido_Familia()+"\n"+
                "--------------------------------------------------------------------------"+"\n"+
                mostrarCitasRegistradas()+
                "--------------------------------------------------------------------------"+"\n"+
                mostrarInyeccionesRegistradas()+
                "--------------------------------------------------------------------------"+"\n";
    }
    
    public String mostrarCitasRegistradas(){
        return "Registro de citas :"+"\n"+
        citas.toString();
    }
    
    public String mostrarInyeccionesRegistradas(){
        return "Registro de inyecciones :"+"\n"+
        inyecciones.toString();
    }  
}