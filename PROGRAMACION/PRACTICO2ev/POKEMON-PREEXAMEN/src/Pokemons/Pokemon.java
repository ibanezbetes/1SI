package Pokemons;

import Movimientos.MovimientoAtaque;
import Objetos.Objeto;

import java.util.ArrayList;

public abstract class Pokemon {
    protected String nombre;
    protected int salud;
    protected final int SALUD_MAX = 100;
    ArrayList<MovimientoAtaque> listaAtaques = new ArrayList<>();
    Objeto objetoEquipado;

    public Pokemon(String nombre) {
        this.nombre = nombre;
        this.salud = SALUD_MAX;
    }

    public void atacar(Pokemon objetivo) {

    }

    public void defender (int danio) {

    }

    public void usarObjeto(){

    }

    public boolean estaVivo() {
        if(salud>0){
            System.out.println("Está vivo co");
            return true;
        }else{
            return false;
            System.out.println("Está muerto co");
        };
    }

    public void agregarMovimiento(MovimientoAtaque mov){
        listaAtaques.add(mov);
        System.out.println("co");
    }
}
