// DoctorStrange.java
package SUPERHEROES;

public class DoctorStrange extends SuperHero {
    public DoctorStrange() {
        super("Doctor Strange");
    }

    @Override
    public void attack() {
        System.out.println(name + " lanza hechizos mágicos.");
    }

    @Override
    public void defend() {
        System.out.println(name + " crea barreras místicas para defenderse.");
    }
}
