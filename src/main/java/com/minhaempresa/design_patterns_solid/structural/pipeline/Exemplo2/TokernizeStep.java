package com.minhaempresa.design_patterns_solid.structural.pipeline.Exemplo2;

import java.util.Arrays;
//Passo que serve para Quebrar em pequenas partes, removendo as pontuações.
public class TokernizeStep implements Steps{

    @Override
    public ResultNLP process(ResultNLP nlp) {
        String texto = nlp.getTextoOriginal();
        if (texto == null|| texto.isEmpty()){
            throw  new IllegalArgumentException("Texto nao pode ser nulo.");
        }
        nlp.setTokens(Arrays.asList(texto.split("[\\s,.!?]+")));
        return nlp;
    }
}
