package Modulo;

public abstract class Arma{

    protected String nombreArma;
    protected int potencia;

    public Arma(String nombreArma, int potencia) {
        this.nombreArma = nombreArma;
        this.potencia = potencia;
    }

    public String getNombreArma() {
        return nombreArma;
    }

    public int getPotencia() {
        return potencia;
    }
}
