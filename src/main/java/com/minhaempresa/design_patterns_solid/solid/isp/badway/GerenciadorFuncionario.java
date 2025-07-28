package com.minhaempresa.design_patterns_solid.solid.isp.badway;

import java.util.HashMap;
import java.util.Optional;

public class GerenciadorFuncionario implements Gerenciavel{
    HashMap<Long,Funcionario> funcionarioHashMap = new HashMap<>();
    @Override
    public void salvar(Optional<Funcionario> funcionario) {
        funcionarioHashMap.put(funcionario.get().getId(), funcionario.get());
    }

    @Override
    public void update(Long id, Funcionario novoFuncionario) {
        if (novoFuncionario == null) {
            throw new IllegalArgumentException("Novo funcionário não pode ser nulo");
        }

        if (id.equals(novoFuncionario.getId())) {
            funcionarioHashMap.put(id,novoFuncionario);
        } else {
            System.out.println("ID não corresponde. Atualização não realizada.");
        }
    }

    @Override
    public Optional<Funcionario> buscarFuncionario(Long id) {
        return funcionarioHashMap.values().
                stream().
                filter(func->func.getId().equals(id)).
                findFirst();
    }

}
