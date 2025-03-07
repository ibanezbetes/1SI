// DoctorStrangeWithSuperAttack.java
package SUPERHEROES;

public class DoctorStrangeWithSuperAttack extends DoctorStrange implements SuperAttack {
    public DoctorStrangeWithSuperAttack() {
        super();
    }

    @Override
    public void executeSuperAttack() {
        System.out.println(name + " convoca las artes místicas para lanzar un ataque devastador.");
    }
}
