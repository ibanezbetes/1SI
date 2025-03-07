// Hulk.java
package SUPERHEROES;

public class Hulk extends SuperHero {
    public Hulk() {
        super("Hulk");
    }

    @Override
    public void attack() {
        System.out.println(name + " lanza un poderoso golpe.");
    }

    @Override
    public void defend() {
        System.out.println(name + " resiste el ataque gracias a su gran fuerza.");
    }
}
