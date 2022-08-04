
package Modelo;

//abstract como del profe
public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String DNI;
    protected long telefono;
    
    
    //constructor, get ,set, validar que no estee vacio

    public Persona(String nombre, String apellido, String DNI, int telefono, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.telefono = telefono;
              
    }
    
    //public abstract void validar(); nimbrado  nomas

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public abstract void validar();
    
}
