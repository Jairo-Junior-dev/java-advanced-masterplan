package com.minhaempresa.design_patterns_solid.solid.ocp;

public class UIFuncionario {
    public void mostrarInfor(Funcionario funcionario){
        System.out.println("Nome do funcionario:  " + funcionario.getName() +
                "\n Salario do funcionario: " + funcionario.getSalario());
    }
}
