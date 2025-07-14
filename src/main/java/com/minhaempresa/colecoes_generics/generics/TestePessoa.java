package com.minhaempresa.colecoes_generics.generics;
import com.minhaempresa.fundamentos.enums_records.Pessoa;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class TestePessoa {
    public static void main(String[] args) {
        RegisterPessoa register = new RegisterPessoa();

        // Criar instâncias de Pessoa
        Pessoa p1 = new Pessoa("Maria", UUID.randomUUID(), LocalDate.of(1988, 5, 20));
        Pessoa p2 = new Pessoa("João", UUID.randomUUID(), LocalDate.of(1992, 11, 15));
        Pessoa p3 = new Pessoa("Ana", UUID.randomUUID(), LocalDate.of(2000, 7, 10));

        // Adicionar ao registro (precisa do método adicionarPessoa)
        register.salvar(p1);
        register.salvar(p2);
        register.salvar(p3);

        // Buscar pessoas entre datas
        LocalDate inicio = LocalDate.of(1985, 1, 1);
        LocalDate fim = LocalDate.of(1995, 12, 31);

        List<Pessoa> pessoasFiltradas = register.buscarPessoaEntreData(inicio, fim);

        System.out.println("Pessoas entre " + inicio + " e " + fim + ":");
        for (Pessoa p : pessoasFiltradas) {
            System.out.println(p.nome() + " - " + p.dataDeNacimento());
        }
    }
}
