public class Cuadrado extends Poligono2D {

    public Cuadrado() {
        super("Cuadrado");
    }

    @Override
    public void validarPoligono() throws Exception {
        if (segmentos.size() != 4) {
            throw new Exception("Un cuadrado debe tener exactamente 4 segmentos.");
        }


        for (int i = 0; i < segmentos.size(); i++) {
            for (int j = i+1; j < segmentos.size(); j++) {
                if (segmentos.get(i).equals(segmentos.get(j))) {
                    throw new Exception("Hay segmentos duplicados en el cuadrado.");
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
            throw new Exception("Los segmentos no forman un cuadrado válido (no hay 4 puntos únicos).");
        }


        double primeraLongitud = segmentos.get(0).longitud();
        for (int i = 1; i < segmentos.size(); i++) {
            double otraLongitud = segmentos.get(i).longitud();

            if (Math.abs(primeraLongitud - otraLongitud) > 1e-9) {
                throw new Exception("No todos los lados del cuadrado miden lo mismo.");
            }
        }
    }
}
