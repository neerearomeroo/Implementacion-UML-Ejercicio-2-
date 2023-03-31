/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementacion.uml.ejercicio.pkg1;

import java.util.Arrays;

/**
 *
 * @author Nerea Romero
 */
public class Departamento {

    private String nombre;
    private String localizacion;
    private int telefono;
    private Empleado[] empleados;
    private int numElementos = 0;

    public Departamento(String nombre, String localizacion, int telefono) {
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.telefono = telefono;
        empleados = new Empleado[0];
    }

    public void add(Empleado empleado) {
        empleados = Arrays.copyOf(empleados, (empleados.length + 1));
        empleados[numElementos] = empleado;
        numElementos++;
    }

    private int posicionEmpleado(Empleado empleado) {
        for (int i = 0; i < numElementos; i++) {
            if (empleado.equals(empleados[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean remove(Empleado empleado) {
        int posicion = posicionEmpleado(empleado);
        if (posicion > -1) {
            for (int i = posicion; i < numElementos - 1; i++) {
                empleados[i] = empleados[(i + 1)];
            }
            numElementos--;
            return true;
        }
        return false;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param Nombre the codigo to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the Localizacion
     */
    public String getLocalizacion() {
        return localizacion;
    }

    /**
     * @param Localizacion the codigo to set
     */
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    /**
     * @return the Telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param Telefono the codigo to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        String cadena = "Departamento: " + this.nombre + " localizado en: " + this.localizacion + " con número de teléfono: " + this.telefono + " son: ";
        for (int i = 0; i < numElementos; i++) {
            cadena += "\n" + empleados[i].toString();

        }
        return cadena;
    }
}
