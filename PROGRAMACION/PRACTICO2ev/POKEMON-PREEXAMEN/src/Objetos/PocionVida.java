package Objetos;

import Pokemons.Pokemon;

public class PocionVida extends Objeto {

    private int cantidad;
    public PocionVida(String nombre, int cantidad) {
        super(nombre);
        this.cantidad = cantidad;
    }

    public void usar(Pokemon p) {
        p.usarObjeto();
    }
}
