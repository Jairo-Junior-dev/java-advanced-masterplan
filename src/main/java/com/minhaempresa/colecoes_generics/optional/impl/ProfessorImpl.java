package com.minhaempresa.colecoes_generics.optional.impl;

import com.minhaempresa.colecoes_generics.optional.CrudService;
import com.minhaempresa.colecoes_generics.optional.Professor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ProfessorImpl implements CrudService<Professor,Long> {
    private Map<Long,Professor> professorMap = new HashMap<>();

    @Override
    public Professor salvar(Professor entidade) {
        if (professorMap.containsKey(entidade.getId())){
            System.out.println("Professor já existe");
            return  null;
        }
        professorMap.put(entidade.getId(),entidade);
        return entidade;
    }

    @Override
    public Optional<Professor> buscarPorId(Long aLong) {
        return  Optional.ofNullable(professorMap.get(aLong));
    }

    @Override
    public List<Professor> buscarTodos() {
        return List.copyOf(professorMap.values());
    }

    @Override
    public Professor atualizar(Long aLong, Professor entidadeAtualizada) {
        if (professorMap.containsKey(aLong)) {
            professorMap.put(aLong, entidadeAtualizada);
            return entidadeAtualizada;
        }
        System.out.println("Professor não encontrado");
        return null;
    }
    @Override
    public void deletar(Long aLong) {
        if (professorMap.containsKey(aLong)) {
            professorMap.remove(aLong);
        }else {
            System.out.println("Professor não encontrado");
        }
    }
}
