// SpiderMan.java
package SUPERHEROES;

public class SpiderMan extends SuperHero {
    public SpiderMan() {
        super("Spider Man");
    }

    @Override
    public void attack() {
        System.out.println(name + " lanza telarañas para atrapar a sus enemigos.");
    }

    @Override
    public void defend() {
        System.out.println(name + " se balancea y esquiva ataques.");
    }
}
