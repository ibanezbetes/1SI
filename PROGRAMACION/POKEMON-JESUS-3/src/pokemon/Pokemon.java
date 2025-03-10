package pokemon;

import interfaces.IPelea;

import java.util.ArrayList;

public abstract class Pokemon implements IPelea {
    protected String nombre;
    protected int nivel;
    protected int salud;
    protected final int SALUD_MAX = 300;

    ArrayList<Movimiento> listamovimientosPokemon = new ArrayList<>;

    public Pokemon(String nombre, int nivel, int salud) {
}
