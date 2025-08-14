package com.minhaempresa.design_patterns_solid.creational.factorymethod;

public class Televisao implements  Aparelhos {
    private  String nome;
    private  double preco;

    public Televisao(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void ligar() {
        System.out.println(nome +" Ligada");
    }

    @Override
    public void desligar() {
        System.out.println(nome +" desligada");
    }
}
