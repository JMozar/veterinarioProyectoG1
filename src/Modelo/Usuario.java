
package Modelo;

public class Usuario {
    
    //Cambien las variables     
    private String Usuario;
    private String Clave;
    private boolean Estado;

    public Usuario(String Usuario, String Clave) {
        this.Usuario = Usuario;
        this.Clave = Clave;
        this.Estado = false;
    }

    public String getUsuario() {
        return Usuario;
    }

    public boolean isActivo() {
        return Estado;
    }

    public boolean ingresar(String user, String password){
        boolean result = false;
        if( this.Usuario.equalsIgnoreCase(user) && 
                this.Clave.equals(password)&&
                !isActivo() ){
            this.Estado = true;
            result = true;
        }            
        return result; 
    }
    
    public boolean salir(){
        boolean result = false;
        if(this.Estado){
            this.Estado = false;
            result = true;
        }
        return result;
    }
    
    
}
