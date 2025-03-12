
// warhammer/personajes/Martillador.java
package personajes;

public class Martillador extends Enano {

    public Martillador(String nombre, int riqueza) {
        super(nombre, riqueza);
    }

    // Podrías sobreescribir atacar/defender
    // ...

    @Override
    public String toString() {
        return super.toString() + " [Martillador]";
    }
}