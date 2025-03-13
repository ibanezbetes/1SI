
// warhammer/personajes/Goblin.java
package personajes;

public class Goblin extends PielVerde {

    private int nivel;

    public Goblin(String nombre, String puebloNacimiento, int nivel) {
        super(nombre, puebloNacimiento);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    // Podrías sobreescribir atacar, defender si se requiere
    // ...

    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", puebloNacimiento='" + puebloNacimiento + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}