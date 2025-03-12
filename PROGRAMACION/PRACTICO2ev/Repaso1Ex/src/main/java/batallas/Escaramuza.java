package batallas;

import personajes.Orco;
import personajes.Rompehierro;
import personajes.WarhammerPersonaje;

import java.util.HashMap;

public class Escaramuza {

    private String nombre;
    protected HashMap<String, WarhammerPersonaje> combatientes;

    private Rompehierro liderBuenos;
    private Orco liderMalos;



    public Escaramuza(String nombre) {
        this.nombre = nombre;
        this.combatientes=new HashMap<>();
    }

    public void setLiderBuenos(Rompehierro liderBuenos) {
        this.liderBuenos = liderBuenos;
    }

    public void setLiderMalos(Orco liderMalos) {
        this.liderMalos = liderMalos;
    }

    public void addPersonajes(String tipo, WarhammerPersonaje personaje){
        combatientes.put(personaje.getNombre(),personaje);
        if (tipo.equals("CombatientesBuenos") && liderBuenos!=null){
                liderBuenos.addEnano((personajes.Enano)personaje);
            } else if (tipo.equals("CombatientesMalos") && liderMalos !=null){
            liderMalos.addGoblin((personajes.Goblin)personaje);
        }
    }


    public void deletePersonajes(WarhammerPersonaje personaje){
            combatientes.remove(personaje.getNombre());
    }

    public String imprimirEscaramuza() {
        return nombre + ": " + liderBuenos + " vs " + liderMalos;
    }


    public void ejecutarCombate(){
        if (liderMalos!=null && liderBuenos!=null){
            System.out.println();
            System.out.println("Comienza la " + nombre);
            liderBuenos.atacar(liderMalos);
            liderMalos.atacar(liderBuenos);
        }
    }

    @Override
    public String toString() {
        return "Escaramuza{" +
                "nombre='" + nombre + '\'' +
                ", combatientes=" + combatientes +
                ", liderBuenos=" + liderBuenos +
                ", liderMalos=" + liderMalos +
                '}';
    }
}
