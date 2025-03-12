// warhammer/armas/ArmaAtaque.java
package armas;

import personajes.WarhammerPersonaje;

/**
 * Clase abstracta para armas de ataque.
 * Implementa la interfaz ArmamentoAtaque.
 */
public abstract class ArmaAtaque extends Arma implements ArmamentoAtaque {

    protected final int VIDA_CONSUMIDA; // Daño base que provoca

    public ArmaAtaque(String nombre, int vidaConsumida) {
        super(nombre);
        this.VIDA_CONSUMIDA = vidaConsumida;
    }

    public int getVidaConsumida() {
        return VIDA_CONSUMIDA;
    }

    // Implementación básica de atacar(...)
    @Override
    public void atacar(WarhammerPersonaje victima) {
        // Por defecto, que la víctima se defienda (si puede)
        victima.defender(this);
    }

    // Versión “tanque”: si la víctima es un Goblin o Martillador
    // y esAtaqueTanque == true, no se defiende.
    @Override
    public void atacar(WarhammerPersonaje victima, boolean esAtaqueTanque) {
        if (esAtaqueTanque &&
                (victima.getClass().getSimpleName().equals("Goblin")
                        || victima.getClass().getSimpleName().equals("Martillador")))
        {
            // Ataque que ignora la defensa
            victima.restarEnergia(this.VIDA_CONSUMIDA);
        } else {
            // Si no, se comporta como el ataque normal
            atacar(victima);
        }
    }
}
