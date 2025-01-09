import pojo.Magdalena;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Magdalena
        Magdalena magdalena = new Magdalena("Chocolate", "Marrón");
        Magdalena magdalena2 = new Magdalena("Chocolate");
        Magdalena magdalena3 = new Magdalena(15, "Chocolate", "Marrón");
        magdalena.hornear();
        magdalena.mezclar();
        /*
        magdalena.vender();
        magdalena.decorar();
        magdalena.establecerSabor();
        magdalena.amasar();
        magdalena.mojar();
        magdalena.anyadirPepitas();
        magdalena.comer();
        magdalena.envolver();
         */

        Magdalena[] listaMagdalenas = new Magdalena[10];    // Array tamaño fijo
        listaMagdalenas[1] = magdalena;
        ArrayList<Magdalena> lisaMagDin = new ArrayList();  // Array tamoño dinámico
    }
}

