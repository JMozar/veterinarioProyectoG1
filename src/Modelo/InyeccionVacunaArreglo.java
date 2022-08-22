
package Modelo;


public class InyeccionVacunaArreglo {
    private InyeccionVacuna[] inyecciones;
    private int indice;
    
    public InyeccionVacunaArreglo(int tamano) {
        this.inyecciones = new InyeccionVacuna[tamano];
        this.indice = 0;
    }
    
    public void agregar(InyeccionVacuna inyecciones){
        this.inyecciones[this.indice] = inyecciones;
        this.indice++;
    }
    
    public void eliminar(int x) {
        int numero=0;
        if (x >= 0) {
            for (int i = x; i < inyecciones.length - 1; i++) {
                inyecciones[i] = inyecciones[i + 1];
                inyecciones[i + 1] = null;
                numero=i;
            }
            //System.out.println(ClientePersonas[numero].getNombre()+" fue eliminado.");
        }else{
            System.out.println("Posicion invalida");
        }
        indice--;

    }
    
    
    @Override
    public String toString() {
        String resultado = "";
        for(int i=0 ; i < this.indice; i++){
            resultado = resultado + this.inyecciones[i]+"\n";
        }
        return resultado;
    }
    
    
}