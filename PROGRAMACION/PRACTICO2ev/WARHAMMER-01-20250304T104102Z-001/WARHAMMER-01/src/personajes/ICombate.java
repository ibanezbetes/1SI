// warhammer/personajes/ICombate.java
package personajes;

import armas.ArmaAtaque;

public interface ICombate {
    void atacar(WarhammerPersonaje victima);
    void defender(ArmaAtaque armaAtacante);
}
