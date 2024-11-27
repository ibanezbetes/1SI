import java.util.Scanner;

public class Main {
    static Scanner in;

    public static void main(String[] args) {
        int numCasos = in.nextInt();

        for (int i = 0; i < numCasos; i++) {
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();

            int distanciaA;
            //Distancia entre A y B
            if(A>B){
                distanciaA = A - B;
            }else{
                distanciaA = B - A;
            }

            int distanciaC;
            //Distancia entre C y B
            if(C>B){
                distanciaA = C - B;
            }else{
                distanciaA = B - C;
            }

            if(distanciaA > distanciaC) {
                System.out.println("A");
            }else if(distanciaC > distanciaA){
                System.out.println("C");
            }else{
                System.out.println("EMPATE");
            }
            in.close();
        }
    }
}