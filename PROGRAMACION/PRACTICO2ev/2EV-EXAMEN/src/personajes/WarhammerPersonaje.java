
// warhammer/personajes/WarhammerPersonaje.java
        package personajes;

import java.util.HashMap;
import armas.Arma;
import armas.ArmaAtaque;
import armas.ArmaDefensa;

/**
 * Clase base abstracta que representa un personaje de Warhammer.
 * Implementa la lógica común de ataque/defensa.
 */
public abstract class WarhammerPersonaje implements ICombate {

    protected String nombre;
    protected int energia;              // Vida actual
    protected final int ENERGIA_MAX = 100;
    protected HashMap<String, Arma> armas; // "Ataque" -> ArmaAtaque; "Defensa" -> ArmaDefensa

    private static int totalPersonajes = 0;

    public WarhammerPersonaje(String nombre) {
        this.nombre = nombre;
        this.energia = ENERGIA_MAX; // Iniciamos con vida al máximo
        this.armas = new HashMap<>();
        totalPersonajes++;
    }

    // Para ver cuántos personajes se han creado
    public static int totalNumPersonajes() {
        return totalPersonajes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void restarEnergia(int cantidad) {
        this.energia -= cantidad;
        if(this.energia < 0) {
            this.energia = 0;
        }
    }

    /**
     * Añade un arma de ataque al HashMap con la clave "Ataque".
     * Si ya existe, la reemplaza y avisa por consola.
     */
    public void addArmaAtaque(ArmaAtaque arma) {
        if(armas.containsKey("Ataque")) {
            System.out.println("Reemplazando arma de ataque en " + this.nombre);
        }
        armas.put("Ataque", arma);
    }

    /**
     * Añade un arma de defensa al HashMap con la clave "Defensa".
     * Si ya existe, la reemplaza y avisa por consola.
     */
    public void addArmaDefensa(ArmaDefensa arma) {
        if(armas.containsKey("Defensa")) {
            System.out.println("Reemplazando arma de defensa en " + this.nombre);
        }
        armas.put("Defensa", arma);
    }

    // Implementación por la interfaz ICombate
    @Override
    public void atacar(WarhammerPersonaje victima) {
        // Buscamos si hay un arma de ataque
        Arma armaAtaque = armas.get("Ataque");
        if(armaAtaque != null && armaAtaque instanceof ArmaAtaque) {
            ((ArmaAtaque)armaAtaque).atacar(victima);
        } else {
            System.out.println(this.nombre + " no tiene arma de ataque para golpear a " + victima.getNombre());
        }
    }

    @Override
    public void defender(ArmaAtaque armaAtacante) {
        // Buscamos si hay un arma de defensa
        Arma armaDefensa = armas.get("Defensa");
        if(armaDefensa != null && armaDefensa instanceof ArmaDefensa) {
            ((ArmaDefensa)armaDefensa).defender(this, armaAtacante);
        } else {
            // Sin arma de defensa, recibimos todo el daño
            restarEnergia(armaAtacante.getVidaConsumida());
        }
    }

    @Override
    public String toString() {
        return "Personaje: " + nombre
                + " [energia=" + energia + "]";
    }
}