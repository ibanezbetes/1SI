package personajes;

import armas.arma;

import java.util.HashMap;

public abstract class WarhammerPersonaje  implements ICombate{

    protected String nombre;
    protected int energia;
    protected HashMap<String, arma> armas;
    protected static int contPersonajes=0;
    protected static final int ENERGIA_MAX=200;

    public WarhammerPersonaje(String nombre) {
        this.nombre = nombre;
    }

    public void sumarEnergia(){

    }

    public static int toNumPersonajes(){
        return contPersonajes;
    }

    public String imprimirArmas(){
        return "";
    }

    @Override
    public String toString() {
        return "WarhammerPersonaje{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", armas=" + armas +
                '}';
    }
}
