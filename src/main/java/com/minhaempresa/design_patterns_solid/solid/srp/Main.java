package com.minhaempresa.design_patterns_solid.solid.srp;

public class Main {
    public static void main(String[] args) {
        //Divisão de responsabilidade por classe;
        //Classe representando o funcionario.
        Funcionario funcionario = new Funcionario();
        funcionario.setarFuncionario("Jairoso",12222d);
        // Classe que tem como objetivo calcular o salario do funcionario.
        CalculoSalario calculoSalario = new CalculoSalario();
        calculoSalario.calcularSalario(funcionario);
        //classe que tem coo objetivo mostrar as informações do usuario.
        UIFuncionario uiFuncionario = new UIFuncionario();
        uiFuncionario.mostrarInfor(funcionario);
    }
}
