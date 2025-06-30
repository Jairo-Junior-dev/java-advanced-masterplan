package com.minhaempresa.fundamentos.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Estudante {

    private UUID uuid;
    private String nome;
    private String email;
    private String matricula;

    private List<Double> notas;

    public Estudante(String nome, String email, String matricula) {
        this.uuid = UUID.randomUUID();
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        this.notas = new ArrayList<>();
    }
    public Estudante cloneFrom(Estudante estudante){
        return  new Estudante(estudante.getNome(), estudante.getEmail(), estudante.getMatricula());
    }
    public Estudante(){}

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
}
