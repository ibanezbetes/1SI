public class Main {

    static int[] valorI = {1};
    static int[] valorV = {5};
    static int[] valorX = {0};

    public static void main(String[] args) {
        String[] ejemplosRomanos = {"I", "XX", "III", "IVII"};

        for (String romano : ejemplosRomanos) {
            int total = contarVariacionesUnicas(romano);
            System.out.println(total);
        }
    }

    public static int contarVariacionesUnicas(String romano) {
        String[] listaCombinaciones = new String[1000];
        int indiceCombinaciones = 0;

        listaCombinaciones[0] = "";
        indiceCombinaciones = 1;

        for (int i = 0; i < romano.length(); i++) {
            char simbolo = romano.charAt(i);
            int[] valoresActuales;

            if (simbolo == 'I') {
                valoresActuales = valorI;
            } else if (simbolo == 'V') {
                valoresActuales = valorV;
            } else { // En caso de ser 'X'
                valoresActuales = valorX;
            }

            int combinacionesTemporales = indiceCombinaciones;
            for (int j = 0; j < combinacionesTemporales; j++) {
                for (int valor : valoresActuales) {
                    listaCombinaciones[indiceCombinaciones] = listaCombinaciones[j] + valor;
                    indiceCombinaciones++;
                }
            }
        }

        // Contar las combinaciones únicas
        int totalUnicas = 0;
        for (int i = 0; i < indiceCombinaciones; i++) {
            boolean duplicado = false;
            for (int j = 0; j < i; j++) {
                if (listaCombinaciones[i].equals(listaCombinaciones[j])) {
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado) {
                totalUnicas++;
            }
        }

        return totalUnicas;
    }
}
