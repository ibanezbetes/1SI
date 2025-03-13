package material;

public class MaterialBibliografico {

    protected String titulo;
    protected String autor;
    protected String codigoCatalogo;

    public MaterialBibliografico(String titulo, String autor, String codigoCatalogo) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigoCatalogo = codigoCatalogo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCodigoCatalogo() {
        return codigoCatalogo;
    }

    @Override
    public String toString() {
        return "MaterialBibliografico{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", codigoCatalogo='" + codigoCatalogo + '\'' +
                '}';
    }
}
