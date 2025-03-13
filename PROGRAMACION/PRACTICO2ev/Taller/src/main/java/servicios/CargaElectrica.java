package servicios;

import interfaces.IServicio;

public class CargaElectrica implements IServicio {
    @Override
    public String getnombreServicio() {
        return ("Carga Electrica");
    }

    @Override
    public double getCosto() {
        return 20;
    }
}
