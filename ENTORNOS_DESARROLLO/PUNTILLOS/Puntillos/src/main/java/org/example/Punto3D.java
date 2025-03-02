package org.example;

public class Punto3D extends Punto{
    private int z;

    public Punto3D(){
        super();
        this.z = 0;
    }
    public Punto3D(int x,int y,int z){
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void imprime_coordenadas() {
        System.out.println("("+x+", "+y+", "+z+")");
    }
}
