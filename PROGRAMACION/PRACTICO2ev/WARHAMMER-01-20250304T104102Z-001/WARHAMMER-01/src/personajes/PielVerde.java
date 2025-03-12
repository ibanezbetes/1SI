// warhammer/personajes/PielVerde.java
package personajes;

public abstract class PielVerde extends WarhammerPersonaje {

    protected String puebloNacimiento; // algo representativo
    // Podrías tener un static int confPielesVerdes = 0; si lo requieres

    public PielVerde(String nombre, String puebloNacimiento) {
        super(nombre);
        this.puebloNacimiento = puebloNacimiento;
    }

    // Ejemplo de método para "sumarEnergía" si fuese específico
    public void sumarEnergia() {
        // Aumentamos un poco la energía
        this.energia += 10;
        if(this.energia > ENERGIA_MAX) {
            this.energia = ENERGIA_MAX;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " (Piel Verde de " + puebloNacimiento + ")";
    }
}
