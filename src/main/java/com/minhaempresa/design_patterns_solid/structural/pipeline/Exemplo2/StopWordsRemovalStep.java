package com.minhaempresa.design_patterns_solid.structural.pipeline.Exemplo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class StopWordsRemovalStep implements Steps{
    @Override
    public ResultNLP process(ResultNLP nlp) {
        // Tem duas formas uma usando a lambda e outra mais arcaica;Vou pela forma arcaica mesmo
        List<String>listaFiltrada = new ArrayList<>();
        for (String token:nlp.getTokens()){
            if (!palavrasDesnecessarias.contains(token)){
                listaFiltrada.add(token.toLowerCase());
            }
        }
        nlp.setTokens(listaFiltrada);
        return nlp;
    }
    private final static Set<String>
            palavrasDesnecessarias
            =
            Set.of("o", "a", "os", "as", "de", "do", "da", "e", "em", "mas", "que", "com", "um"
        );
    }

