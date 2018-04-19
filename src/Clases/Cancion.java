/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Cancion {
    private String titulo;
    private String grupo;
    private String album;
    private int duracion;
   

    public Cancion(String titulo, String grupo, String album, int duracion) {
        this.titulo = titulo;
        this.grupo = grupo;
        this.album = album;
        this.duracion = duracion;
       
    }

    public Cancion(String titulo, String grupo) {
        this.titulo = titulo;
        this.grupo = grupo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    
}
