
// warhammer/personajes/Rompehierro.java
        package personajes;

import java.util.ArrayList;

public class Rompehierro extends Enano {

    private ArrayList<Enano> listaEnanos;

    public Rompehierro(String nombre, int riqueza) {
        super(nombre, riqueza);
        listaEnanos = new ArrayList<>();
    }

    public void addEnano(Enano e) {
        listaEnanos.add(e);
    }

    @Override
    public void atacar(WarhammerPersonaje victima) {
        // Por ejemplo, atacamos con este Rompehierro
        super.atacar(victima);
        // Y además con su escuadrón:
        for(Enano e : listaEnanos) {
            e.atacar(victima);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                " [Rompehierro con " + listaEnanos.size() + " enanos en el escuadrón]";
    }
}