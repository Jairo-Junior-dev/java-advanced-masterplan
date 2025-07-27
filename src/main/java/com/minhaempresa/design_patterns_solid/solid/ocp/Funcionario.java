package com.minhaempresa.design_patterns_solid.solid.ocp;

public abstract class Funcionario {
    protected String name;
    protected double salario;

    public Funcionario(String name, double salario) {
        this.name = name;
        this.salario = salario;
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
    abstract  void calcularSalario();
}
