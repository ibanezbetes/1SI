import Modulo.Capitan;
import Naves.Nave;
import Naves.NaveCaza;
import Naves.NaveDestructor;

// Programa principal
public class Main {
    public static void main(String[] args) {
        Capitan capitan1 = new Capitan("John");
        Capitan capitan2 = new Capitan("Doe");

        Nave nave1 = new NaveCaza("Interceptor");
        Nave nave2 = new NaveDestructor("Destructor Omega");

        capitan1.anadirNave(nave1);
        capitan2.anadirNave(nave2);

        CombateEspacial combate = new CombateEspacial(capitan1, capitan2, nave1, nave2);
        combate.iniciarCombate();
        combate.mostrarResultado();
    }
}