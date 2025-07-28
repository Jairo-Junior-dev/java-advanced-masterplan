package com.minhaempresa.design_patterns_solid.solid.isp.badway;

import java.util.Optional;

public interface Gerenciavel {
    void salvar(Optional<Funcionario> funcionario);
    void update(Long id , Funcionario novoFuncionario);
    Optional<Funcionario> buscarFuncionario(Long aLong);

}
