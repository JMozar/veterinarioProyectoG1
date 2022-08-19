
package Datos;

import Modelo.ClienteFamiliaArreglo;
import Modelo.ClientePersonaArreglo;
import Modelo.EspecieArreglo;
import Modelo.MascotaArreglo;


public class Repositorio {
    public static MascotaArreglo mascotas = new MascotaArreglo(5);
    public static ClienteFamiliaArreglo familias = new ClienteFamiliaArreglo(5);
    public static ClientePersonaArreglo personas = new ClientePersonaArreglo(5);
    
    public static EspecieArreglo especies = new EspecieArreglo(2);
    
}
