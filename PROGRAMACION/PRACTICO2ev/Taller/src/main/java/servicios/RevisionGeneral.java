package servicios;

import interfaces.IServicio;

public class RevisionGeneral implements IServicio {
    @Override
    public String getnombreServicio() {
        return ("Revision General");
    }

    @Override
    public double getCosto() {
        return 70;
    }
}
