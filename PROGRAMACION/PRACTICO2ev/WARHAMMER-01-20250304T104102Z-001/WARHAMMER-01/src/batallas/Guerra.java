// warhammer/batallas/Guerra.java
package batallas;

import java.util.ArrayList;
import personajes.WarhammerPersonaje;

public class Guerra {

    private String nombre;
    private ArrayList<Escaramuza> lstEscaramuzas;

    public Guerra(String nombre) {
        this.nombre = nombre;
        this.lstEscaramuzas = new ArrayList<>();
    }

    public void addEscaramuza(Escaramuza batalla) {
        lstEscaramuzas.add(batalla);
    }

    /**
     * Añade un personaje a una escaramuza concreta.
     * (Ejemplo: si el personaje debe ir a "CombatientesBuenos" o "Malos".)
     */
    public void addPersonajeAEscaramuza(Escaramuza batalla,
                                        WarhammerPersonaje personaje,
                                        String tipo)
    {
        batalla.addPersonajes(tipo, personaje);
    }

    public void imprimirGuerra() {
        System.out.println("=== Guerra: " + nombre + " ===");
        for(Escaramuza e : lstEscaramuzas) {
            System.out.println(e.imprimirEscaramuza());
        }
    }

    @Override
    public String toString() {
        return "Guerra: " + nombre + " (#Escaramuzas=" + lstEscaramuzas.size() + ")";
    }
}
