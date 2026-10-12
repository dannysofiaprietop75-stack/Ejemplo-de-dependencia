package com.mycompany.documento;

public class Impresora {
    

    public void imprimir(Documento doc) {
        System.out.println("Imprimiendo documento: " + doc.getContenido());
    }
}
