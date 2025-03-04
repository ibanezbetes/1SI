// warhammer/batallas/Escaramuza.java
package batallas;

import java.util.HashMap;
import personajes.WarhammerPersonaje;
import personajes.Orco;
import personajes.Rompehierro;

/**
 * En la escaramuza guardamos Personajes en dos “bandos”:
 * - "CombatientesBuenos" -> van al Rompehierro principal
 * - "CombatientesMalos" -> van al Orco principal
 */
public class Escaramuza {

    private String nombre;
    private HashMap<String, WarhammerPersonaje> combatientes;
    // Podrías usar 2 Maps distintos. Aquí un ejemplo más sencillo.

    // Referencias al "líder" bueno y "líder" malo
    private Rompehierro liderBuenos;
    private Orco liderMalos;

    public Escaramuza(String nombre) {
        this.nombre = nombre;
        this.combatientes = new HashMap<>();
    }

    public void setLiderBuenos(Rompehierro lider) {
        this.liderBuenos = lider;
    }

    public void setLiderMalos(Orco lider) {
        this.liderMalos = lider;
    }

    /**
     * Añadimos un personaje indicando el bando:
     * "CombatientesBuenos" => lo añadimos al Rompehierro
     * "CombatientesMalos" => lo añadimos al Orco
     */
    public void addPersonajes(String tipo, WarhammerPersonaje personaje) {
        combatientes.put(personaje.getNombre(), personaje);
        if(tipo.equals("CombatientesBuenos") && liderBuenos != null) {
            // Lider buenos añade a su escuadrón si corresponde
            if(personaje instanceof WarhammerPersonaje) {
                // Rompehierro puede añadir Enanos, o atacantes, etc.
                liderBuenos.addEnano((personajes.Enano) personaje);
            }
        } else if(tipo.equals("CombatientesMalos") && liderMalos != null) {
            // Lider malos añade a su escuadrón si corresponde
            if(personaje instanceof personajes.Goblin) {
                liderMalos.addGoblin((personajes.Goblin) personaje);
            }
        }
    }

    public void deletePersonaje(WarhammerPersonaje personaje) {
        combatientes.remove(personaje.getNombre());
        // Podrías también sacarlo del líder correspondiente
    }

    /**
     * Imprimir la escaramuza: listamos los combatientes, etc.
     */
    public String imprimirEscaramuza() {
        StringBuilder sb = new StringBuilder();
        sb.append("Escaramuza: ").append(nombre).append("\n");
        sb.append("Líder Buenos: ").append(liderBuenos).append("\n");
        sb.append("Líder Malos : ").append(liderMalos).append("\n");
        sb.append("Combatientes:\n");
        for(WarhammerPersonaje p : combatientes.values()) {
            sb.append("  - ").append(p).append("\n");
        }
        return sb.toString();
    }

    /**
     * Ejecutar el combate:
     * Orco (y su escuadrón) atacan primero al Rompehierro, luego
     * Rompehierro (y su escuadrón) contra el Orco.
     */
    public void ejecutarCombate() {
        if(liderMalos != null && liderBuenos != null) {
            System.out.println("== Comienza la escaramuza " + nombre + " ==");
            liderMalos.atacar(liderBuenos);
            liderBuenos.atacar(liderMalos);
        }
    }

    @Override
    public String toString() {
        return imprimirEscaramuza();
    }
}
