package com.minhaempresa.design_patterns_solid.structural.pipeline.Exemplo2;

public class Entidade {
    private String texto;
    private String tipo;

    public Entidade(String texto, String tipo) {
        this.texto = texto;
        this.tipo = tipo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Entidade{" +
                "texto='" + texto + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
