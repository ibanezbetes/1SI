import java.util.ArrayList;

public abstract class Poligono2D {
    protected String nombre;
    protected ArrayList<Segmento2D> segmentos;

    public Poligono2D(String nombre) {
        this.nombre = nombre;
        this.segmentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Segmento2D> getSegmentos() {
        return segmentos;
    }


    public void addSegmento(Segmento2D s) {
        this.segmentos.add(s);
    }


    public abstract void validarPoligono() throws Exception;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre).append(" con segmentos:\n");
        for (Segmento2D s : segmentos) {
            sb.append("  ").append(s).append("\n");
        }
        return sb.toString();
    }
}
