package personajes;

import armas.ArmaAtaque;
import armas.ArmaDefensa;

public abstract class Enano extends WarhammerPersonaje implements iCombate {

    private String nombre;
    protected int riqueza;
    protected int nivel;
    private static int contEnanos=0;

    public Enano(String nombre, String nombre1, int riqueza, int nivel) {
        super(nombre);
        this.nombre = nombre1;
        this.riqueza = riqueza;
        this.nivel = nivel;
    }

    public static int getContEnanos(){
        return contEnanos;
    }

    public void addArmaAtaque(ArmaAtaque arma){

    }

    public void addArmaDefensa(ArmaDefensa arma){

    }

    public String imprimirArmas(){
        return "";
    }

    @Override
    public String toString() {
        return "PielVerde{" +
                "nombre='" + nombre + '\'' +
                ", puebloNacimiento='" + puebloNacimiento + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
