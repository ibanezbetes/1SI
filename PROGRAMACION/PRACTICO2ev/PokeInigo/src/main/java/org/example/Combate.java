package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Combate {
    private Entrenador e1;
    private Entrenador e2;
    private int ronda;



    public Combate(Entrenador e1, Entrenador e2) {
        this.e1 = e1;
        this.e2 = e2;
        this.ronda = 1;
    }

    // Ejecuta el combate turnado
    public void ejecutarCombate() {
        System.out.println("► Combate entre " + e1.getNombre()
                + " y " + e2.getNombre() + " ◄");

        // Escogemos un Pokémon random de cada Entrenador
        Pokemon p1 = e1.obtenerPokemonAleatorio();
        Pokemon p2 = e2.obtenerPokemonAleatorio();

        // Verifica que ambos tengan Pokémon
        if (p1 == null || p2 == null) {
            System.out.println("Error: uno de los entrenadores no tiene Pokémon.");
            return;
        }

        // Mientras ambos sigan vivos
        while (!p1.esDerrotado() && !p2.esDerrotado()) {
            System.out.println("\n-- Ronda " + ronda + " --");
            // Turno del Pokémon de e1
            String ataqueAleatorio1 = obtenerAtaqueAleatorio(p1);
            if (ataqueAleatorio1 != null) {
                p1.atacar(p2, ataqueAleatorio1);
            }

            // Revisa si p2 sigue vivo, si es así, ataca
            if (!p2.esDerrotado()) {
                String ataqueAleatorio2 = obtenerAtaqueAleatorio(p2);
                if (ataqueAleatorio2 != null) {
                    p2.atacar(p1, ataqueAleatorio2);
                }
            }
            ronda++;
        }

        // Determina el ganador
        if (p1.esDerrotado() && !p2.esDerrotado()) {
            System.out.println("\n¡" + e2.getNombre() + " gana el combate!");
        } else if (!p1.esDerrotado() && p2.esDerrotado()) {
            System.out.println("\n¡" + e1.getNombre() + " gana el combate!");
        } else {
            System.out.println("\n¡El combate termina en empate!");
        }
    }

    // Obtiene un ataque random del mapa de ataques
    private String obtenerAtaqueAleatorio(Pokemon p) {
        if (p.getAtaques().isEmpty()) {
            return null;
        }
        List<String> listaAtaques = new ArrayList<>(p.getAtaques().keySet());
        Random r = new Random();
        return listaAtaques.get(r.nextInt(listaAtaques.size()));
    }
}
