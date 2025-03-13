package material;

import interfaces.IPrestable;
import personas.Socio;

public class Libro extends MaterialBibliografico  implements IPrestable {

    private boolean prestado;
    private String nombreSocio;

    public Libro(String titulo, String autor, String codigoCatalogo) {
        super(titulo, autor, codigoCatalogo);
        this.prestado=false;
        this.nombreSocio=nombreSocio;
    }

    @Override
    public void prestar(Socio s) {
        if (!prestado){
            prestado=true;
            nombreSocio=s.getNombre();
            System.out.println("Libro" + getTitulo() + "prestado a " + s.getNombre());
        }else{
            System.out.println("Libro" + getTitulo() + "ya esta prestado a " + s.getNombre());
        }

    }

    @Override
    public void devolver() {
        if (prestado){
            prestado=false;
            System.out.println("Libro" + getTitulo() + "devuelto");
        }else {
            System.out.println("El libro" + getTitulo() + " no esta prestado");
        }
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", codigoCatalogo='" + codigoCatalogo + '\'' +
                '}';
    }
}
