package org.example;

import org.example.herencia.Reporte;
import org.example.printers.PrintToHTML;
import org.example.printers.PrintToJSON;
import org.example.printers.PrintToXML;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Reporte printToJSON = new PrintToJSON("FDAS");
        Reporte printToXML = new PrintToXML("FDSA");

        ArrayList<Reporte> lst = new ArrayList<>();
        lst.add(printToJSON);
        lst.add(printToXML);

    }
}