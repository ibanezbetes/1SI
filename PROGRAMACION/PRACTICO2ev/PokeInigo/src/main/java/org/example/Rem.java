package org.example;

class Rem {
    public void usar(Pokemon p) {
        p.ps = p.psMax;
        System.out.println("Se usó Rem en " + p.getNombre()
                + ". PS restaurados al máximo: "
                + p.getPs() + "/" + p.getPsMax());
    }
}
