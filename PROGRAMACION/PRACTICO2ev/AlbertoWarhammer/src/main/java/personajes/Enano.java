package personajes;

import armas.ArmaAtaque;
import armas.ArmaDefensa;

public abstract class Enano extends WarhammerPersonaje{

    private int riqueza;
    protected int nivel;
    private static int contEnanos=0;

    public Enano(String nombre, int riqueza) {
        super(nombre);
        this.riqueza = riqueza;

    }

    public static int getContPielesVerdes(){
        return contEnanos;
    }

    public void addArmaAtaque(ArmaAtaque arma){

    }

    public void addArmaDefensa(ArmaDefensa arma){

    }

    public String imprimirArmas(){
        //recorrer hasmap y preparar cadena
        return "";
    }

    @Override
    public String toString() {
        return "Enano{" +
                "riqueza=" + riqueza +
                ", nivel=" + nivel +
                '}';
    }
}
