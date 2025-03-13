package personas;

import material.MaterialBibliografico;

import java.util.ArrayList;

public class Biblioteca {

    private String nombre;
    private ArrayList catalogo;
    private ArrayList socios;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.catalogo=new ArrayList<>();
        this.socios=new ArrayList<>();
    }

    public void registrarMaterial(MaterialBibliografico material){
        catalogo.add(material);
        System.out.println("Material" + material.getTitulo() + " registrado con id" + material.getCodigoCatalogo());
    }

    public void registrarSocio(Socio socio){
        socios.add(socio);
        System.out.println("Socio" + socio.getNombre() + " registrado con id" + socio.getIdSocio());
    }

    public void prestarMaterial(String codigoCatalogo, int idSocio){
        MaterialBibliografico encontrado = buscarMaterial(codigoCatalogo);
        Socio socio = buscarSocio(idSocio);

        if (encontrado == null) {
            System.out.println("No se encuentra el material con código " + codigoCatalogo);
            return;
        }
        if (socio == null) {
            System.out.println("No se encuentra el socio con ID " + idSocio);
            return;
        }

        // APLICAMOS INSTANCEOF:
        if (encontrado instanceof IPrestable) {
            IPrestable prestable = (IPrestable) encontrado;
            // Delegamos en socio.prestarMaterial(...)
            socio.prestarMaterial(prestable);
        } else {
            System.out.println("El material " + encontrado.getTitulo()
                    + " no es prestable (ej. podría ser un objeto no implementado).");
        }
    }

    private Socio buscarSocio(int idSocio) {
        return null;
    }

    public void devolverMaterial(String codigoCatalogo){

    }

    public void listarMateriales(){

    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", catalogo=" + catalogo +
                ", socios=" + socios +
                '}';
    }
}
