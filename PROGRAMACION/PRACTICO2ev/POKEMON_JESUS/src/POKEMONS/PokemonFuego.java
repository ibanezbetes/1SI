package POKEMONS;

import INTERFACES.TipoFuego;

public abstract class PokemonFuego extends PokemonBase implements TipoFuego {

    public PokemonFuego(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }

    @Override
    public void ataqueFuego() {

    }

    @Override
    public void atacar(PokemonBase enemigo) {

    }

    @Override
    public void defender(int danio) {

    }
}
