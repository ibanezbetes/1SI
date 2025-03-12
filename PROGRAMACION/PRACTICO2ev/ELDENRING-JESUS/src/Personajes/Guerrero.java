package Personajes;

import Arma.Arma;
import Arma.Escudo;
import Interfaces.IAtaque;
import Interfaces.IDefensa;

import java.util.ArrayList;
import java.util.Random;

public abstract class Guerrero implements IAtaque, IDefensa {

    protected String nombre;
    protected int salud;
    protected final int SALUD_MAX=150;
    ArrayList<Arma>armas;
    protected Escudo escudo;
    protected int saludTotal;

    public Guerrero(String nombre) {
        this.nombre = nombre;
        this.armas=new ArrayList<>();
    }

    public void aniadirArma(Arma arma){
        armas.add(arma);
    }

    public void equiparEscudo(Escudo escudo){
        this.escudo=escudo;
        System.out.println("Escudo equipado");
    }

    public void imprimirArmas(){
        for (Arma arma : armas) {
            System.out.println("Arma impresa" + armas.toString());
        }
    }

    public void mostrarEscudo(){

    }

    public void seleccionarArmaAtaque(Guerrero objetivo){
        public void seleccionarArmaAtaque(){
            if (listaArmas.isEmpty()) {
                System.out.println(nombre + " no tiene armas para atacar.");
                return;
            }

            // Seleccionar un arma aleatoria
            Random random = new Random();
            Arma armaSeleccionada = listaArmas.get(random.nextInt(listaArmas.size()));

            // Mostrar el arma seleccionada
            System.out.println(nombre + " ha seleccionado el arma: " + armaSeleccionada.getNombreArma() + " (Potencia: " + armaSeleccionada.getPotencia() + ")");
        }
    }

    public void restarSalud(int dmg){
        if (estaVivo()) {
            saludTotal=salud-dmg;
        }
    }

    public boolean estaVivo(){
        if (salud>0){
            System.out.println("Personaje vivo");
            return true;
        }else {
            System.out.println("El personaje esta muerto");
            return false;
        }
    }

    public void imprimirEstado(){
        if (estaVivo()){
            System.out.println("Perosnaje" + nombre + " vivo" + saludTotal);
        }else {
            System.out.println("Personaje" + nombre + "ha fallecido");
        }
    }

    @Override
    public void atacar(Guerrero objetivo) {

    }

    @Override
    public void defender(Arma arma, int danioRecibido) {

    }

    public void ataqueEspecial(Guerrero objetivo){
        System.out.println("Se va a ejecutar un ataque especial");
        restarSalud(0);
    }

    @Override
    public String toString() {
        return "Guerrero{" +
                "nombre='" + nombre + '\'' +
                ", salud=" + salud +
                ", SALUD_MAX=" + SALUD_MAX +
                ", armas=" + armas +
                ", escudo=" + escudo +
                '}';
    }
}