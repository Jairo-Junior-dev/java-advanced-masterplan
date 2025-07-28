package com.minhaempresa.design_patterns_solid.solid.isp.badway;

public class Funcionario {
    private Long id;
    private String nome;
    private String idade;

    public Funcionario(Long id, String nome, String idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }
}
