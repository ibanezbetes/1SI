package org.example;

import java.util.ArrayList;
import java.util.List;

class Torneo {
    private String nombreTorneo;
    private List combates;
    private String premio;

   
    public Torneo(String nombreTorneo, String premio) {
        this.nombreTorneo = nombreTorneo;
        this.premio = premio;
        this.combates = new ArrayList<>();
    }

    public void agregarCombate(Combate c) {
        combates.add(c);
    }

    // Ejecuta todos los combates
    public void iniciarTorneo() {
        System.out.println("===== ¡Inicia el Torneo " + nombreTorneo + "! =====");
        for (Object c : combates) {
            c.getClass();
            System.out.println("------------------------------------------");
        }
        System.out.println("===== Torneo terminado. ¡Premio: " + premio + "! =====");
    }
}