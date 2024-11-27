//explica el error

public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {4, 9, 6}
        };

        System.out.println("Elemento en la posición (2,2): " + matriz[2][2]);
        //intenta ir a una fila que no existe, solo hay fila posicion 0 y posicion 1
    }
}
