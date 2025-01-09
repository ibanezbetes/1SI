public class MagdalenaFactory {
    int contador = 0;
    private Magdalena[] lstMagdalena = new Magdalena[4];

    private void addMagdalena(Magdalena miMagdalena) {
        lstMagdalena[contador] = MiMagdalena;
        contador++;
    }
    private void printMagdalena() {
        for (int i = 0; i < lstMagdalena.length; i++) {
            Magdalena magdalena = lstMagdalena[i];
            System.out.println("Magdalena: [" + i + "] ");
            System.out.println("Atributos: Sabor - " + magdalena.getSabor());
            System.out.println("Atributos: Color - " + magdalena.getColor());
        }
    }
}