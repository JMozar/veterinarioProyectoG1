package Modelo;

//relacion unidireccional
public class ClientePersonaArreglo {

    private ClientePersona[] ClientePersonas;
    private int indice;

    public ClientePersonaArreglo(int tamano) {
        this.ClientePersonas = new ClientePersona[tamano];
        this.indice = 0;
    }

    public void agregar(ClientePersona persona) {
        this.ClientePersonas[this.indice] = persona;
        this.indice++;
    }
    public ClientePersona[] devolverArreglo(){
        return this.ClientePersonas;
    }
    

    public void eliminar(String DNI) {//codigo es el codigo a eliminar
        int posicion = -1;
        for (int i = 0; i < ClientePersonas.length; i++) {
            if (DNI.equals(this.ClientePersonas[i].getDNI())) {
                posicion = i;
            }
        }
        if (posicion > -1) {
            this.ClientePersonas[posicion] = null;
            rellenarNull(posicion);//mover arreglo
            System.out.println("Se elimino a la persona con DNI " + DNI);
        } else {
            System.out.println("Persona no encontrada");
        }
    }

    //Con esto elimina pero queda null al final
    public void rellenarNull(int x) {
        int numero=0;
        if (x >= 0) {
            for (int i = x; i < ClientePersonas.length - 1; i++) {
                ClientePersonas[i] = ClientePersonas[i + 1];
                ClientePersonas[i + 1] = null;
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
        for (int i = 0; i < this.indice; i++) {
            resultado = resultado + this.ClientePersonas[i] + "\n";
        }

        return resultado;
    }
}