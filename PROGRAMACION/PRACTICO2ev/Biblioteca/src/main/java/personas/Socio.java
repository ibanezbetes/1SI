package personas;

import interfaces.IPrestable;

import java.util.ArrayList;

public class Socio {

    private String nombre;
    private int idSocio;
    private ArrayList materialesPrestados;

    public Socio(String nombre, int idSocio) {
        this.nombre = nombre;
        this.idSocio = idSocio;
        this.materialesPrestados=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void prestarMaterial(IPrestable material){
        if (!material.estaPrestado()) {
            material.prestar(this);
            // Si prestar(...) fue exitoso, agregamos a la lista del socio.
            if (material.estaPrestado()) {
                materialesPrestados.add(material);
            }
        } else {
            System.out.println("Este material ya está prestado. No se puede agregar a la lista de " + nombre);
        }
    }

    public void devolverMaterial(IPrestable material){
        if (materialesPrestados.contains(material)) {
            material.devolver();
            if (!material.estaPrestado()) {
                materialesPrestados.remove(material);
            }
        } else {
            System.out.println("El socio " + nombre + " no tenía prestado este material.");
        }
    }

    public ArrayList obtenerMaterialesPrestados(){
        return materialesPrestados;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "nombre='" + nombre + '\'' +
                ", idSocio=" + idSocio +
                ", materialesPrestados=" + materialesPrestados +
                '}';
    }
}
