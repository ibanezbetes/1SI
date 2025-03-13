package personajes;

import armas.Arma;
import armas.ArmaAtaque;
import armas.ArmaDefensa;

import java.util.HashMap;

public abstract class WarhammerPersonaje {

    protected String nombre;
    protected int energia;
    protected HashMap<String, Arma> armas;
    protected static int contPersonajes=0;
    protected final int ENERGIA_MAX=100;

    public WarhammerPersonaje(String nombre) {
        this.nombre = nombre;
        this.energia = ENERGIA_MAX;
        this.armas = new HashMap<>();
        contPersonajes++;
    }

    public void restarEnergia(int cantidad){
            this.energia-=cantidad;
            if (this.energia<0){
                this.energia=0;
            }
    }

    public static int toNumPersonajes(){
        return contPersonajes;
    }

    public String imprimirArmas(){
        return "";
    }

    @Override
    public String toString() {
        return "WarhammerPersonaje{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", armas=" + armas +
                ", ENERGIA_MAX=" + ENERGIA_MAX +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void atacar(WarhammerPersonaje victima){
        Arma armaAtaque=armas.get("Ataque");
        if (armaAtaque instanceof ArmaAtaque){
            ((ArmaAtaque)armaAtaque).atacar(victima);
        }else {
            System.out.println(this.nombre + " no tiene arma de ataque");
        }
    }

    public void defender(ArmaAtaque armaAtacante){
        Arma armaDefensa=armas.get("Defensa");
        if (armaDefensa instanceof ArmaDefensa){
            ((ArmaDefensa)armaDefensa).defender(this,armaAtacante);
        }else {
            restarEnergia(armaAtacante.getVIDA_CONSUMIDA());
        }
    }
}
