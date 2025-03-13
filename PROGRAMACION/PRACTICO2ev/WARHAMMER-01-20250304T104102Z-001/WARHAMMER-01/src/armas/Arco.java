// warhammer/armas/Arco.java
package armas;

public class Arco extends ArmaAtaque {

    // Según el diagrama, hace 3 puntos de daño
    private static final int DANIO_ARCO = 3;

    public Arco(String nombre) {
        super(nombre, DANIO_ARCO);
    }

    @Override
    public String toString() {
        return "Arco (" + VIDA_CONSUMIDA + " daño)";
    }
}
