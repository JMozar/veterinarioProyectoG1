
package Modelo;


public class CitasArreglo {
    private Citas[] citas;
    private int indice;
    
    public CitasArreglo (int tamano) {
        this.citas = new Citas[tamano];
        this.indice = 0;
    }
    
    public void agregar(Citas citas){
        this.citas[this.indice] = citas;
        this.indice++; 
    }
    
    public void eliminar(int x) {
        int numero=0;
        if (x >= 0) {
            for (int i = x; i < citas.length - 1; i++) {
                citas[i] = citas[i + 1];
                citas[i + 1] = null;
                numero=i;
            }
            
        }else{
            System.out.println("Posicion invalida");
        }
        indice--;

    }
    
    
    @Override
    public String toString() {
        String resultado = "";
        for(int i=0 ; i < this.indice; i++){
            resultado = resultado + this.citas[i]+"\n";
        }
        return resultado;
    }
    
    
}