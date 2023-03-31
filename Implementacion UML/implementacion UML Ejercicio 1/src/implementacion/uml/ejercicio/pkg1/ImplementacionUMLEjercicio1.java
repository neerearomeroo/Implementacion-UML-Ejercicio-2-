/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implementacion.uml.ejercicio.pkg1;

/**
 *
 * @author Nerea Romero
 */
public class ImplementacionUMLEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Departamento depart1 = new Departamento("Oficina", "Barcelona", 687244802);
        Departamento depart2 = new Departamento("Marketing", "Madrid", 665250520);

        Empleado empl1 = new Empleado("77669870C", "048e", 123456789, "Paco", "Calle x", depart1);
        Empleado empl2 = new Empleado("49291910D", "f450", 123456789, "Carmen", "Calle y", depart2);

        System.out.println("-- DEPARTAMENTO --");
        System.out.println(depart1);
        System.out.println(depart2);

        System.out.println("\n\n-- EMPLEADO --");
        System.out.println(empl1);
        System.out.println(empl2);
    }
}
