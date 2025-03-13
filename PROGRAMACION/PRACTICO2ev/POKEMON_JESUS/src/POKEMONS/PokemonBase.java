package pokemons;

public abstract class PokemonBase {

    protected String nombre;
    protected int nivel;
    protected int salud;

    public PokemonBase(String nombre, int nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getSalud() {
        return this.salud;
    }
}
