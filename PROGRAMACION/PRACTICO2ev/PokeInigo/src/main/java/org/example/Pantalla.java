package org.example;

class Pantalla implements Defensa {
    @Override
    public int defender(int danoRecibido) {
        int reducido = danoRecibido - getResistenciaBase();
        return Math.max(0, reducido);
    }


    @Override
    public int getResistenciaBase() {
        return 8;
    }
}
