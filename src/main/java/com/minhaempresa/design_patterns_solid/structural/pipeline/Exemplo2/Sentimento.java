package com.minhaempresa.design_patterns_solid.structural.pipeline.Exemplo2;

public class Sentimento {
    private double sentimentosPositivos;
    private double sentimentosNegativos;
    public Sentimento(double sentimentosNegativos , double sentimentosPositivos){
        this.sentimentosNegativos =sentimentosNegativos;
        this.sentimentosPositivos = sentimentosPositivos;
    }

    public double getSentimentosPositivos() {
        return sentimentosPositivos;
    }

    public void setSentimentosPositivos(double sentimentosPositivos) {
        this.sentimentosPositivos = sentimentosPositivos;
    }

    public double getSentimentosNegativos() {
        return sentimentosNegativos;
    }

    public void setSentimentosNegativos(double sentimentosNegativos) {
        this.sentimentosNegativos = sentimentosNegativos;
    }
}
