public class Punto2D {
    private double x;
    private double y;

    public Punto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() { return x; }
    public double getY() { return y; }


    public double distancia(Punto2D otro) {
        double dx = this.x - otro.x;
        double dy = this.y - otro.y;
        return Math.sqrt(dx*dx + dy*dy);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;         // mismo objeto
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Punto2D other = (Punto2D) obj;
        return Double.compare(this.x, other.x) == 0
                && Double.compare(this.y, other.y) == 0;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
