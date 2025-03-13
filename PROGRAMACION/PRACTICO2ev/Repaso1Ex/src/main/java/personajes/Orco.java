package personajes;

import armas.ArmaAtaque;
import armas.ArmaDefensa;

import java.util.ArrayList;

public class Orco extends PielVerde{

    private ArrayList<Goblin> listaGoblin;

    public Orco(String nombre, String puebloNacimiento,int nivel) {
        super(nombre, puebloNacimiento);
        this.listaGoblin=new ArrayList<>();
        this.nivel=nivel;
    }

    public ArrayList<Goblin> getListaGoblin(){
        return listaGoblin;
    }


    public void addArmaAtaque(String arma) {

    }


    public void addArmaDefensa(String arma) {

    }



    public void addGoblin(Goblin goblin){
        listaGoblin.add(goblin);
    }


    public void atacar(WarhammerPersonaje victima){

    }

    public void defender(ArmaAtaque armaAtacante){

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
