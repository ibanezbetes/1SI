package personajes;

public class NovaEstelar extends GuerreroEvolucionado {

    private Nova baseNova;

    public NovaEstelar(String nombre, int nivel, Nova baseNova) {
        super(nombre, nivel,100,25);
        this.baseNova=baseNova;
    }

    public void ataqueCosmico(){

    }
}
