// warhammer/armas/Martillo.java
package armas;

public class Martillo extends ArmaAtaque {

    private static final int DANIO_MARTILLO = 3;

    public Martillo(String nombre) {
        super(nombre, DANIO_MARTILLO);
    }

    @Override
    public String toString() {
        return "Martillo (" + VIDA_CONSUMIDA + " daño)";
    }
}
