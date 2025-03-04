// warhammer/personajes/Orco.java
package personajes;

import java.util.ArrayList;

public class Orco extends PielVerde {

    private ArrayList<Goblin> listaGoblins;
    private int nivel;

    public Orco(String nombre, String puebloNacimiento, int nivel) {
        super(nombre, puebloNacimiento);
        this.nivel = nivel;
        this.listaGoblins = new ArrayList<>();
    }

    public void addGoblin(Goblin goblin) {
        listaGoblins.add(goblin);
    }

    public ArrayList<Goblin> getListaGoblins() {
        return listaGoblins;
    }

    // Ejemplo especial de atacar, atacando también con sus goblins
    // si se quisiera...
    @Override
    public void atacar(WarhammerPersonaje victima) {
        super.atacar(victima);
        // Podrías hacer que los Goblins también ataquen, etc.
    }

    @Override
    public String toString() {
        return super.toString() +
                " [Orco nivel=" + nivel + ", #Goblins=" + listaGoblins.size() + "]";
    }
}
