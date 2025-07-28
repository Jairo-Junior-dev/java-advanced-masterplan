package com.minhaempresa.design_patterns_solid.solid.isp.niceway;

import java.util.Optional;

public interface FuncionarioBuscavel {
    Optional<Funcionario> buscarFuncionario(Long aLong);
}
