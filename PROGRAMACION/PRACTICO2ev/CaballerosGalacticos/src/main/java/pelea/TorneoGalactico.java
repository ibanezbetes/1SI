package pelea;

import java.util.ArrayList;

public class TorneoGalactico {

    private ArrayList batallas;
    private String premio;

    public TorneoGalactico(String premio) {
        this.batallas = new ArrayList<>();
        this.premio = premio;
    }

    public void agregarBatalla(Batalla nuevaBatalla){

    }

    public void iniciarTorneo(){

    }

    @Override
    public String toString() {
        return "{" +
                "Batallas=" + batallas +
                ", Premio='" + premio + '\'' +
                '}';
    }
}
