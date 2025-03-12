package personajes;

import armas.ArmaAtaque;
import armas.ArmaDefensa;

public class Goblin extends PielVerde{


    public Goblin(String nombre, String puebloNacimiento, int nivel) {
        super(nombre, puebloNacimiento, nivel);
        this.puebloNacimiento=puebloNacimiento;
    }

    @Override
    public void sumarEnergia() {

    }

    @Override
    public void addArmaAtaque(ArmaAtaque arma) {

    }

    @Override
    public void addArmaDefensa(ArmaDefensa arma) {

    }

    @Override
    public void atacar(WarhammerPersonaje victima) {

    }

    @Override
    public void defender(ArmaAtaque arma) {

    }

    @Override
    public String toString() {
        return "Goblin{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", puebloNacimiento='" + puebloNacimiento + '\'' +
                '}';
    }
}
