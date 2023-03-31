/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementacion.uml.ejercicio.pkg1;

import java.util.*;

/**
 *
 * @author Nerea Romero
 */
public class Empleado {

    private static int codigoOpcional = 0;
    private String codigo;
    private String dni;
    private String nss;
    private int telefono;
    private String nombre;
    private String direccion;
    private Departamento departamento;

    public Empleado(String dni, String nss, int telefono, String nombre, String direccion, Departamento departamento) {
        this.codigo = codigoOpcional + "";
        this.dni = dni;
        this.nss = nss;
        this.telefono = telefono;
        this.nombre = nombre;
        this.direccion = direccion;
        this.departamento = departamento;
        this.departamento.add(this);
        codigoOpcional++;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the Dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param Dni the codigo to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the Nss
     */
    public String getNss() {
        return nss;
    }

    /**
     * @param Nss the codigo to set
     */
    public void setNss(String nss) {
        this.nss = nss;
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
     * @return the Departamento
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * @param Departamento the codigo to set
     */
    public void setDepartamento(Departamento departamento) {
        this.departamento.remove(this);

        this.departamento = departamento;

        this.departamento.add(this);
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }
        if (objeto == null) {
            return false;
        }
        if (getClass() != objeto.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) objeto;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return Objects.equals(this.nss, other.nss);
    }

    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + getCodigo() + ", dni=" + dni + ", nss=" + nss + ", telefono=" + telefono + ", nombre=" + nombre + ", direccion=" + direccion + ", departamento=" + departamento.getNombre() + '}';
    }
}