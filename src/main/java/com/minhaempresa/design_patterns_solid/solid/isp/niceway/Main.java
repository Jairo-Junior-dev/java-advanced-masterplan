package com.minhaempresa.design_patterns_solid.solid.isp.niceway;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Funcionario[] funcionarios= {

                        new Funcionario(1L,"Jairo","28") ,
                        new Funcionario(2L,"Carlos","23"),
                        new Funcionario(3L,"Andrey","22"),
                        new Funcionario(4L,"Marthins","22")
                };
        GerenciadorFuncionario gerenciadorFuncionario = new GerenciadorFuncionario();
        for (int index = 0; index < funcionarios.length; index++) {
            gerenciadorFuncionario.salvar(Optional.of(funcionarios[index]));
        }
        gerenciadorFuncionario.MostarInformacoes();
    }


}


