/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implementacion.uml.ejercicio.pkg3;

/**
 *
 * @author Nerea Romero
 */
public class ImplementacionUMLEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autor a1 = new Autor("77669870C", "Antoine Marie", "Jean-Baptiste", "Roger");
        
        Libro l1 = new Libro("9781234567897","Principito", 120, "infantil", a1);
        
        Bibliotecario b1 = new Bibliotecario("60974755F", "Ana", "Cordoba", "De la Rosa");
        
        Socio s1 = new Socio("03590618L", "Antonio Manuel", "Lopez", "Galvez");
        
        Prestamo p1 = new Prestamo(b1, s1, l1, "15-06-2018");
    }
    
}
