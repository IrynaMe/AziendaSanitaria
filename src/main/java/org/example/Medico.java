/*
una classe Medico avente, come
variabile d’istanza tipo stringa, il nominativo del medico come e con un metodo d’accesso
ed un costruttore.
 */
package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Scanner;

@AllArgsConstructor
@Data

public class Medico {
    Scanner scanner = new Scanner(System.in);

    private String nome,cognome;
    private int codZona,codPersona;
    private TesseraSanitaria tesseraSanitaria;




}
