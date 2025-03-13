package servicios;

import interfaces.IServicio;

public class AjusteFrenos implements IServicio {
    @Override
    public String getnombreServicio() {
        return ("Ajuste Frenos");
    }

    @Override
    public double getCosto() {
        return 50;
    }
}
