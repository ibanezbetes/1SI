package cosas;

public abstract class RecursoAudiovisual {

    protected String titulo;
    protected String director;
    protected String codigo;

    public RecursoAudiovisual(String titulo, String director, String codigo) {
        this.titulo = titulo;
        this.director = director;
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "RecursoAudiovisual{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}


