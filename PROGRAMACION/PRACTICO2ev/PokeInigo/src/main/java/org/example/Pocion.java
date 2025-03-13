package org.example;

class Pocion {
    public void usar(Pokemon p) {
        int cura = 20;
        p.ps += cura;
        if (p.ps > p.psMax) {
            p.ps = p.psMax;
        }
        System.out.println("Se usó Poción en " + p.getNombre()
                + ". Recupera " + cura + " PS, ahora tiene "
                + p.getPs() + "/" + p.getPsMax());
    }
}
