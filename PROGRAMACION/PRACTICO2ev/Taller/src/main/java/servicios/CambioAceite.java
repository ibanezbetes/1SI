package servicios;

import interfaces.IServicio;

public class CambioAceite implements IServicio {
    @Override
    public String getnombreServicio() {
        return ("Cambio Aceite");
    }

    @Override
    public double getCosto() {
        return 30;
    }
}
