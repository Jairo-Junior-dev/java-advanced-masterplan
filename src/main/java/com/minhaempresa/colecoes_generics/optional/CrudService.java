package com.minhaempresa.colecoes_generics.optional;

import java.util.List;
import java.util.Optional;

public interface CrudService<T, ID> {

    T salvar(T entidade);
    Optional<T> buscarPorId(ID id);
    List<T> buscarTodos();
    T atualizar(ID id, T entidadeAtualizada);
    void deletar(ID id);
}
