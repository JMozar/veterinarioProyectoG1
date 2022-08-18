
package Vista;

import Modelo.CalendarioVacuna;
import Modelo.Citas;
import Modelo.ClienteFamilia;
import Modelo.ClientePersona;
import Modelo.Empleado;
import Modelo.Especie;
import Modelo.InyeccionVacuna;
import Modelo.Mascota;
import java.time.LocalDate;



public class Main {
    public static void main(String[] args) {
        //Prueba
        //Creamos especies
        Especie especie1 = new Especie("Perro");
        Especie especie2 = new Especie("Gato");
        //Añadimos familias
        ClienteFamilia familia1 = new ClienteFamilia(5,5,"Moore", "123", "Mz B", "9999999999");
        ClienteFamilia familia2 = new ClienteFamilia(5,5,"Ramos", "133", "Mz C", "9888884657");
        //añadimos personas
        ClientePersona persona1 = new ClientePersona("dx","Salazar","123",978978978);
        ClientePersona persona2 = new ClientePersona("Antonio","Zeta","122",954545454);
        //Creamos empleados
        Empleado empleado1= new Empleado("Veterinario",1200, "Juan", "Perez", "88888888", 912345678);
        //añadimos mascotas
        Mascota mascota1 = new Mascota("Peque",especie1,"Mostaza","12-08-2018");
        Mascota mascota2 = new Mascota("Michi",especie2,"Mostaza","12-08-2018");
        
        
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
        mascota1.mostrarHistorialmedico();
        System.out.println("");
        mascota2.mostrarHistorialmedico();
        mascota2.mostrarVacunas();
        
        System.out.println("Prueba cita");
        Citas cita1=new Citas("Hoy","Diagnostico1","Tratamiento2",empleado1,mascota1,familia1,100,100);
        //añadir cita a historial medico de animal
        
        mascota1.registrarCitaHistorial(cita1);
        
        //mostramos de nuevo el historial
        mascota1.mostrarHistorialmedico();
        //Agregamos una segunda cita
        Citas cita2=new Citas("Mañana","Diagnostico2","Tratamiento3",empleado1,mascota1,familia1,300,200);
        mascota1.registrarCitaHistorial(cita2);
        mascota1.mostrarHistorialmedico();
        
        //Agregamos una inyeccion a la mascota
        InyeccionVacuna inyeccion1 = new InyeccionVacuna(2,"tipo1","Lunes",mascota1,empleado1);
        InyeccionVacuna inyeccion2 = new InyeccionVacuna(2,"tipo2","Martes",mascota1,empleado1);
        mascota1.registrarInyeccionHistorial(inyeccion1);
        mascota1.registrarInyeccionHistorial(inyeccion2);
        mascota1.mostrarHistorialmedico();
        
        System.out.println("");
        System.out.println("Prueba vacunacion");
        System.out.println("");
        mascota1.mostrarVacunas();
        
        mascota1.vacunar(0);
        mascota1.vacunar(1);
        mascota1.vacunar(2);
        //vacunar anuales
        mascota1.vacunar(3);
        mascota1.mostrarVacunas();
        mascota1.vacunar(3);
        
        mascota1.mostrarVacunas();
        
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
    