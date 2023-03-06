package org.example;

import java.util.Scanner;

public class TesseraSanitaria {


    Scanner scanner = new Scanner(System.in);

    private int codZona,codPersona;

    public void tesseraSanitaria() {
        System.out.println("Inserire la prima parte della tessera sanitaria del paziente");
        codZona = scanner.nextInt();
        System.out.println("Inserire la seconda parte della tessera sanitaria del paziente");
        codPersona = scanner.nextInt();
    }
}