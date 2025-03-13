package personajes;

import armas.ArmaAtaque;
import armas.ArmaDefensa;

import static personajes.PielVerde.contPielesVerdes;

public abstract class Enano extends WarhammerPersonaje {


    protected int riqueza;
    protected int nivel;
    protected static int contEnanos=0;


    public Enano(String nombre, int riqueza) {
        super(nombre);
        this.riqueza= riqueza;
    }

    public static int getContPielesVerdes(){
        return contPielesVerdes;
    }

    public void addArmaAtaque(ArmaAtaque arma){

    }

    public void addArmaDefensa(ArmaDefensa arma){

    }

    @Override
    public String imprimirArmas() {
        return super.imprimirArmas();
    }

    @Override
    public String toString() {
        return "Enano{" +
                "nombre='" + nombre + '\'' +
                ", riqueza=" + riqueza +
                ", nivel=" + nivel +
                '}';
    }
}
