package personajes;

import Interfaces.IAtaque;

import java.util.ArrayList;

public abstract class Guerrero {

    protected String nombre;
    protected int nivel;
    protected int vida=100;
    protected int vidaMaxima;
    protected ArrayList listaAtaques;
    protected static int contadorGuerreros=0;

    public Guerrero(String nombre, int nivel, int vidaMaxima) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.vidaMaxima = vidaMaxima;
        this.listaAtaques = new ArrayList<>();
        contadorGuerreros++;
    }

    public void atacar(Guerrero enemigo, IAtaque ataque){

    }

    public void recibirDanio(int danio){

    }

    public boolean esDerrotado(){
        return false;
    }

    public void agregarAtaque(IAtaque nuevoAtaque){

    }

    public String getNombre(){
        return nombre;
    }

    public int getVidaMaxima(){
        return 0;
    }

    public static int getContadorGuerreros(){
        return contadorGuerreros;
    }

    @Override
    public String toString() {
        return "{" +
                "Nombre= '" + nombre + '\'' +
                ", Nivel= " + nivel +
                ", Vida= " + vida +
                ", VidaMaxima= " + vidaMaxima +
                ", ListaAtaques= " + listaAtaques +
                '}';
    }
}
