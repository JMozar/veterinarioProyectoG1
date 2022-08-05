
package Modelo;


public class MascotaArreglo {
    private Mascota[] mascotas;
    private int indice;
    
    public MascotaArreglo(int tamano) {
        this.mascotas = new Mascota[tamano];
        this.indice = 0;
    }
    
    public void agregar(Mascota mascota){
        this.mascotas[this.indice] = mascota;
        this.indice++; 
    }
    
    @Override
    public String toString() {
        String resultado = "";
        for(int i=0 ; i < this.indice; i++){
            resultado = resultado + this.mascotas[i]+"\n";
        }
        return resultado;
    }
}
