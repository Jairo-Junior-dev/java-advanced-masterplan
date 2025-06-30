package com.minhaempresa.fundamentos.poo;

import java.util.List;
import java.util.UUID;

public interface Gerenciavel<T> {
    T buscarPeloId(UUID uuid);
    List<T> buscarTodos();
    void deletarPeloId(UUID uuid);
    void alterarPeloId(UUID uuid); // ou void atualizar(T entidade);
    void salvarPeloId(T entidade);
}

