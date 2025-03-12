import armas.*;
import batallas.Escaramuza;
import batallas.Guerra;
import personajes.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Goblin goblin1=new Goblin("Pepe", "Sevilla",20);
        Goblin goblin2=new Goblin("Pepo", "Zaragoza",20);

        Martillador martillador1= new Martillador("Jose",1000);
        Martillador martillador2= new Martillador("Josefo",1000);

        ArrayList<Goblin> listaGoblins=new ArrayList<>();
        listaGoblins.add(goblin1);
        listaGoblins.add(goblin2);

        ArrayList<Martillador> listaMartilladores=new ArrayList<>();
        listaMartilladores.add(martillador1);
        listaMartilladores.add(martillador2);

        Random aleatorio=new Random();
        for (Goblin goblin : listaGoblins) {
            if (aleatorio.nextBoolean()){
                goblin.addArmaAtaque(new Rebanadora("Rebanadora"));
            }else{
                goblin.addArmaAtaque(new Arco("Arco"));
            }

            if (aleatorio.nextBoolean()){
                goblin.addArmaDefensa(new Armadura("Armadura"));
            }else {
                goblin.addArmaDefensa(new Escudo("Escudo"));
            }
        }

        for (Martillador martillador : listaMartilladores) {
            if (aleatorio.nextBoolean()) {
                martillador.addArmaAtaque(new Hacha("Hacha"));
            } else {
                martillador.addArmaAtaque(new Martillo("Martillo"));
            }
            if (aleatorio.nextBoolean()){
                martillador.addArmaDefensa(new Casco("Casco"));
            }else {
                martillador.addArmaDefensa(new Armadura("Armadura"));
            }
        }

        System.out.println("Ejercito Pieles Verdes");
        System.out.println();
        System.out.println("Goblins");
        for (Goblin goblin : listaGoblins) {
            System.out.println(goblin);
        }
        System.out.println();
        System.out.println("Martilladores");
        for (Martillador martillador : listaMartilladores) {
            System.out.println(martillador);
        }
        System.out.println();
        System.out.println("Total de personajes: " + WarhammerPersonaje.toNumPersonajes());

        Orco orco1 = new Orco("Luis", "Madrid",40);
        Orco orco2 = new Orco("Tomas","Jaca",40);

        Rompehierro rompehierro1=new Rompehierro("Paco",2000);
        Rompehierro rompehierro2=new Rompehierro("Diego",2000);

        ArrayList<Orco>listaOrco=new ArrayList<>();
        listaOrco.add(orco1);
        listaOrco.add(orco2);

        ArrayList<Rompehierro>listaRompehierro=new ArrayList<>();
        listaRompehierro.add(rompehierro1);
        listaRompehierro.add(rompehierro2);

        for (Orco orco : listaOrco) {
            if (aleatorio.nextBoolean()){
                orco.addArmaAtaque("Arco");
            }else {
                orco.addArmaAtaque("Rebanadora");
            }
            if (aleatorio.nextBoolean()){
                orco.addArmaDefensa("Escudo");
            }else {
                orco.addArmaDefensa("Armadura");
            }

        }

        for (Rompehierro rompehierro : listaRompehierro) {
            if (aleatorio.nextBoolean()){
                rompehierro.addArmaAtaque("Hacha");
        }else {
                rompehierro.addArmaAtaque("Martillo");
            }
            if (aleatorio.nextBoolean()){
                rompehierro.addArmaDefensa("Casco");
            }else {
                rompehierro.addArmaDefensa("Armadura");
            }
        }

        System.out.println();
        System.out.println();

        System.out.println("Ejercito Jefazos");
        System.out.println();
        System.out.println("Orcos");
        for (Orco orco : listaOrco) {
            System.out.println(orco);
        }
        System.out.println();
        System.out.println("Rompehierro");
        for (Rompehierro rompehierro : listaRompehierro) {
            System.out.println(rompehierro);
        }

        System.out.println();
        System.out.println("Numero total de personajes V2: " + WarhammerPersonaje.toNumPersonajes());


        Escaramuza escaramuza1=new Escaramuza("Escaramuza");
        escaramuza1.setLiderBuenos(rompehierro1);
        escaramuza1.setLiderMalos(orco1);

        escaramuza1.addPersonajes("CombatientesMalos",goblin1);
        escaramuza1.addPersonajes("CombatientesBuenos",martillador1);

        escaramuza1.ejecutarCombate();
        System.out.println(escaramuza1.imprimirEscaramuza());

        System.out.println();
        System.out.println();

        Guerra guerra1=new Guerra("Guerra");
        guerra1.addEscaramuza(escaramuza1);

        Escaramuza escaramuza2=new Escaramuza("Escaramuza 2");
        escaramuza2.setLiderBuenos(rompehierro2);
        escaramuza2.setLiderMalos(orco2);
        escaramuza2.addPersonajes("CombatientesMalos",goblin2);
        escaramuza2.addPersonajes("CombatientesBuenos",martillador2);

        guerra1.addEscaramuza(escaramuza2);

        guerra1.imprimirGuerra();



    }
}