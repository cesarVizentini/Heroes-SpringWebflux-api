package com.github.cesarvizentini.heroesapi.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Personagem {

    @Id
    private String id;
    private String nome;
    private String universo;
    private String indole;
    private int numFilmes;

}
