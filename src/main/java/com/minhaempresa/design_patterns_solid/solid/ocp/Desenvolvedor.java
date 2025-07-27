package com.minhaempresa.design_patterns_solid.solid.ocp;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String name, double salario) {
        super(name, salario);
    }

    @Override
    void calcularSalario() {
        this.setSalario(this.getSalario()*1.3);
    }
}
