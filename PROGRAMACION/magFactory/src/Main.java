import pojo.Magdalena;
import pojo.MagdalenaFactory;
import pojo.MagdalenaPrint;

public class Main {
    public static void main(String[] args) {
        Magdalena[] magdalenas = MagdalenaFactory.addMagdalena();

        MagdalenaPrint.printMagdalenas(magdalenas);
    }
}
