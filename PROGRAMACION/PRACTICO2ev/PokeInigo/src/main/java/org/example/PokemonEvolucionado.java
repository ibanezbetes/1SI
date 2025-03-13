package org.example;

abstract class PokemonEvolucionado extends Pokemon {
    protected int bonificacionEvo;


    public PokemonEvolucionado(String nombre, int nivel, int psMax, int bonificacionEvo) {
        super(nombre, nivel, psMax);
        this.bonificacionEvo = bonificacionEvo;
    }

    @Override
    public void evolucionar() {
        nivel += bonificacionEvo;
        psMax += bonificacionEvo * 5;
        ps = psMax; // se recupera la vida al máximo tras evolucionar
        System.out.println(nombre + " evolucionó. ¡Nivel " + nivel + ", PS máx " + psMax + "!");
    }
}
