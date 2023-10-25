/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colegiado;

/**
 *
 * @author Ignacio
 */
public class Colegiado {

    /**
     * 1- Ejemplo de uso
     * 2- getters
     * 3- setters
     */
    public static void main(String[] args) {
        // 1-
        Spotify spotify = new Spotify(1, "¿Y cómo es el?", "Marc Anthoy", 4, 2010);

        // 2-
        System.out.println("Título de la canción: " + spotify.getTitulo());
        System.out.println("Nombre del autor: " + spotify.getAutor());
        System.out.println("Duración de la canción: " + spotify.getDuracion() + " minutos");
        System.out.println("Año de creación: " + spotify.getAnioCreacion());
        
        System.out.println("");

        // 3-
        spotify.setTitulo("Nombre de la nueva canción");
        spotify.setAutor("Nombre del autor de la nueva canción");
        spotify.setDuracion(0);
        spotify.setAnioCreacion(0);
        System.out.println("Nueva canción: " + spotify.getTitulo());
        System.out.println("Título de la canción: " + spotify.getTitulo());
        System.out.println("Nombre del autor: " + spotify.getAutor());
        System.out.println("Duración de la nueva canción: " + spotify.getDuracion() + " minutos");
        System.out.println("Año de creación de la nueva canción: " + spotify.getAnioCreacion());
    }
    }
