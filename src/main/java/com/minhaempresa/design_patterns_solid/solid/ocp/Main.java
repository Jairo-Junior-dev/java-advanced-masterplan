package com.minhaempresa.design_patterns_solid.solid.ocp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Jairo",1200);
        Gerente gerente = new Gerente("Carlos",1200);
        UIFuncionario uiFuncionario = new UIFuncionario();
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(desenvolvedor);
        funcionarios.add(gerente);

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Calculando -----"+funcionario.getName()+" Salario: "+funcionario.getSalario());
            funcionario.calcularSalario();
            System.out.println("Calculando -----"+ funcionario.getName()+" Salario: "+funcionario.getSalario());

        }
        for (Funcionario funcionario : funcionarios) {
            uiFuncionario.mostrarInfor(funcionario);
        }
    }
}
