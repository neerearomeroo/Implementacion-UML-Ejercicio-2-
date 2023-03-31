/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementacion.uml.ejercicio.pkg3;

/**
 *
 * @author Nerea Romero
 */
public class Prestamo {
    private Bibliotecario bibliotecario;
    private Socio socio;
    private Libro libro;
    private String fecha;

    public Prestamo(Bibliotecario bibliotecario, Socio socio, Libro libro, String fecha) {
        this.bibliotecario = bibliotecario;
        this.socio = socio;
        this.libro = libro;
        this.fecha = fecha;
    }

}