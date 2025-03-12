package org.example;

class MuroDeFuego implements Defensa {
    @Override
    public int defender(int danoRecibido) {
        int reducido = danoRecibido - getResistenciaBase();
        return Math.max(0, reducido);
    }


    @Override
    public int getResistenciaBase() {
        return 10;
    }
}
