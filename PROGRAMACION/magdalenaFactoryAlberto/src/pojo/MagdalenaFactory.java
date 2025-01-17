package pojo;

public class MagdalenaFactory {
    private Magdalena[] listaMagdalenas;

    public MagdalenaFactory(int capacidad) {
        if (capacidad > 0) {
            this.listaMagdalenas = new Magdalena[capacidad];
        } else {
            throw new IllegalArgumentException("La capacidad debe ser mayor que 0.");
        }
    }

    public void addMagdalena(Magdalena magdalena, int posicion) {
        if (posicion >= 0 && posicion < listaMagdalenas.length) {
            listaMagdalenas[posicion] = magdalena;
        } else {
            System.out.println("Posición fuera de los límites del array.");
        }
    }

    public void printMagdalena() {
        for (int i = 0; i < listaMagdalenas.length; i++) {
            if (listaMagdalenas[i] != null) {
                System.out.println("Magdalena " + (i + 1) + ": " + listaMagdalenas[i].toString());
            }
        }
    }
}



