// warhammer/armas/Armadura.java
package armas;

public class Armadura extends ArmaDefensa {

    private static final int DEFENSA_ARMADURA = 3;

    public Armadura(String nombre) {
        super(nombre, DEFENSA_ARMADURA);
    }

    /**
     * Armadura defiende de cualquier arma,
     * con un valor de 3 de reducción de daño.
     * (hereda la lógica de la clase padre).
     */
    @Override
    public String toString() {
        return "Armadura (" + VIDA_DEFENDIDA + " defensa)";
    }
}
