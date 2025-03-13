// warhammer/armas/Arma.java
package armas;

/**
 * Clase abstracta que representa un arma genérica
 */
public abstract class Arma {

    protected String nombre;

    public Arma(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Arma: " + nombre;
    }
}