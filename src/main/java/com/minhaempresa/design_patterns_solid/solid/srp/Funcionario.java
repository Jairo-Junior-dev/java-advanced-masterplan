package com.minhaempresa.design_patterns_solid.solid.srp;

public class Funcionario {
    private String name;
    private double salario;
    // Funcionalidade unica de adicionar nome e salario.
    public void setarFuncionario( String nome, double salario){
        this.salario = salario;
        this.name = nome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
