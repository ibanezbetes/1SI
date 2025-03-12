// warhammer/armas/Escudo.java
package armas;

import personajes.WarhammerPersonaje;

public class Escudo extends ArmaDefensa {

    private static final int DEFENSA_ESCUDO = 2;

    public Escudo(String nombre) {
        super(nombre, DEFENSA_ESCUDO);
    }

    /**
     * El escudo defiende del Martillo y del Hacha (según ejemplo).
     * Si el arma atacante no es Martillo ni Hacha, no defiende.
     */
    @Override
    public void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante) {
        if(armaAtacante instanceof Martillo || armaAtacante instanceof Hacha) {
            super.defender(defendido, armaAtacante);
        } else {
            defendido.restarEnergia(armaAtacante.getVidaConsumida());
        }
    }

    @Override
    public String toString() {
        return "Escudo (" + VIDA_DEFENDIDA + " defensa vs Martillo/Hacha)";
    }
}