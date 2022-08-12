
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
    public void mostrarHistorialMedico(){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("HISTORIAL MEDICO DE "+mascota.getNombre()+": ");
        System.out.println("El dueño de esta mascota es: "+mascota.getDueño().getApellido_Familia());
        System.out.println("--------------------------------------------------------------------------");
        mostrarCitasRegistradas();
        System.out.println("--------------------------------------------------------------------------");
        mostrarInyeccionesRegistradas();
        System.out.println("--------------------------------------------------------------------------");
        //mostrar peso y talla actual
        
    }
    public void mostrarCitasRegistradas(){
        System.out.println("Citas de son :");
        System.out.println(citas.toString());
    }
    
    public void mostrarInyeccionesRegistradas(){
        System.out.println("Las inyecciones son");
        System.out.println(inyecciones.toString());
    } 
}