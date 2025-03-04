// warhammer/armas/Rabanadora.java
package armas;

public class Rabanadora extends ArmaAtaque {

    private static final int DANIO_RABANADORA = 5;

    public Rabanadora(String nombre) {
        super(nombre, DANIO_RABANADORA);
    }

    @Override
    public String toString() {
        return "Rabanadora (" + VIDA_CONSUMIDA + " daño)";
    }
}
