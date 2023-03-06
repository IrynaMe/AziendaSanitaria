/*
una classe Paziente avente come variabili d’istanza il
numero (intero) di tessera sanitaria ed un riferimento al proprio medico curante, con i relativi
metodi di accesso ed un costruttore
 */
package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Paziente {

    Scanner scanner = new Scanner(System.in);
    private String nome,cognome;
    private int codZona,codPersona;
    private TesseraSanitaria tesseraSanitaria;
    private Medico medico;


}