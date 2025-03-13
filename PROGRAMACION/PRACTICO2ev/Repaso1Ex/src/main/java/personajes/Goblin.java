package personajes;

import armas.ArmaAtaque;
import armas.ArmaDefensa;

public class Goblin extends PielVerde{

    private int nivel;

    public Goblin(String nombre, String puebloNacimiento,int nivel){
        super(nombre,puebloNacimiento);
        this.nivel=nivel;
    }

    public void sumarEnergia(){

    }

    public void addArmaAtaque(String arma){

    }

    public void addArmaDefensa(ArmaDefensa arma){

    }

    public void atacar(WarhammerPersonaje victima){

    }

    public void defender(ArmaAtaque armaAtacante){

    }

    public int getNivel() {
        return nivel;
    }

    @Override
    public String toString() {
        return "{" +
                "Nombre = '" + nombre + '\'' +
                ", Pueblo de Nacimiento = '" + puebloNacimiento + '\'' +
                ", Nivel = " + nivel +
                '}';
    }
}
