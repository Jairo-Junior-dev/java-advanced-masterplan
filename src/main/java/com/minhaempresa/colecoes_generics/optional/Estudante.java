package com.minhaempresa.colecoes_generics.optional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estudante {
    private Long id;
    private String codeEstudante;
    private char sexo ;
    private List<Materia> materias;
    private Map<Materia,List<Double>>notas;
    private Map<Materia,Double> medias;
    public Estudante() {
        this.notas = new HashMap<>();
        this.medias = new HashMap<>();
    }
    public Map<Materia, Double> getMedias() {
        return medias;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeEstudante() {
        return codeEstudante;
    }

    public void setCodeEstudante(String codeEstudante) {
        this.codeEstudante = codeEstudante;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public Map<Materia, List<Double>> getNotas() {
        return notas;
    }

}
