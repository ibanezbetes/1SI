package pojo;

public class MagdalenaPrint {
    public static void printMagdalenas(Magdalena[] magdalenas) {
        for (int i = 0; i < magdalenas.length; i++) {
            if (magdalenas[i] != null) {
                System.out.println("Magdalena " + (i + 1) + ":");
                System.out.println("Sabor: " + magdalenas[i].sabor);
                System.out.println("Color: " + magdalenas[i].color);
                System.out.println("Diámetro: " + magdalenas[i].diametro);
                System.out.println("---------------------------");
            }
        }
    }
}
