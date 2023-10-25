/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colegiado;

/**
 *
 * @author Ignacio
 */
public class Spotify {
    public int idCancion;  //atributos
    public String titulo;
    public String autor;
    public int duracion;
    public int anioCreacion;
    
    
    public Spotify(int idCancion, String titulo, String autor, int duracion, int anioCreacion) {
        this.idCancion = idCancion; //constructores
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.anioCreacion = anioCreacion;
    }
      
    
    public int getIdCancion() { // los getters y setters, métodos
        return idCancion;
    }

    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }
}
