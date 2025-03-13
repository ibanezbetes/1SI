package Modulo;

public class ArmaDefensa extends Arma {

    private String nombre;
    private int valorDefensa;

    public ArmaDefensa(String nombreModulo, String nombreArma, int potencia, String nombre, int valorDefensa) {
        super(nombreModulo, nombreArma, potencia);
        this.nombre = nombre;
        this.valorDefensa = valorDefensa;
    }

    public int getValorDefensa() {
        return valorDefensa;
    }
}
