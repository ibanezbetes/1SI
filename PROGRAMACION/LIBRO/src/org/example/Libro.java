package org.example;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    public boolean disponible;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Libro: " +
                "Título: " + titulo +
                ", autor: '" + autor +
                ", año de publicación: " + anioPublicacion +
                ", Disponible: " + disponible +
                '.';
    }
}
