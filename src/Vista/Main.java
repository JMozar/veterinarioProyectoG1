
package Vista;


import Modelo.*;
import Datos.*;
import Controlador.*;



public class Main {
    public static void main(String[] args) {
        
        //Prueba
        //Creamos especies
        Especie especie1 = new Especie("Perro");
        Especie especie2 = new Especie("Gato");
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
        Repositorio.empleados.agregar(empleado1);//si no hay empleados sale error
        //añadimos mascotas
        Mascota mascota1 = new Mascota("Peque",especie1,"chiwawa","Mostaza","12-08-2018");
        Mascota mascota2 = new Mascota("Michi",especie2,"unica","Mostaza","12-08-2018");
        
        //REPOSITORIO
        Repositorio.mascotas.agregar(mascota1);//mascota 0
        Repositorio.mascotas.agregar(mascota2);//mascota 1
        
        Repositorio.especies.agregar(especie1);
        Repositorio.especies.agregar(especie2);
        
        Usuario user = new Usuario("admin","123");
        
        //inicio de controlador menu
        ControladorPrincipal controlador = new ControladorPrincipal( user, new frmPrincipal() );
        controlador.iniciar();
        
        
        //agregamos las personas al arreglo de personas
        
        
        familia1.AñadirPersonas(persona1);
        //persona1.AñadirFamilias(familia1);
        
       
        familia1.AñadirPersonas(persona2);
        //persona2.AñadirFamilias(familia1);
        
        familia2.AñadirPersonas(persona1);
        //persona1.AñadirFamilias(familia2);
        
        familia1.mostrarIntegrantes();
        
        System.out.println("");
        familia2.mostrarIntegrantes();
        System.out.println("");
        //persona1.MostrarfamiliasAsignadas();
        //persona2.MostrarfamiliasAsignadas();
        System.out.println("");
        //System.out.println(mascota1.getDueño());
        
        System.out.println("");
        familia1.AñadirMascotas(mascota1);
        
        familia1.mostrarMascotas();
        
        System.out.println("");
        familia2.AñadirMascotas(mascota2);
        familia2.mostrarMascotas();
        System.out.println("");
        //mascota1.setDueño(familia1);
        System.out.println(mascota1.getDueño());
        System.out.println("");
        
        System.out.println("PRUEBAS HISTORIAL MEDICO");
        //mostrar historial medico de la mascota
        System.out.println(mascota1.mostrarHistorialmedico());
        System.out.println("");
        System.out.println(mascota2.mostrarHistorialmedico());
        System.out.println(mascota2.mostrarVacunas());
        
        System.out.println(mascota1.toString());
        System.out.println("Prueba cita");
        Citas cita1=new Citas("Hoy","Diagnostico1","Tratamiento2",empleado1,mascota1,100,100);
        
        mascota1.registrarCitaHistorial(cita1);
        mascota1.setPeso(100);
        mascota1.setTalla(100);
        Repositorio.citas.agregar(cita1);
        
        System.out.println(mascota1.toString());
        
        //mostramos de nuevo el historial
        System.out.println(mascota1.mostrarHistorialmedico());
        //Agregamos una segunda cita
        Citas cita2=new Citas("Mañana","Diagnostico2","Tratamiento3",empleado1,mascota1,300,200);
        mascota1.registrarCitaHistorial(cita2);
        System.out.println(mascota1.mostrarHistorialmedico());
        Repositorio.citas.agregar(cita2);
        
        //Agregamos una inyeccion a la mascota
        InyeccionVacuna inyeccion1 = new InyeccionVacuna(1,"Lunes",mascota1,empleado1);
        InyeccionVacuna inyeccion2 = new InyeccionVacuna(2,"Martes",mascota1,empleado1);
        Repositorio.inyecciones.agregar(inyeccion1);
        Repositorio.inyecciones.agregar(inyeccion2);
        mascota1.registrarInyeccionHistorial(inyeccion1);
        mascota1.registrarInyeccionHistorial(inyeccion2);
        System.out.println(mascota1.mostrarHistorialmedico());
        
        System.out.println("");
        System.out.println("Prueba vacunacion");
        System.out.println("");
        System.out.println(mascota1.mostrarVacunas());
        
        mascota1.vacunar(0);
        mascota1.vacunar(1);
        mascota1.vacunar(2);
        //vacunar anuales
        mascota1.vacunar(3);
        mascota1.mostrarVacunas();
        mascota1.vacunar(3);
        
        System.out.println(mascota1.mostrarVacunas());
        
        System.out.println("");
        
        
        //persona1.EliminarFamiliaAsginadas(1);
        
        //familia1.EliminarPersonaAsginada(1);
        
        familia1.EliminarPersonaAsginada(0);
        
        //persona1.MostrarfamiliasAsignadas();
        System.out.println("");
        
        familia1.mostrarIntegrantes();
        /*
        System.out.println("Prueba Calendarios");
        System.out.println("");
        Especie especie1 = new Especie("Perro");
        Especie especie2 = new Especie("Gato");
        
        CalendarioVacuna calPerro = new CalendarioVacuna(especie1);
        CalendarioVacuna calGato = new CalendarioVacuna(especie2);
        calPerro.mostrarCalendario();System.out.println("");
        calGato.mostrarCalendario();
        */
    }
}
    