package com.minhaempresa.design_patterns_solid.creational.factorymethod;


public class LojaEletrodomesticos extends Loja {
    public LojaEletrodomesticos(String caminhoCatalogo) {
        super(caminhoCatalogo);
    }

    @Override
    protected Aparelhos criarAparelho(String tipo, String nome, double preco) {
        return switch (tipo) {
            case "Televisao" -> new Televisao(nome, preco);
            case "Radio" -> new Radio(nome, preco);
            case "Geladeira" -> new Geladeira(nome, preco);
            default -> throw new IllegalArgumentException("Tipo de aparelho não reconhecido: " + tipo);
        };
    }
}
