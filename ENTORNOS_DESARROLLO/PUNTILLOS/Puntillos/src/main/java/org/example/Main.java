import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {

            Punto2D A = new Punto2D(0,0);
            Punto2D B = new Punto2D(2,0);
            Punto2D C = new Punto2D(1,2);

            Segmento2D s1 = new Segmento2D(A, B);
            Segmento2D s2 = new Segmento2D(B, C);
            Segmento2D s3 = new Segmento2D(C, A);

            Triangulo t = new Triangulo();
            t.addSegmento(s1);
            t.addSegmento(s2);
            t.addSegmento(s3);

            t.validarPoligono();
            System.out.println("Triángulo creado con éxito:");
            System.out.println(t);


            Punto2D P1 = new Punto2D(0,0);
            Punto2D P2 = new Punto2D(2,0);
            Punto2D P3 = new Punto2D(2,2);
            Punto2D P4 = new Punto2D(0,2);

            Segmento2D c1 = new Segmento2D(P1, P2);
            Segmento2D c2 = new Segmento2D(P2, P3);
            Segmento2D c3 = new Segmento2D(P3, P4);
            Segmento2D c4 = new Segmento2D(P4, P1);

            Cuadrado cuad = new Cuadrado();
            cuad.addSegmento(c1);
            cuad.addSegmento(c2);
            cuad.addSegmento(c3);
            cuad.addSegmento(c4);

            cuad.validarPoligono();
            System.out.println("Cuadrado creado con éxito:");
            System.out.println(cuad);


            Punto2D R1 = new Punto2D(0,0);
            Punto2D R2 = new Punto2D(4,0);
            Punto2D R3 = new Punto2D(4,2);
            Punto2D R4 = new Punto2D(0,2);

            Segmento2D r1 = new Segmento2D(R1, R2);
            Segmento2D r2 = new Segmento2D(R2, R3);
            Segmento2D r3 = new Segmento2D(R3, R4);
            Segmento2D r4 = new Segmento2D(R4, R1);

            Rectangulo rect = new Rectangulo();
            rect.addSegmento(r1);
            rect.addSegmento(r2);
            rect.addSegmento(r3);
            rect.addSegmento(r4);

            rect.validarPoligono();
            System.out.println("Rectángulo creado con éxito:");
            System.out.println(rect);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
