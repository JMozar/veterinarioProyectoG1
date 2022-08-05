
package Modelo;


public class ClientePersona extends Persona{
    
    //private String nombre;
    //private int DNI;

    private ClienteFamiliaArreglo familias;//una persona puede pertenecer a varias familias

    //Constructor
    /*
    public ClientePersona(String nombre, int DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.familias = new ClienteFamiliaArreglo(2);
    }/*/

    public ClientePersona(String nombre, String apellido, String DNI, int telefono) {
        super(nombre, apellido, DNI, telefono);
    }

    
    

    //get y set que no dependen de otros objetos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*public int getDNI() {
        return DNI;
    }*/

    /*public void setDNI(int DNI) {
        this.DNI = DNI;
    }*/

    
    //Agregar familia a la que corresponde
    public void AñadirFamilias(ClienteFamilia familia) {
        this.familias.agregar(familia);
        //familia.AñadirPersonas(this);//indicarle a la familia que este integrante le corresponde(creo que no va)
        
    }
    
    public void EliminarFamiliaAsginadas(int codigo){
        this.familias.eliminar(codigo);
        
    }
    
    

    @Override
    public String toString() {
        return "ClientePersona{" + "nombre=" + nombre + ", DNI=" + DNI + '}';
    }

    public void MostrarfamiliasAsignadas() {
        System.out.println("La familia(s) a la que pertenece "+nombre+" es: ");
        System.out.println(familias.toString());
        //this.integrantesFamilia.toString();
    }

    @Override
    public void validar() {
    }
    //atributos 
    
    //metodos
}
