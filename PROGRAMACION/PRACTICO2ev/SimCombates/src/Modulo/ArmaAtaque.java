package Modulo;

public class ArmaAtaque extends Arma {

    private String nombre;
    private int danio;


    public ArmaAtaque(String nombreModulo, String nombreArma, int potencia, String nombre, int danio) {
        super(nombreModulo, nombreArma, potencia);
        this.nombre = nombre;
        this.danio = danio;
    }

    public int getDanio() {
        return danio;
    }
}
