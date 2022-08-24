
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
    /*
    public void mostrarHistorialMedico(){
        System.out.println("HOla");
        System.out.println("Historial medico de  "+mascota.getNombre()+": ");
        System.out.println("El dueño de esta mascota es: "+dueño.getApellido_Familia());
        System.out.println(citas.toString());
        //mostrar peso y talla actual
        
    }
    /*/
    public String mostrarHistorial(){
        return "HISTORIAL MEDICO DE "+mascota.getNombre()+": \n+"
                + "El dueño de esta mascota es: "+mascota.getDueño().getApellido_Familia()+"\n"+
                "--------------------------------------------------------------------------"+"\n"+
                mostrarCitasRegistradas()+"\n"+
                "--------------------------------------------------------------------------"+"\n"+
                mostrarInyeccionesRegistradas()+
                "--------------------------------------------------------------------------"+"\n";
    }
    
    public String mostrarCitasRegistradas(){
        return "Citas de son :"+"\n"+
        citas.toString();
    }
    
    public String mostrarInyeccionesRegistradas(){
        return "Las inyecciones son :"+"\n"+
        inyecciones.toString();
    }  
}