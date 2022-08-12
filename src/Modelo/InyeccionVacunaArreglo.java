
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
    
    public void eliminar(int codigo){//codigo es el codigo de la cita a eliminar
        int posicion = -1;
        for(int i = 0;i<inyecciones.length;i++){
            if(codigo==(this.inyecciones[i].getCodigo())){
                posicion=i;
            }
        }
        if(posicion>-1){
            this.inyecciones[posicion]=null;
            System.out.println("Se elimino la inyeccion con codigo "+posicion);
        }else{
            System.out.println("Inyeccion no encontrada");
        }
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
