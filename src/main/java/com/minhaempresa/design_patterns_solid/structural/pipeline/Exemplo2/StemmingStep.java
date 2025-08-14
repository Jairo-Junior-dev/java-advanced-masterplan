package com.minhaempresa.design_patterns_solid.structural.pipeline.Exemplo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class StemmingStep implements Steps {
    @Override
    public ResultNLP process(ResultNLP nlp) {
        List<String> filtered = new ArrayList<>();
        for (String string:nlp.getTokens()){
            filtered.add(stem(string));
        }
        nlp.setTokens(filtered);
        return nlp;
    }

private String stem(String string){
    String word = string.toLowerCase(Locale.ROOT);
     String[] sufixos = {
            "mente", "amento", "imento", "ável", "ível", "ização", "izar", "ificar", "icidade", "zão",
            "ez", "eza", "ista", "ismo", "oso", "osa", "al", "ar", "or", "ura", "ice", "ção", "são",
            "ense", "iano", "inho", "inha", "zinho", "zinha", "eco", "eca", "ão", "aço", "aça"
    };
    for (String sufixo : sufixos){
        if (word.endsWith(sufixo) && word.length() > sufixo.length()+2 ){
           return word.substring(0  , word.length() - sufixo.length());
        }
    }
    return word;
}


}
