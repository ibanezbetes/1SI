package cosas;

import java.util.ArrayList;

public class Usuario {

    private String nombre;
    private double saldo;
    private ArrayList juegosComprados;

    public Usuario(String nombre, double saldoInicial) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public boolean realizarCompra(Videojuego juego ,double precio){
        return false;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
