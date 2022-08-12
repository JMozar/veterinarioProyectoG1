
package Modelo;


public class ClientePersona extends Persona{
    private static int contador=0;
    private int codigo;

    //private ClienteFamiliaArreglo familias;//una persona puede pertenecer a varias familias


    public ClientePersona(String nombre, String apellido, String DNI, int telefono) {
        super(nombre, apellido, DNI, telefono);
        this.codigo=contador;
        contador++;
    }

    //get y set que no dependen de otros objetos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    
    //
    //Agregar familia a la que corresponde
    /*
    public void AñadirFamilias(ClienteFamilia familia) {
        this.familias.agregar(familia);
        //familia.AñadirPersonas(this);//indicarle a la familia que este integrante le corresponde(creo que no va)
        
    }
    
    public void EliminarFamiliaAsginadas(int codigo){
        this.familias.eliminar(codigo);
        
    }*/
    
    @Override
    public String toString() {
        String resultado="";
        if(this!=null){
            resultado="ClientePersona{" + "nombre=" + nombre + ", DNI=" + DNI + '}';
        }
        return resultado;
    }
    //"ClientePersona{" + "nombre=" + nombre + ", DNI=" + DNI + '}';
    /*
    public void MostrarfamiliasAsignadas() {
        System.out.println("La familia(s) a la que pertenece "+nombre+" es: ");
        System.out.println(familias);
        //this.integrantesFamilia.toString();
    }
    */
    @Override
    public void validar() {
    }
    //atributos 
    
    //metodos
}