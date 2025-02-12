public class Punto {

    private int x;
    private int y;
    private int z;

    public void Punto() {
        x = 0;
        y = 0;
        z = 0;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void Punto(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Punto {" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
