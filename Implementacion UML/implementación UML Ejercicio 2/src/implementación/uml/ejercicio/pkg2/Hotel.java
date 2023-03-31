/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementación.uml.ejercicio.pkg2;

/**
 *
 * @author Nerea Romero
 */
public class Hotel {

    private String nombre;
    private String direccion;
    private int telefono;
    private Habitacion[] habitaciones;

    public Hotel(String nombre, String direccion, int telefono, int numHabitaciones) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.habitaciones = new Habitacion[numHabitaciones];

        for (int i = 0; i < habitaciones.length; i++) {
            habitaciones[i] = Habitacion.getHabitacion("Suit");
        }
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
     * @return the Direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param Direccion the codigo to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
        String cadena = "El hotel: " + this.nombre + " ubicado en: " + this.direccion + " con numero de telefono " + this.telefono + " las habitaciones son: ";
        for (int i = 0; i < habitaciones.length; i++) {
            cadena += "\n" + habitaciones[i];
        }
        return cadena;
    }
}
