public class Cancion {
    // Atributos privados
    private String autor;
    private String titulo;
    private String genero;
    private int anio;

    // Constructor que inicializa todos los atributos
    public Cancion(String autor, String titulo, String genero, int anio) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
    }

    // Constructor por defecto (opcional)
    public Cancion() {
        // Puedes asignar valores por defecto si lo deseas
    }

    // Getters y Setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Método toString para imprimir la información de la canción
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Género: " + genero + ", Año: " + anio;
    }
}
