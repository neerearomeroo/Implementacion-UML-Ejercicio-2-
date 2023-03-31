/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementacion.uml.ejercicio.pkg3;

import java.util.Arrays;

/**
 *
 * @author Nerea Romero
 */
public class Autor {
    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Libro[] librosEscritos;
    private int numElementos;

    public Autor(String dni, String nombre, String apellido1) {
        this(dni, nombre, apellido1, "no tiene");
    }

    public Autor(String dni, String nombre, String apellido1, String apellido2) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        librosEscritos = new Libro[0];
    }

    public void add(Libro libro) {
        librosEscritos = Arrays.copyOf(librosEscritos, (librosEscritos.length + 1));
        librosEscritos[numElementos] = libro;
        numElementos++;
    }

    private int posicionEmpleado(Libro libro) {
        for (int i = 0; i < numElementos; i++) {
            if (libro.equals(librosEscritos[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean remove(Libro libro) {
        int posicion = posicionEmpleado(libro);
        if (posicion > -1) {
            for (int i = posicion; i < numElementos - 1; i++) {
                librosEscritos[i] = librosEscritos[(i + 1)];
            }
            numElementos--;
            return true;
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    @Override
    public String toString() {
        String cadena = "Autor{" + "dni=" + dni + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", ha escrito: " + numElementos + " libros }";
        for (int i = 0; i < numElementos; i++) {
            cadena += "\n" + librosEscritos[i].getTitulo();
        }
        return cadena;
    }
}
