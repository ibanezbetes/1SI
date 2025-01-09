package pojo;

public class MagdalenaFactory {
    public static Magdalena[] addMagdalena() {
        Magdalena[] magdalenas = new Magdalena[4];
        magdalenas[0] = new Magdalena(11,"Chocolate", "Marrón");
        magdalenas[1] = new Magdalena(13, "Vainilla", "Blanco");
        magdalenas[2] = new Magdalena(12, "Fresa", "Rosa");
        magdalenas[3] = new Magdalena(10, "Limón", "Amarillo");
        return magdalenas;
    }
}
