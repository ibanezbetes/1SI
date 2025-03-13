// warhammer/armas/Casco.java
package armas;

import personajes.WarhammerPersonaje;

public class Casco extends ArmaDefensa {

    private static final int DEFENSA_CASCO = 2;

    public Casco(String nombre) {
        super(nombre, DEFENSA_CASCO);
    }

    /**
     * El Casco "solo" defiende de Arcos (según el diagrama).
     * Por lo tanto, si no es un Arco, no defiende.
     */
    @Override
    public void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante) {
        if(armaAtacante instanceof Arco) {
            // Usa la lógica por defecto
            super.defender(defendido, armaAtacante);
        } else {
            // No defiende nada
            defendido.restarEnergia(armaAtacante.getVidaConsumida());
        }
    }

    @Override
    public String toString() {
        return "Casco (" + VIDA_DEFENDIDA + " defensa solo vs Arco)";
    }
}