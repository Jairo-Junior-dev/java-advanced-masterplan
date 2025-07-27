package com.minhaempresa.design_patterns_solid.solid.srp;

public class UIFuncionario {
    //Funcionalidade unica de mostrar as informações do funcionario.
    public void mostrarInfor(Funcionario funcionario){
        System.out.println("Nome do funcionario:  " + funcionario.getName() + "\n Salario do funcionario: " + funcionario.getSalario());
    }
}
