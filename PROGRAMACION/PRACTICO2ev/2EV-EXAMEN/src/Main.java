// warhammer/Main.java


import java.util.ArrayList;
import java.util.Random;
import armas.*;
import batallas.Escaramuza;
import batallas.Guerra;
import personajes.*;

public class Main {

    public static void main(String[] args) {

        // 1) Creamos 2 Goblins de nivel 20
        Goblin g1 = new Goblin("Grok", "MontañasNubladas", 20);
        Goblin g2 = new Goblin("Zug", "MontañasNubladas", 20);

        // 2) Creamos 2 Martilladores con riqueza 1000
        Martillador m1 = new Martillador("Thorin", 1000);
        Martillador m2 = new Martillador("Balin", 1000);

        // Guardamos en ArrayList
        ArrayList<Goblin> listaGoblins = new ArrayList<>();
        listaGoblins.add(g1);
        listaGoblins.add(g2);

        ArrayList<Martillador> listaMartilladores = new ArrayList<>();
        listaMartilladores.add(m1);
        listaMartilladores.add(m2);

        // 3) Asignamos de forma aleatoria un arma de ataque y defensa 
        //    (por ejemplo Rabanadora o Arco, Armadura o Escudo) a cada Goblin
        Random random = new Random();
        for(Goblin gob : listaGoblins) {
            // Ataque
            if(random.nextBoolean()) {
                gob.addArmaAtaque(new Rabanadora("Rabanadora feroz"));
            } else {
                gob.addArmaAtaque(new Arco("Arco largo"));
            }
            // Defensa
            if(random.nextBoolean()) {
                gob.addArmaDefensa(new Armadura("Armadura ligera"));
            } else {
                gob.addArmaDefensa(new Escudo("Escudo de madera"));
            }
        }

        // 4) Asignamos de forma aleatoria un arma de ataque 
        //    (Hacha o Martillo) y una de defensa (Casco o Armadura) a cada Martillador
        for(Martillador mart : listaMartilladores) {
            if(random.nextBoolean()) {
                mart.addArmaAtaque(new Hacha("Hacha de guerra"));
            } else {
                mart.addArmaAtaque(new Martillo("Martillo runico"));
            }
            if(random.nextBoolean()) {
                mart.addArmaDefensa(new Casco("Casco reforzado"));
            } else {
                mart.addArmaDefensa(new Armadura("Armadura pesada"));
            }
        }

        // 5) Recorro e imprimo
        System.out.println("=== Pieles Verdes ===");
        for(Goblin gob : listaGoblins) {
            System.out.println(gob);
            // Usamos métodos de las clases...
            // gob.atacar(otroPersonaje), etc. si quisiéramos
        }
        System.out.println("=== Martilladores ===");
        for(Martillador mart : listaMartilladores) {
            System.out.println(mart);
        }

        System.out.println("Número de personajes creados hasta ahora: "
                + WarhammerPersonaje.totalNumPersonajes());

        // 6) Crear 2 Orcos con nivel 40, 2 Rompehierros con riqueza 2000, etc.
        Orco orco1 = new Orco("Urk", "ValleSombrío", 40);
        Orco orco2 = new Orco("Krag", "ValleSombrío", 40);

        Rompehierro rh1 = new Rompehierro("Gimli", 2000);
        Rompehierro rh2 = new Rompehierro("Gloin", 2000);

        // 7) Asignarles armas de ataque/defensa de forma aleatoria
        //    ... (similar a lo anterior)
        orco1.addArmaAtaque(random.nextBoolean()
                ? new Arco("Arco orco1")
                : new Rabanadora("Rabanadora orco1"));
        orco1.addArmaDefensa(random.nextBoolean()
                ? new Escudo("Escudo orco1")
                : new Armadura("Armadura orco1"));

        orco2.addArmaAtaque(random.nextBoolean()
                ? new Arco("Arco orco2")
                : new Rabanadora("Rabanadora orco2"));
        orco2.addArmaDefensa(random.nextBoolean()
                ? new Escudo("Escudo orco2")
                : new Armadura("Armadura orco2"));

        rh1.addArmaAtaque(random.nextBoolean()
                ? new Hacha("Hacha rompehierro1")
                : new Martillo("Martillo rompehierro1"));
        rh1.addArmaDefensa(random.nextBoolean()
                ? new Casco("Casco rompehierro1")
                : new Armadura("Armadura rompehierro1"));

        rh2.addArmaAtaque(random.nextBoolean()
                ? new Hacha("Hacha rompehierro2")
                : new Martillo("Martillo rompehierro2"));
        rh2.addArmaDefensa(random.nextBoolean()
                ? new Casco("Casco rompehierro2")
                : new Armadura("Armadura rompehierro2"));

        // etc. Se podrían hacer más pruebas de ataque:
        // "Con un Rompehierro ataco a un Goblin (no se podrá defender)..."
        // ...
        // Orco ataca con un Arco varias veces...
        // etc.

        System.out.println("\nNúmero de personajes creados en total: "
                + WarhammerPersonaje.totalNumPersonajes());

        // 8) Crear una Escaramuza (p.e. "Escaramuza1"),
        //    asignar un Orco (como líder malo) y un Rompehierro (líder bueno),
        //    añadir más combatientes...
        Escaramuza esc1 = new Escaramuza("Escaramuza en el paso de la Muerte");
        esc1.setLiderBuenos(rh1);
        esc1.setLiderMalos(orco1);

        // Añadir personajes a un bando u otro
        esc1.addPersonajes("CombatientesBuenos", m1);  // un Martillador
        esc1.addPersonajes("CombatientesMalos", g1);   // un Goblin
        // ... etc.

        // Ejecutar combate
        esc1.ejecutarCombate();
        System.out.println(esc1.imprimirEscaramuza());

        // 9) Creamos una Guerra, añadimos la escaramuza, etc.
        Guerra guerra = new Guerra("La Gran Guerra del Norte");
        guerra.addEscaramuza(esc1);

        // Por ejemplo, creamos otra escaramuza, le asignamos orco2 y rh2...
        Escaramuza esc2 = new Escaramuza("Batalla en las Colinas");
        esc2.setLiderBuenos(rh2);
        esc2.setLiderMalos(orco2);
        esc2.addPersonajes("CombatientesBuenos", m2);
        esc2.addPersonajes("CombatientesMalos", g2);
        // ...
        guerra.addEscaramuza(esc2);

        // Imprimimos el estado de la guerra
        guerra.imprimirGuerra();
    }
}