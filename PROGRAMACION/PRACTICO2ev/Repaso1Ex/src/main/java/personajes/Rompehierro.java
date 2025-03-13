package personajes;

import armas.ArmaAtaque;
import armas.ArmaDefensa;

import java.util.ArrayList;

public class Rompehierro  extends Enano{

    ArrayList<Enano> listaEnanos;
    private personajes.Enano Enano;

    public Rompehierro(String nombre,int riqueza) {
        super(nombre, riqueza);
        listaEnanos=new ArrayList<>();
    }

    public ArrayList<Enano> getListaEnanos(){
        return null;
    }


    public void addArmaAtaque(String arma) {

    }


    public void addArmaDefensa(String arma) {

    }



    public void addEnano(Enano enano){
        listaEnanos.add(enano);
    }

    @Override
    public String toString() {
        return "{" +
                "Nombre = '" + nombre + '\'' +
                ", Riqueza = " + riqueza +
                '}';
    }

    @Override     //ATAQUE ROMPEHIEROS -1
    public void atacar(WarhammerPersonaje victima){
           super.atacar(victima);
    }


    public void defender(ArmaAtaque armaAtacante){

    }
}

