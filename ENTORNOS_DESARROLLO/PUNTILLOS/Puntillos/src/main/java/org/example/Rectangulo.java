public class Rectangulo extends Poligono2D {

    public Rectangulo() {
        super("Rectángulo");
    }

    @Override
    public void validarPoligono() throws Exception {
        if (segmentos.size() != 4) {
            throw new Exception("Un rectángulo debe tener exactamente 4 segmentos.");
        }


        for (int i = 0; i < segmentos.size(); i++) {
            for (int j = i+1; j < segmentos.size(); j++) {
                if (segmentos.get(i).equals(segmentos.get(j))) {
                    throw new Exception("Hay segmentos duplicados en el rectángulo.");
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
        if (puntosUnicos.size() != 4) {
            throw new Exception("Los segmentos no forman un rectángulo válido (no hay 4 puntos únicos).");
        }

        double[] longitudes = new double[4];
        for (int i = 0; i < 4; i++) {
            longitudes[i] = segmentos.get(i).longitud();
        }

        int repes = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j < 4; j++) {
                if (Math.abs(longitudes[i] - longitudes[j]) < 1e-9) {
                    repes++;
                }
            }
        }
        if (repes < 2) {
            throw new Exception("No parece ser un rectángulo: no hay 2 lados de la misma longitud y otros 2 de otra.");
        }
    }
}
