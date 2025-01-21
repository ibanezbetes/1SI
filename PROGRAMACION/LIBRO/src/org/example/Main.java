package org.example;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 1605);
        Libro libro2 = new Libro("1984", "George Orwell", 1949);
        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);

        Biblioteca.agregarLibro(libro1);
        Biblioteca.agregarLibro(libro2);
        Biblioteca.agregarLibro(libro3);

        Biblioteca.listarLibros();

        Biblioteca.prestarLibro("1984");
        Biblioteca.listarLibros();

        Biblioteca.devolverLibro("1984");
        Biblioteca.listarLibros();
    }
}
