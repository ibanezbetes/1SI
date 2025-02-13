package org.example.printers;

import org.example.herencia.Reporte;
import org.example.interfaces.Print;

public class PrintToJSON extends Reporte {
    private String cadenaEnHtml;
    public PrintToJSON(String cadena){
        super(cadena);
    }
    void imprimirCadena(){
        System.out.println(super.cadenaATransformar);
        System.out.println(this.cadenaEnHtml);
    }
}
