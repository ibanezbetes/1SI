package pelea;

public class Batalla {

    private Maestro maestro1;
    private Maestro maestro2;
    private int ronda;

    public Batalla(Maestro maestro1, Maestro maestro2) {
        this.maestro1 = maestro1;
        this.maestro2 = maestro2;
    }

    public void iniciarBatalla(){

    }

    public Maestro getGanador(){
        return null;
    }

    @Override
    public String toString() {
        return "Batalla{" +
                "maestro1=" + maestro1 +
                ", maestro2=" + maestro2 +
                ", ronda=" + ronda +
                '}';
    }
}
