// warhammer/armas/Hacha.java
package armas;

public class Hacha extends ArmaAtaque {

    private static final int DANIO_HACHA = 3;

    public Hacha(String nombre) {
        super(nombre, DANIO_HACHA);
    }

    @Override
    public String toString() {
        return "Hacha (" + VIDA_CONSUMIDA + " daño)";
    }
}