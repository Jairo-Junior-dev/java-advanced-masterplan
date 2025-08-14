package com.minhaempresa.design_patterns_solid.creational.factorymethod;

public class Radio implements Aparelhos {
    private String nome;
    private double preco;

    public Radio(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }

    public void ligar() { System.out.println(nome + " sintonizado na estação favorita."); }
    public void desligar() { System.out.println(nome + " desligado."); }
}
