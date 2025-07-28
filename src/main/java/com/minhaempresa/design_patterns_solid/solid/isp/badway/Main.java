package com.minhaempresa.design_patterns_solid.solid.isp.badway;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        GerenciadorFuncionario gerenciador = new GerenciadorFuncionario();
        Funcionario[] funcionarios =
                {
                new Funcionario(1L,"Jairo","28") ,
                new Funcionario(2L,"Carlos","23"),
                new Funcionario(3L,"Andrey","22"),
                new Funcionario(4L,"Marthins","22")
                };
        for (int index = 0; index < funcionarios.length; index++) {
            gerenciador.salvar(Optional.of(funcionarios[index]));
        }
        gerenciador.update(1L, new Funcionario(1L,"Carlos","32"));
        Optional<Funcionario> resultado = gerenciador.buscarFuncionario(1L);
        System.out.println(resultado.map(funcionario -> "Funcionário encontrado: " + funcionario).orElse("Funcionário não encontrado"));
    }
}
