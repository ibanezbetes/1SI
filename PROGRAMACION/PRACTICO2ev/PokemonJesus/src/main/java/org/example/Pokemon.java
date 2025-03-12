package org.example;

public abstract class Pokemon {
    protected String nombre;
    private int nivel;
    private double peso;
    private String tipo;

    public Pokemon(String nombre, int nivel, double peso, String tipo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.peso = peso;
        this.tipo = tipo;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + "Nivel: "+ "Peso: "+ peso + "Tipo: " + tipo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
