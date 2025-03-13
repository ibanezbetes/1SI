
        package armas;

// warhammer/armas/ArmamentoAtaque.java

import personajes.WarhammerPersonaje;

public interface ArmamentoAtaque {
    void atacar(WarhammerPersonaje victima);
    // Versión especial si es ataque "tanque":
    void atacar(WarhammerPersonaje victima, boolean esAtaqueTanque);
}
