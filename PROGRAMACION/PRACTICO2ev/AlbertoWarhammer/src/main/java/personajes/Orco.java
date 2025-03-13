package personajes;

import armas.ArmaAtaque;

import java.util.ArrayList;

public class Orco extends PielVerde{

    private ArrayList<Goblin>listaGoblin;

    public Orco(String nombre, String puebloNacimiento, int nivel) {
        super(nombre, puebloNacimiento, nivel);
    }

    public ArrayList<Goblin>getListaGoblin()
        
    @Override
    public void atacar(WarhammerPersonaje victima) {

    }

    @Override
    public void defender(ArmaAtaque arma) {

    }
}
