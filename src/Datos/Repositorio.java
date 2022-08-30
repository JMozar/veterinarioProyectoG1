
package Datos;

import Modelo.ClienteFamiliaArreglo;
import Modelo.ClientePersonaArreglo;
import Modelo.EmpleadoArreglo;
import Modelo.EspecieArreglo;
import Modelo.InyeccionVacunaArreglo;
import Modelo.MascotaArreglo;
import Modelo.CitasArreglo;
import Modelo.Usuario;
import Modelo.UsuarioArreglo;

public class Repositorio {
    public static UsuarioArreglo usuarios = new UsuarioArreglo(3);
    public static Usuario usuario_validado;
    public static MascotaArreglo mascotas = new MascotaArreglo(10);
    public static ClienteFamiliaArreglo familias = new ClienteFamiliaArreglo(5);
    public static ClientePersonaArreglo personas = new ClientePersonaArreglo(5);
    public static EmpleadoArreglo empleados = new EmpleadoArreglo(10);
    public static InyeccionVacunaArreglo inyecciones = new InyeccionVacunaArreglo(10);
    public static EspecieArreglo especies = new EspecieArreglo(2);
    public static CitasArreglo citas= new CitasArreglo(100);
}
