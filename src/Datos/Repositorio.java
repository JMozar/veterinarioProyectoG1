
package Datos;

import Modelo.ClienteFamiliaArreglo;
import Modelo.ClientePersonaArreglo;
import Modelo.EmpleadoArreglo;
import Modelo.EspecieArreglo;
import Modelo.InyeccionVacunaArreglo;
import Modelo.MascotaArreglo;


public class Repositorio {
    public static MascotaArreglo mascotas = new MascotaArreglo(10);
    public static ClienteFamiliaArreglo familias = new ClienteFamiliaArreglo(5);
    public static ClientePersonaArreglo personas = new ClientePersonaArreglo(5);
    public static EmpleadoArreglo empleados = new EmpleadoArreglo(10);
    public static InyeccionVacunaArreglo inyecciones = new InyeccionVacunaArreglo(10);
    public static EspecieArreglo especies = new EspecieArreglo(2);
    
}
