/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementacion.uml.ejercicio.pkg3;

/**
 *
 * @author Nerea Romero
 */
public class Libro {
    private String isbn;
    private String titulo;
    private int numPaginas;
    private String tematica;
    private Autor autor;

    public Libro(String isbn, String titulo, int numPaginas, String tematica, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.numPaginas = numPaginas;
        this.tematica = tematica;
        this.autor = autor;
        
        this.autor.add(this);
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public String getTematica() {
        return tematica;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public void setAutor(Autor autor) {
        this.autor.remove(this);
        
        this.autor = autor;
        
        this.autor.add(this);
    }

    @Override
    public String toString() {
        String cadena = "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", numPaginas=" + numPaginas + ", tematica=" + tematica + ", autor=";
        if (autor != null)
            cadena += autor;
        else
            cadena += "no tiene";
        return  cadena;
    }   
}