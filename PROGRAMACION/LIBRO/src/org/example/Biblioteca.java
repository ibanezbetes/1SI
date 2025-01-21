package org.example;

public class Biblioteca {
    private static final int CAPACIDAD = 10;
    private static Libro[] libros = new Libro[CAPACIDAD];
    private static int contadorLibros = 0;

    public static void agregarLibro(Libro libro) {
        if (contadorLibros < CAPACIDAD) {
            libros[contadorLibros] = libro;
            contadorLibros++;
        } else {
            System.out.println("SIN ESPACIO");
        }
    }

    public static void listarLibros() {
        for (Libro libro : libros) {
            if (libro != null) {
                System.out.println(libro.toString());
            }
        }
    }

    public static Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro != null && libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public static void prestarLibro(String titulo) {
        Libro libro = buscarLibro(titulo);
        if (libro != null && libro.disponible) {
            libro.disponible = false;
            System.out.println("El libro " + titulo + " ha sido prestado.");
        } else {
            System.out.println("El libro " + titulo + " no está disponible.");
        }
    }

    public static void devolverLibro(String titulo) {
        Libro libro = buscarLibro(titulo);
        if (libro != null && !libro.disponible) {
            libro.disponible = true;
            System.out.println("El libro " + titulo + " ha sido devuelto.");
        } else {
            System.out.println("El libro " + titulo + " está disponible.");
        }
    }
}
