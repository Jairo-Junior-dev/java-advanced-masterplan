package com.minhaempresa.fundamentos.poo;

import java.util.*;
import java.util.stream.Collectors;

public class EstudanteManager implements Gerenciavel<Estudante> {
    private Map<UUID,Estudante> estudantes;
    public  EstudanteManager(){
        this.estudantes = new HashMap<>();
    }

    @Override
    public Estudante buscarPeloId(UUID uuid) {
        return this.estudantes
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .filter(estudante -> estudante.getUuid() != null && estudante.getUuid().equals(uuid))
                .findFirst()
                    .orElse(null);
    }

    @Override
    public List<Estudante> buscarTodos() {
        return new ArrayList<>(estudantes.values());
    }


    @Override
    public void deletarPeloId(UUID uuid) {
        this.estudantes.entrySet().removeIf(entry -> entry.getKey().equals(uuid));
    }

    @Override
    public void alterarPeloId(UUID uuid) {

    }

    @Override
    public void salvarPeloId(Estudante estudante) {

    }
}
