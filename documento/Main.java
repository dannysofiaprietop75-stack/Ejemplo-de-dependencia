package com.mycompany.documento;

public class Main {
    public static void main(String[] args) {
  
        Documento miDocumento = new Documento("Informe de Programación Orientada a Objetos.");
        Impresora miImpresora = new Impresora();

        // Demostramos la dependencia: la impresora usa el documento temporalmente
        miImpresora.imprimir(miDocumento);
    }
}