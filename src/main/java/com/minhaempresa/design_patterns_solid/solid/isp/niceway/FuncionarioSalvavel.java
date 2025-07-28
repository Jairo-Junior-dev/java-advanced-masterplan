package com.minhaempresa.design_patterns_solid.solid.isp.niceway;

import com.minhaempresa.design_patterns_solid.solid.isp.niceway.Funcionario;

import java.util.Optional;

public interface FuncionarioSalvavel {
    void salvar(Optional<Funcionario> funcionario );
}
