
package Modelo;


public class ClientePersonaArreglo {
    private ClientePersona[] ClientePersonas;
    private int indice;
    
    public ClientePersonaArreglo(int tamano) {
        this.ClientePersonas = new ClientePersona[tamano];
        this.indice = 0;
    }
    
    public void agregar(ClientePersona persona){
        this.ClientePersonas[this.indice] = persona;
        this.indice++; 
    }
    
    public void eliminar(String DNI){//codigo es el codigo a eliminar
        int posicion = -1;
        for(int i = 0;i<ClientePersonas.length;i++){
            if(DNI.equals(this.ClientePersonas[i].getDNI())){
                posicion=i;
            }
        }
        if(posicion>-1){
            this.ClientePersonas[posicion]=null;
            System.out.println("Se elimino a la persona con DNI "+DNI);
        }else{
            System.out.println("Persona no encontrada");
        }
    }
    
    @Override
    public String toString() {
        String resultado = "";
        for(int i=0 ; i < this.indice; i++){
            resultado = resultado + this.ClientePersonas[i]+"\n";
        }
        return resultado;
    }
}
