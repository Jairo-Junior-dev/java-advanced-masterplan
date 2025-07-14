package com.minhaempresa.colecoes_generics.generics;

import com.minhaempresa.fundamentos.enums_records.Pessoa;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.util.*;

public  class RegisterPessoa implements RegistravelPessoa{
    private Map<UUID ,Pessoa> pessoaMap = new HashMap<>();

    @Override
    public List<Pessoa> buscarPessoaEntreData(LocalDate inicio, LocalDate fim) {
        List<Pessoa> pessoas = new ArrayList<>();
        for (Pessoa pessoa : pessoaMap.values()) {
            LocalDate nascimento = pessoa.dataDeNacimento();
            if (!nascimento.isBefore(inicio) && !nascimento.isAfter(fim)) {
                pessoas.add(pessoa);
            }
        }
        return pessoas;
    }

    @Override
    public List<Pessoa> buscarTodosOsAprovados() {
        return List.of();
    }

    @Override
    public List<Pessoa> buscarTodosOsReprovados() {
        return List.of();
    }

    @Override
    public List<Pessoa> buscarPessoaEntreNotas(Double nota1, Double nota2) {
        return List.of();
    }

    @Override
    public void salvar(Pessoa pessoa) {
        pessoaMap.put(pessoa.id(), pessoa);
    }

    @Override
    public Pessoa buscarPeloId(UUID uuid) {
        return null;
    }

    @Override
    public void updatePeloId(Pessoa T) {

    }

    @Override
    public void deletaPeloId(UUID uuid) {

    }

    @Override
    public List<Pessoa> buscarTodos(Pessoa T) {
        return List.of();
    }
}
