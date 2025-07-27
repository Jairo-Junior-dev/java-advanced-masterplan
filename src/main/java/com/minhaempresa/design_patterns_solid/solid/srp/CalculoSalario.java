package com.minhaempresa.design_patterns_solid.solid.srp;

public class CalculoSalario {
    //Funcionalidade Unica de calcular o salario.
    public void calcularSalario(Funcionario funcionario){
        funcionario.setSalario(funcionario.getSalario() *  1.3);
    }
}
