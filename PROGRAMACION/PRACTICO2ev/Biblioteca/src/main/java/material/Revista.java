package material;

import interfaces.IPrestable;
import personas.Socio;

public class Revista extends MaterialBibliografico implements IPrestable {

    private boolean prestado;
    private String nombreSocio;
    private int numero;

    public Revista(String titulo, String autor, String codigoCatalogo, int numero) {
        super(titulo, autor, codigoCatalogo);
        this.numero=numero;
        this.prestado=false;
        this.nombreSocio=nombreSocio;
    }

    @Override
    public void prestar(Socio s) {
        if (!prestado){
            prestado=true;
            nombreSocio=s.getNombre();
            System.out.println("Revista" + getTitulo() + "prestado a " + s.getNombre());
        }else{
            System.out.println("Revista" + getTitulo() + "ya esta prestado a " + s.getNombre());
        }
    }

    @Override
    public void devolver() {
        if (prestado){
            prestado=false;
            System.out.println("Revista" + getTitulo() + "devuelto");
        }else {
            System.out.println("Revista" + getTitulo() + " no esta prestado");
        }
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", codigoCatalogo='" + codigoCatalogo + '\'' +
                ", numero=" + numero +
                ", prestado=" + prestado +
                ", nombreSocio='" + nombreSocio + '\'' +
                '}';
    }
}
