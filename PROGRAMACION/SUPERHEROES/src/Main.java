// Main.java
package SUPERHEROES;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista de superhéroes sin super ataques
        List<SUPERHEROES.SuperHero> heroes = new ArrayList<>();
        heroes.add(new SUPERHEROES.IronMan());
        heroes.add(new SUPERHEROES.SpiderMan());
        heroes.add(new SUPERHEROES.Hulk());
        heroes.add(new SUPERHEROES.Thor());
        heroes.add(new SUPERHEROES.DoctorStrange());

        // Probamos ataques y defensas normales
        for (SUPERHEROES.SuperHero hero : heroes) {
            hero.attack();
            hero.defend();
            System.out.println("-------------------");
        }

        // Lista de superhéroes con super ataques
        List<SUPERHEROES.SuperAttack> superAttackHeroes = new ArrayList<>();
        superAttackHeroes.add(new SUPERHEROES.ThorWithSuperAttack());
        superAttackHeroes.add(new SUPERHEROES.DoctorStrangeWithSuperAttack());

        // Probamos los super ataques
        for (SUPERHEROES.SuperAttack hero : superAttackHeroes) {
            hero.executeSuperAttack();
            System.out.println("-------------------");
        }
    }
}
