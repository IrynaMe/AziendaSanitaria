package org.example;

import com.mysql.cj.jdbc.Driver;
import com.sun.jdi.connect.spi.Connection;

import java.sql.DriverManager;
import java.util.ArrayList;

public class Utilita {
    Connection conn = null;
    private boolean ispresente=false;
    private
    ArrayList<Paziente> listaPazienti= new ArrayList<Paziente>();
    public boolean isUnico(){
        for (Paziente paziente:listaPazienti) {
            for (int i = 0; i < listaPazienti.size(); i++) {
                if (!paziente.getTesseraSanitaria().equals(listaPazienti.get(i).getTesseraSanitaria())) {
                    ispresente = true;
                } else System.out.println("paziente gia presente in elenco");
            }
        }
        return ispresente;
    }

}
