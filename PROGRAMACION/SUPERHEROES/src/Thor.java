// Thor.java
package SUPERHEROES;

public class Thor extends SuperHero {
    public Thor() {
        super("Thor");
    }

    @Override
    public void attack() {
        System.out.println(name + " ataca con su martillo Mjölnir.");
    }

    @Override
    public void defend() {
        System.out.println(name + " bloquea ataques con su martillo.");
    }
}
