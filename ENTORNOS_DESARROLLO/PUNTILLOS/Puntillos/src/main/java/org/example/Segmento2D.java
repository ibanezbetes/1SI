public class Segmento2D {
    private Punto2D p1;
    private Punto2D p2;

    public Segmento2D(Punto2D p1, Punto2D p2) {
        if (p1.equals(p2)) {
            throw new IllegalArgumentException("Los dos puntos son iguales. No es un segmento válido.");
        }
        this.p1 = p1;
        this.p2 = p2;
    }

    public Punto2D getP1() {
        return p1;
    }

    public Punto2D getP2() {
        return p2;
    }

    public double longitud() {
        return p1.distancia(p2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Segmento2D other = (Segmento2D) obj;

        boolean mismoOrden  = this.p1.equals(other.p1) && this.p2.equals(other.p2);
        boolean ordenCruce =  this.p1.equals(other.p2) && this.p2.equals(other.p1);
        return (mismoOrden || ordenCruce);
    }

    @Override
    public String toString() {
        return "Segmento[" + p1 + " - " + p2 + "]";
    }
}
