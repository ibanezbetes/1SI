package Modulo;

import Naves.Nave;

public class ModuloEnergia extends Modulo{

    private int energiaExtra;

    public ModuloEnergia(String nombreModulo, int energiaExtra) {
        super(nombreModulo);
        this.energiaExtra = energiaExtra;
    }

    @Override
    public void usar(Nave n) {
        super.usar(n);
    }
}
