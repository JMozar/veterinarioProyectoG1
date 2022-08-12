
package Modelo;


public class ClienteFamiliaArreglo {
    private ClienteFamilia[] ClienteFamilia;
    private int indice;
    
    public ClienteFamiliaArreglo(int tamano) {
        this.ClienteFamilia = new ClienteFamilia[tamano];
        this.indice = 0;
    }
    
    public void agregar(ClienteFamilia familias){
        this.ClienteFamilia[this.indice] = familias;
        this.indice++; 
    }
    
    public void eliminar(int codigo){//codigo es el codigo a eliminar
        int posicion = -1;
        for(int i = 0;i<ClienteFamilia.length;i++){
            if(codigo==(this.ClienteFamilia[i].getCodigo())){
                posicion=i;
            }
        }
        if(posicion>-1){
            this.ClienteFamilia[posicion]=null;
            System.out.println("Se elimino a la familia con codigo "+posicion);
        }else{
            System.out.println("Familia no encontrada");
        }
    }
    
    
    @Override
    public String toString() {
        String resultado = "";
        for(int i=0 ; i < this.indice; i++){
            resultado = resultado + this.ClienteFamilia[i]+"\n";
        }
        return resultado;
    }
}