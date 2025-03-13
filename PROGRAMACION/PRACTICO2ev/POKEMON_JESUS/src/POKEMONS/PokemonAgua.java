package POKEMONS;

import INTERFACES.TipoAgua;
import INTERFACES.TipoFuego;

public abstract class PokemonAgua extends PokemonBase implements TipoAgua {

    public PokemonAgua(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }

    @Override
    public void ataqueAgua() {

    }

    @Override
    public void atacar(PokemonBase enemigo) {

    }

    @Override
    public void defender(int danio) {

    }
}
