package org.example;

import org.example.Defensa;

import java.util.HashMap;

abstract class Pokemon {
    protected String nombre;
    protected int nivel;
    protected int ps; // Puntos de Salud (actuales)
    protected int psMax; // Puntos de Salud máximos


    // Estructura para almacenar ataques (clave: nombre, valor: daño)
    protected HashMap<String, Integer> ataques;

    // Defensa asociada (opcional)
    protected Defensa defensaActiva;

    // Contador estático para conocer cuántos Pokémon se crean
    protected static int contadorPokemon = 0;

    // Constructor
    public Pokemon(String nombre, int nivel, int psMax) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.psMax = psMax;
        this.ps = psMax;   // Inicialmente, PS = psMax
        this.ataques = new HashMap<>();
        contadorPokemon++;
    }

    // Agrega un ataque al HashMap
    public void agregarAtaque(String nombreAtaque, int dano) {
        ataques.put(nombreAtaque, dano);
    }

    // Asigna una defensa concreta
    public void asignarDefensa(Defensa defensa) {
        this.defensaActiva = defensa;
    }

    // Recibir daño aplicando la defensa (si está presente)
    public void recibirDano(int dano) {
        if (defensaActiva != null) {
            dano = defensaActiva.defender(dano);
        }
        ps -= dano;
        if (ps < 0) {
            ps = 0;
        }
        if (esDerrotado()) {
            System.out.println(nombre + " ha sido derrotado.");
        }
    }

    // Atacar a otro Pokémon usando el nombre de un ataque
    public void atacar(Pokemon objetivo, String ataqueNombre) {
        // Verifica si el atacante no está derrotado
        if (this.esDerrotado()) {
            System.out.println(nombre + " no puede atacar, está derrotado.");
            return;
        }
        // Verifica si el objetivo no está ya derrotado
        if (objetivo.esDerrotado()) {
            System.out.println("El objetivo " + objetivo.nombre + " ya está derrotado.");
            return;
        }
        // Obtiene el daño del ataque
        Integer dano = ataques.get(ataqueNombre);
        if (dano != null) {
            System.out.println(nombre + " usó '" + ataqueNombre + "' contra "
                    + objetivo.nombre + " causando " + dano + " de daño.");
            objetivo.recibirDano(dano);
        } else {
            System.out.println(nombre + " no tiene el ataque '" + ataqueNombre + "'.");
        }
    }

    // Verifica si PS = 0 (derrotado)
    public boolean esDerrotado() {
        return ps <= 0;
    }

    // Método para evolucionar (implementado por subclases si se requiere)
    public void evolucionar() {
        // Por defecto vacío, lo usan subclases como Raichu, Charizard
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPs() {
        return ps;
    }

    public int getPsMax() {
        return psMax;
    }

    public HashMap<String, Integer> getAtaques() {
        return ataques;
    }

    public static int getContadorPokemon() {
        return contadorPokemon;
    }
}