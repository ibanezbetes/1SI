package personajes;

import armas.ArmaAtaque;
import armas.ArmaDefensa;

public class Martillador extends Enano{



    public Martillador(String nombre,int riqueza) {
        super(nombre,riqueza);
    }



    @Override
    public String toString() {
        return "{" +
                "Nombre = '" + nombre + '\'' +
                ", Riqueza = " + riqueza +
                '}';
    }

    @Override
    public void addArmaAtaque(ArmaAtaque arma) {
        super.addArmaAtaque(arma);
    }

    @Override
    public void addArmaDefensa(ArmaDefensa arma) {
        super.addArmaDefensa(arma);
    }

    public void atacar(WarhammerPersonaje victima){

    }

    public void atacar(PielVerde victima){

    }

    public void defender(ArmaAtaque armaAtacante){

    }
}
