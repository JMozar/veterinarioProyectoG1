
package Vista;


import Modelo.*;
import Datos.*;
import Controlador.*;
import Librerias.Serializar;



public class Main {
    public static void main(String[] args) {
        /*
        //usuarios
        Repositorio.usuarios.agregar(new Usuario("admin","123"));
        Repositorio.usuarios.agregar(new Usuario("abc","123"));
        Serializar.serializar("datosUsuarios.txt", Repositorio.usuarios);
        */
        //LOS USUARIOS estan serializados
        
        Especie especie1 = new Especie("Perro");
        Especie especie2 = new Especie("Gato"); 
        Repositorio.especies.agregar(new Especie("Perro"));
        Repositorio.especies.agregar(new Especie("Gato"));
        
        //Añadimos familias
        ClienteFamilia familia1 = new ClienteFamilia(5,5,"Moore", "123", "Mz B", "9999999999");
        ClienteFamilia familia2 = new ClienteFamilia(5,5,"Ramos", "133", "Mz C", "9888884657");
        Repositorio.familias.agregar(familia1);
        Repositorio.familias.agregar(familia2);
        //añadimos personas
        ClientePersona persona1 = new ClientePersona("dx","Salazar","123",978978978);
        ClientePersona persona2 = new ClientePersona("Antonio","Zeta","122",954545454);
        Repositorio.personas.agregar(persona1);
        Repositorio.personas.agregar(persona2);
        //Creamos empleados
        Empleado empleado1= new Empleado("Veterinario",1200, "Juan", "Perez", "88888888", 912345678);
        Repositorio.empleados.agregar(empleado1);
        //añadimos mascotas
        Mascota mascota1 = new Mascota("Peque",especie1,"chiwawa","Mostaza","12-08-2018");
        Mascota mascota2 = new Mascota("Michi",especie2,"unica","Mostaza","12-08-2018");
        Mascota mascota3 = new Mascota("Fido",especie1,"unica","Negro","12-08-2018");
        Repositorio.mascotas.agregar(mascota1);//mascota 0
        Repositorio.mascotas.agregar(mascota2);//mascota 1
        Repositorio.mascotas.agregar(mascota3);//mascota 1
      
        familia1.AñadirMascotas(mascota1); 
        familia2.AñadirMascotas(mascota2);

        //Historial medico
        
        //Primera cita
        Citas cita1=new Citas("12-08-2018","Diagnostico1","Tratamiento2",empleado1,mascota1,100,100);
        mascota1.registrarCitaHistorial(cita1);
        mascota1.setPeso(100);
        mascota1.setTalla(100);
        Repositorio.citas.agregar(cita1);

        //Agregamos una segunda cita
        Citas cita2=new Citas("12-08-2018","Diagnostico2","Tratamiento3",empleado1,mascota1,300,200);
        mascota1.registrarCitaHistorial(cita2);
        Repositorio.citas.agregar(cita2);
        
        //Inyecciones
        InyeccionVacuna inyeccion1 = new InyeccionVacuna(1,"12-08-2018",mascota1,empleado1);
        InyeccionVacuna inyeccion2 = new InyeccionVacuna(2,"12-08-2018",mascota1,empleado1);
        InyeccionVacuna inyeccion3 = new InyeccionVacuna(4,"12-08-2018",mascota1,empleado1);
        Repositorio.inyecciones.agregar(inyeccion1);
        Repositorio.inyecciones.agregar(inyeccion2);
        Repositorio.inyecciones.agregar(inyeccion3);
        mascota1.registrarInyeccionHistorial(inyeccion1);
        mascota1.registrarInyeccionHistorial(inyeccion2);
        mascota1.registrarInyeccionHistorial(inyeccion3); 
       //vacunaciones 
        mascota1.vacunar(0);
        mascota1.vacunar(1);
        //vacunar anuales
        mascota1.vacunar(3);
        mascota1.vacunar(3);
        
        //Deserializamos los usuarios registrados
        Repositorio.usuarios =  (UsuarioArreglo)Serializar.deserializar("datosUsuarios.txt");
        
        //inicio de controlador Sistema(Login)
        ControladorSistema controlador = new ControladorSistema( Repositorio.usuarios, new frmSistema() );
        controlador.iniciar();

 
    }
}
    