package com.minhaempresa.colecoes_generics.optional.impl;

import com.minhaempresa.colecoes_generics.optional.CrudService;
import com.minhaempresa.colecoes_generics.optional.Estudante;
import com.minhaempresa.colecoes_generics.optional.Materia;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class EstudanteImpl implements CrudService<Estudante, Long> {
     private HashMap<Long, Estudante> estudante = new HashMap<>();
    @Override
    public Estudante salvar(Estudante entidade) {
        return null;
    }

    @Override
    public Optional<Estudante> buscarPorId(Long aLong) {
        return Optional.empty();
    }

    @Override
    public List<Estudante> buscarTodos() {
        return List.of();
    }

    @Override
    public Estudante atualizar(Long aLong, Estudante entidadeAtualizada) {
        return null;
    }

    @Override
    public void deletar(Long aLong) {

    }

    // Ainda irei Refatorar
    public void calcularNotaEstudante(Estudante estudante, Materia materia, Double... notas) {
        Estudante existente = buscarPorId(estudante.getId())
                .orElseThrow(() -> new RuntimeException("Estudante não existe"));
        if (notas.length != 4) {
            System.out.println("O balanceamento da nota deve ser 4");
            return;
        }
        existente.getNotas().put(materia, List.of(notas));
        existente.getMedias().put(materia, calcularMedia(notas));
    }

    private Double calcularMedia(Double ... notas){
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

}
