
package Modelo;


public class ClientePersona extends Persona{
    private static int contador=0;
    private int codigo;

    public ClientePersona(String nombre, String apellido, String DNI, int telefono) {
        super(nombre, apellido, DNI, telefono);
        this.codigo=contador;
        contador++;
    }

    
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
        String resultado="";
        if(this!=null){
            resultado="ClientePersona{" + "nombre=" + nombre + ", DNI=" + DNI + '}';
        }
        return resultado;
    }

    

}