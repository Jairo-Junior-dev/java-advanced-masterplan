package com.minhaempresa.design_patterns_solid.solid.isp.niceway;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GerenciadorFuncionario implements FuncionarioGerenciavel{
    private  HashMap<Long,Funcionario> funcionarioHashMap = new HashMap<>();
    @Override
    public Optional<Funcionario> buscarFuncionario(Long id) {
        return funcionarioHashMap.values()
                .stream()
                .filter(funcionario -> funcionario.getId().equals(id))
                .findFirst();
    }

    @Override
    public void salvar(Optional<Funcionario> funcionario) {
     funcionario.ifPresent(f -> this.funcionarioHashMap.put(f.getId(), f));
    }
    public void MostarInformacoes(){
        for ( Funcionario funcionario: funcionarioHashMap.values()){
                System.out.println("*-*-*-*-*-*-*-*-");
                System.out.println("Id: "+funcionario.getId());
                System.out.println("Nome: "+funcionario.getNome());
                System.out.println("Idade: "+funcionario.getIdade());

        }

    }

}
