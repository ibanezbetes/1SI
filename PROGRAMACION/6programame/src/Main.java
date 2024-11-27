import java.util.Scanner;

public class Main {

    public static String conjugacionPresente(String accion, String sujeto) {
        String raizVerbo = accion.substring(0, accion.length() - 2);
        String terminacionVerbo = "";
        if (accion.endsWith("ar")) {
            switch (sujeto) {
                case "yo": terminacionVerbo = "o"; break;
                case "tu": terminacionVerbo = "as"; break;
                case "el": terminacionVerbo = "a"; break;
                case "nosotros": terminacionVerbo = "amos"; break;
                case "vosotros": terminacionVerbo = "ais"; break;
                case "ellos": terminacionVerbo = "an"; break;
            }
        } else if (accion.endsWith("er")) {
            switch (sujeto) {
                case "yo": terminacionVerbo = "o"; break;
                case "tu": terminacionVerbo = "es"; break;
                case "el": terminacionVerbo = "e"; break;
                case "nosotros": terminacionVerbo = "emos"; break;
                case "vosotros": terminacionVerbo = "eis"; break;
                case "ellos": terminacionVerbo = "en"; break;
            }
        } else if (accion.endsWith("ir")) {
            switch (sujeto) {
                case "yo": terminacionVerbo = "o"; break;
                case "tu": terminacionVerbo = "es"; break;
                case "el": terminacionVerbo = "e"; break;
                case "nosotros": terminacionVerbo = "imos"; break;
                case "vosotros": terminacionVerbo = "is"; break;
                case "ellos": terminacionVerbo = "en"; break;
            }
        }
        return sujeto + " " + raizVerbo + terminacionVerbo;
    }

    public static String conjugacionPreterito(String accion, String sujeto) {
        String raizVerbo = accion.substring(0, accion.length() - 2);
        String terminacionVerbo = "";
        if (accion.endsWith("ar")) {
            switch (sujeto) {
                case "yo": terminacionVerbo = "e"; break;
                case "tu": terminacionVerbo = "aste"; break;
                case "el": terminacionVerbo = "o"; break;
                case "nosotros": terminacionVerbo = "amos"; break;
                case "vosotros": terminacionVerbo = "asteis"; break;
                case "ellos": terminacionVerbo = "aron"; break;
            }
        } else if (accion.endsWith("er") || accion.endsWith("ir")) {
            switch (sujeto) {
                case "yo": terminacionVerbo = "i"; break;
                case "tu": terminacionVerbo = "iste"; break;
                case "el": terminacionVerbo = "io"; break;
                case "nosotros": terminacionVerbo = "imos"; break;
                case "vosotros": terminacionVerbo = "isteis"; break;
                case "ellos": terminacionVerbo = "ieron"; break;
            }
        }
        return sujeto + " " + raizVerbo + terminacionVerbo;
    }

    public static String conjugacionFuturo(String accion, String sujeto) {
        String terminacionVerbo = "";
        if (accion.endsWith("ar") || accion.endsWith("er") || accion.endsWith("ir")) {
            switch (sujeto) {
                case "yo": terminacionVerbo = "e"; break;
                case "tu": terminacionVerbo = "as"; break;
                case "el": terminacionVerbo = "a"; break;
                case "nosotros": terminacionVerbo = "emos"; break;
                case "vosotros": terminacionVerbo = "eis"; break;
                case "ellos": terminacionVerbo = "an"; break;
            }
        }
        return sujeto + " " + accion + terminacionVerbo;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean esPrimeraVez = true;
        boolean primerSaltoLinea = true;
        while (true) {
            String accion = entrada.next();
            String tiempoVerbal = entrada.next();
            if (tiempoVerbal.equals("T")) break;
            if (!esPrimeraVez) {
                System.out.println();
            }
            esPrimeraVez = false;
            if (primerSaltoLinea) {
                System.out.println();
                primerSaltoLinea = false;
            }
            String[] sujetos = {"yo", "tu", "el", "nosotros", "vosotros", "ellos"};
            for (String sujeto : sujetos) {
                switch (tiempoVerbal) {
                    case "A":
                        System.out.println(conjugacionPresente(accion, sujeto));
                        break;
                    case "P":
                        System.out.println(conjugacionPreterito(accion, sujeto));
                        break;
                    case "F":
                        System.out.println(conjugacionFuturo(accion, sujeto));
                        break;
                }
            }
        }
        entrada.close();
    }
}
