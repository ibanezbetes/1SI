
// warhammer/armas/ArmaDefensa.java
        package armas;

import personajes.WarhammerPersonaje;

public abstract class ArmaDefensa extends Arma implements ArmamentoDefensa {

    protected final int VIDA_DEFENDIDA; // Cuánto “bloquea” o “reduce” el daño

    public ArmaDefensa(String nombre, int vidaDefendida) {
        super(nombre);
        this.VIDA_DEFENDIDA = vidaDefendida;
    }

    public int getVidaDefendida() {
        return VIDA_DEFENDIDA;
    }

    /**
     * Lógica general de defender.
     * Las subclases pueden sobreescribir si tienen reglas especiales.
     */
    @Override
    public void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante) {
        // Por defecto, reducimos la energía del defendido en
        // (armaAtacante.getVidaConsumida() - VIDA_DEFENDIDA),
        // pero nunca por debajo de 0 adicional.
        int danio = armaAtacante.getVidaConsumida() - this.VIDA_DEFENDIDA;
        if(danio < 0) {
            danio = 0;
        }
        defendido.restarEnergia(danio);
    }
}