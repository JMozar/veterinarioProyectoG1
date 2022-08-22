
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
    
    public void eliminar(int x) {
        int numero=0;
        if (x >= 0) {
            for (int i = x; i < ClienteFamilia.length - 1; i++) {
                ClienteFamilia[i] = ClienteFamilia[i + 1];
                ClienteFamilia[i + 1] = null;
                numero=i;
            }
            
        }else{
            System.out.println("Posicion invalida");
        }
        indice--;

    }
    
    public ClienteFamilia[] devolverIntegrantes(){
        return this.ClienteFamilia;
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
