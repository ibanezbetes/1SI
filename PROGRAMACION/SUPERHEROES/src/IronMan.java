// IronMan.java
package SUPERHEROES;

public class IronMan extends SuperHero {
    public IronMan() {
        super("Iron Man");
    }

    @Override
    public void attack() {
        System.out.println(name + " dispara misiles.");
    }

    @Override
    public void defend() {
        System.out.println(name + " utiliza su armadura para bloquear ataques.");
    }
}
