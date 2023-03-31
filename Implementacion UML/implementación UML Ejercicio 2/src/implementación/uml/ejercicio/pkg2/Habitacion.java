/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementación.uml.ejercicio.pkg2;

/**
 *
 * @author Nerea Romero
 */
public class Habitacion {

    private static int numerodeHabitacion = 1;
    private int numHabitacion;
    private String nombre;
    private boolean wc;

    public Habitacion(String nombre, boolean wc) {
        this.numHabitacion = numerodeHabitacion++;
        this.nombre = nombre;
        this.wc = wc;
    }

    /**
     * @return the NumHabitacion
     */
    public int getNumHabitacion() {
        return numHabitacion;
    }

    /**
     * @param Nombre the codigo to set
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the wc
     */
    public boolean isWc() {
        return wc;
    }

    /**
     * @param wc the codigo to set
     */
    public void setWc(boolean wc) {
        this.wc = wc;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "numHabitacion=" + numHabitacion + ", nombre=" + nombre + ", wc=" + wc + '}';
    }

    public static Habitacion getHabitacion(String nombre) {
        int wc = (int) (Math.random() * 1 + 1);

        switch (wc) {
            case 1 -> {
                Habitacion devolver = new Habitacion(nombre, true);
                return devolver;
            }
            case 2 -> {
                Habitacion devolver = new Habitacion(nombre, false);
                return devolver;
            }
        }
        Habitacion devolver = new Habitacion(nombre, true);
        return devolver;
    }
}
