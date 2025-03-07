// ThorWithSuperAttack.java
package SUPERHEROES;

public class ThorWithSuperAttack extends Thor implements SuperAttack {
    public ThorWithSuperAttack() {
        super();
    }

    @Override
    public void executeSuperAttack() {
        System.out.println(name + " desata el poder de una tormenta eléctrica sobre sus enemigos.");
    }
}
