public class Triangulo extends Poligono2D {

    public Triangulo() {
        super("Triángulo");
    }

    @Override
    public void validarPoligono() throws Exception {
        if (segmentos.size() != 3) {
            throw new Exception("Un triángulo debe tener exactamente 3 segmentos.");
        }

        for (int i = 0; i < segmentos.size(); i++) {
            for (int j = i+1; j < segmentos.size(); j++) {
                if (segmentos.get(i).equals(segmentos.get(j))) {
                    throw new Exception("Hay segmentos duplicados en el triángulo.");
                }
            }
        }

        ArrayList<Punto2D> puntos = new ArrayList<>();
        for (Segmento2D seg : segmentos) {
            puntos.add(seg.getP1());
            puntos.add(seg.getP2());
        }
        ArrayList<Punto2D> puntosUnicos = new ArrayList<>();
        for (Punto2D p : puntos) {
            if (!puntosUnicos.contains(p)) {
                puntosUnicos.add(p);
            }
        }
        if (puntosUnicos.size() != 3) {
            throw new Exception("Los segmentos no forman un triángulo válido (no hay 3 puntos únicos).");
        }
    }
}
