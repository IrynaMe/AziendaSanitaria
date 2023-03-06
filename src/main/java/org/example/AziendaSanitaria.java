/*
la classe AziendaSanitaria, coi seguenti
metodi: Il metodo aggPaziente inserisce un oggetto paziente nella arraylist pazienti, con un
riferimento al proprio medico curante nella arraylist medici. Non devono mai essere duplicati
pazienti o medici. Il metodo listaMedico restituisce una arraylist con tutti e soli i pazienti che
hanno il medico specificato dal parametro esplicito come medico curante. Il metodo
statMedico restituisce un riferimento al medico nella arraylist medici avente il maggior
numero di pazienti. Sviluppare tutti i metodi della classe AziendaSanitaria.
 */
package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class AziendaSanitaria extends Utilita{

    Scanner scanner = new Scanner(System.in);




    public void aggMedico(){

    }

    public void aggPaziente(){
        if (isUnico()){

        }
    }


    public void listaMedico(){
        System.out.println("inserire il medico da cercare");
        String medico = scanner.next();
        System.out.println("il medico " + medico + " ha i seguenti pazienti");

    }
    public void statMedico(){

    }
    public  void cancellaPaziente(){

    }
    public void cambioMedicoPaziente(){

    }

    public  void sostituzioneMedico(){

    }

}