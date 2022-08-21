
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
    
    public void eliminar(int codigo){//codigo es el codigo de la cita a eliminar
        int posicion = -1;
        for(int i = 0;i<citas.length;i++){
            if(codigo==(this.citas[i].getCodigo())){
                posicion=i;
            }
        }
        if(posicion>-1){
            this.citas[posicion]=null;
            System.out.println("Se elimino la cita con codigo "+posicion);
        }else{
            System.out.println("Cita no encontrada");
        }
        
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