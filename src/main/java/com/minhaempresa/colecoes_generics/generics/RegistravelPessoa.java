package com.minhaempresa.colecoes_generics.generics;

import com.minhaempresa.fundamentos.enums_records.Pessoa;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface RegistravelPessoa extends Registravel<Pessoa, UUID> {
    List<Pessoa> buscarPessoaEntreData(LocalDate inicio , LocalDate fim);

    List<Pessoa> buscarTodosOsAprovados();

    List<Pessoa> buscarTodosOsReprovados();

    List<Pessoa> buscarPessoaEntreNotas(Double nota1 , Double nota2);

}
