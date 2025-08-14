package com.minhaempresa.design_patterns_solid.structural.pipeline.Exemplo2;

import java.util.List;

public class ResultNLP {
    private List<Entidade> entidades;
    private Sentimento sentimento;
    private String textoOriginal;      // O texto inicial que entra no pipeline

    public String getTextoOriginal() {
        return textoOriginal;
    }

    public void setTextoOriginal(String textoOriginal) {
        this.textoOriginal = textoOriginal;
    }

    public List<String> getTokens() {
        return tokens;
    }

    public void setTokens(List<String> tokens) {
        this.tokens = tokens;
    }

    private List<String> tokens;

    public ResultNLP() {}

    public ResultNLP(List<Entidade> entidades, Sentimento sentimento) {
        this.entidades = entidades;
        this.sentimento = sentimento;
    }

    public List<Entidade> getEntidades() {
        return entidades;
    }

    public void setEntidades(List<Entidade> entidades) {
        this.entidades = entidades;
    }

    public Sentimento getSentimento() {
        return sentimento;
    }

    public void setSentimento(Sentimento sentimento) {
        this.sentimento = sentimento;
    }

    @Override
    public String toString() {
        return "ResultNLP{" +
                "entidades=" + entidades +
                ", sentimento=" + sentimento +
                '}';
    }
}
