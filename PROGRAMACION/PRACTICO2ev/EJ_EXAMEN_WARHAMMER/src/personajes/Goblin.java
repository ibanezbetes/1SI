package personajes;

import armas.ArmaAtaque;
import armas.ArmaDefensa;

public class Goblin extends PielVerde{

    // CONSTRUCTOR

    public Goblin(String nombre, String puebloNacimiento) {
        super(nombre, puebloNacimiento);
    }


    //MÉTODOS HEREDADOS POR EL PADRE:

    @Override
    public void SumarEnergia() {
        super.SumarEnergia();
    }

    @Override
    public void addArmaAtaque(ArmaAtaque arma) {
        super.addArmaAtaque(arma);
    }

    @Override
    public void addArmaDefensa(ArmaDefensa arma) {
        super.addArmaDefensa(arma);
    }

    @Override
    public String imprimirArmas() {
        return super.imprimirArmas();
    }


    @Override
    public void atacar(WarhammerPersonaje victima) {

    }


    @Override
    public void defender(ArmaAtaque arma) {
        super.defender(arma);
    }

    @Override
    public String toString() {
        return "Goblin{" +
                "puebloNacimiento='" + puebloNacimiento + '\'' +
                ", nivel=" + nivel +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
