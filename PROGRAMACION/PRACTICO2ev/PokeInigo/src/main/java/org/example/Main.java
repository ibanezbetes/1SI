package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
// 1. Creamos entrenadores
        Entrenador ash = new Entrenador("Ash");
        Entrenador gary = new Entrenador("Gary");


        // 2. Creamos algunos Pokémon base
        Pikachu pikachu = new Pikachu("Pikachu", 10, 50);
        Charmander charmander = new Charmander("Charmander", 10, 45);

        // 3. Asignamos ataques y defensa a Pikachu
        pikachu.agregarAtaque("Impactrueno", 15);
        pikachu.agregarAtaque("Rayo", 20);
        pikachu.asignarDefensa(new Agilidad());

        // 4. Asignamos ataques y defensa a Charmander
        charmander.agregarAtaque("Lanzallamas", 25);
        charmander.agregarAtaque("Giro Fuego", 18);
        charmander.asignarDefensa(new MuroDeFuego());

        // 5. Agregamos Pokémon a los entrenadores
        ash.agregarPokemon(pikachu);
        gary.agregarPokemon(charmander);

        // 6. Creamos un Combate
        Combate combate1 = new Combate(ash, gary);

        // 7. Creamos el Torneo y agregamos el combate
        Torneo torneo = new Torneo("Liga Pokémon", "Trofeo Maestro Pokémon");
        torneo.agregarCombate(combate1);

        // 8. Iniciamos el Torneo
        torneo.iniciarTorneo();

        // 9. Imprimimos el estado final de los Pokémon
        System.out.println("\n-- ESTADO FINAL DE LOS POKÉMON --");
        for (Pokemon p : ash.getEquipo()) {
            System.out.println(p.getNombre() + ": PS " + p.getPs() + "/" + p.getPsMax()
                    + (p.esDerrotado() ? " (Derrotado)" : ""));
        }
        for (Pokemon p : gary.getEquipo()) {
            System.out.println(p.getNombre() + ": PS " + p.getPs() + "/" + p.getPsMax()
                    + (p.esDerrotado() ? " (Derrotado)" : ""));
        }

        // 10. Ejemplo de uso de ítem Pocion
        Pocion pocion = new Pocion();
        for (Pokemon p : ash.getEquipo()) {
            pocion.usar(p);
        }

        // 11. Cantidad total de Pokémon creados
        System.out.println("\nTotal de Pokémon creados: " + Pokemon.getContadorPokemon());
    }
}