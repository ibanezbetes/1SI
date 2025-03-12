package Objetos;

import Pokemons.Pokemon;

public class PocionAtaque extends Objeto {

    private int cantidad;
    public PocionVida(String nombre, int cantidad) {
        super(nombre);
        this.cantidad = cantidad;
    }

    public PocionAtaque(String nombre) {
        super(nombre);
    }

    public void usar(Pokemon p){
        p.usarObjeto();
    }
}
