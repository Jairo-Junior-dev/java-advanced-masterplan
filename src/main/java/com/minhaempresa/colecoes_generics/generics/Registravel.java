package com.minhaempresa.colecoes_generics.generics;

import java.util.List;

public interface Registravel<T,I> {
    void salvar(T T);

    T buscarPeloId (I i);

    void updatePeloId(T T , I i);

    void deletaPeloId(I i);

    List<T> buscarTodos();
}
