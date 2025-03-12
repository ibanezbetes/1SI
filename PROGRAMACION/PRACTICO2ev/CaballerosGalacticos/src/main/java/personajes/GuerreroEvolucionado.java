package personajes;

public class GuerreroEvolucionado extends Guerrero{

    protected int bonificacionEvolucion;

    public GuerreroEvolucionado(String nombre, int nivel, int vidaMaxima,int bonificacionEvolucion) {
        super(nombre, nivel, vidaMaxima);
        this.bonificacionEvolucion=bonificacionEvolucion;
    }

    public void evolucionar(){

    }

}
