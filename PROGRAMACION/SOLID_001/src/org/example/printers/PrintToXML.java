package org.example.printers;

import org.example.herencia.Reporte;

// public class PrintToXML extends Reporte implements Print {
public class PrintToXML extends Reporte  {
    private String cadenaEnHtml;
    public PrintToXML(String cadena){
        super(cadena);
    }
    void imprimirCadena(){
        System.out.println(super.cadenaATransformar);
        System.out.println(this.cadenaEnHtml);
    }
}

