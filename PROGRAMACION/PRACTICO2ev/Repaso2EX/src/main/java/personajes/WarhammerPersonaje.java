package personajes;

import armas.Arma;

import java.util.HashMap;

public abstract class WarhammerPersonaje implements iCombate{

    protected String nombre;
    private int energia;
    protected HashMap<String, Arma> armas;
    private static int contPersonajes=0;
    private final int ENERGIA_MAX=100;

    public WarhammerPersonaje(String nombre) {
        this.nombre = nombre;
        this.energia = energia;
        this.armas = new HashMap<>();
        contPersonajes++;
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
                ", ENERGIA_MAX=" + ENERGIA_MAX +
                '}';
    }
}
