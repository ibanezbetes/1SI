package POKEMONS;

import INTERFACES.TipoElectrico;
import INTERFACES.TipoFuego;

public abstract class PokemonElectrico extends PokemonBase implements TipoElectrico {

    public PokemonElectrico(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }

    @Override
    public void ataqueRayo() {

    }

    @Override
    public void atacar(PokemonBase enemigo) {

    }

    @Override
    public void defender(int danio) {

    }
}
