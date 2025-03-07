// SuperHero.java
package SUPERHEROES;

public abstract class SuperHero {
    protected String name;

    public SuperHero(String name) {
        this.name = name;
    }

    // Métodos abstractos que obligan a cada héroe a definir su forma de atacar y defenderse
    public abstract void attack();
    public abstract void defend();
}
