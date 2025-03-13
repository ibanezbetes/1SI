
// warhammer/personajes/Enano.java
package personajes;

public abstract class Enano extends WarhammerPersonaje {

    protected int riqueza; // ejemplo de oro que lleva
    // Podrías tener static int confEnanos = 0; etc.

    public Enano(String nombre, int riqueza) {
        super(nombre);
        this.riqueza = riqueza;
    }

    public void sumarEnergia() {
        this.energia += 8;
        if(this.energia > ENERGIA_MAX) {
            this.energia = ENERGIA_MAX;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " (Enano con riqueza=" + riqueza + ")";
    }
}