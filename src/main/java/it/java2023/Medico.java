package it.java2023;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor

@ToString(includeFieldNames = true)
public @Data class Medico {
    private String nome, cognome;
    TesseraSanitaria tesseraSanitaria;
}
