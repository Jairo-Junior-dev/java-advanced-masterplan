package com.minhaempresa.fundamentos.controle_de_fluxo;

import java.util.*;
import java.util.stream.Collectors;

public class For {

    public static void main(String[] args) {
        Map<String, Estudante> mapaEstudantes = Map.of(
                "Ana", new Estudante("Ana", 18, 85, 'F'),
                "Carlos", new Estudante("Carlos", 20, 55, 'M'),
                "Bruna", new Estudante("Bruna", 22, 70, 'F'),
                "Lucas", new Estudante("Lucas", 19, 40, 'M')
        );

        Estudante[] estudantes = {
                new Estudante("Ana", 18, 85, 'F'),
                new Estudante("Carlos", 20, 55, 'M'),
                new Estudante("Bruna", 22, 70, 'F'),
                new Estudante("Lucas", 19, 40, 'M')
        };

        boolean[][] diasVindos = {
                {true, true, true, false, true},    // Ana
                {true, false, true, false, false},  // Carlos
                {true, true, true, true, true},     // Bruna
                {false, false, true, false, false}  // Lucas
        };

        diasPresentes(estudantes, gerarPresenca(4, 200));


        Map<String, List<Estudante>> agrupados = organizarEstudantesPelaSituacao(mapaEstudantes);
        System.out.println(organizarEstudantesPelaSituacaoString(mapaEstudantes.values().toArray(new Estudante[0])));
        /*
        agrupados.forEach((situacao, lista) -> {
            System.out.println("Situação: " + situacao);
            lista.forEach(est -> System.out.println(" - Nome: " + est.getNome() + ", Nota: " + est.getNota()));
        });*/
    }

    /* Usando Map */
    public static Map<String, List<Estudante>> organizarEstudantesPelaSituacao(Map<String, Estudante> estudantes) {
        return estudantes.values()
                .stream()
                .collect(Collectors.groupingBy(est -> est.getNota() >= 60 ? "Aprovado" : "Reprovado"));
    }

    public static String organizarEstudantesPelaSituacaoString(Estudante[] estudantes) {
        StringBuilder estudantesAprovados = new StringBuilder();
        StringBuilder estudantesReprovados = new StringBuilder();

        estudantesAprovados.append("Aprovados: [\n");
        estudantesReprovados.append("Reprovados: [\n");

        for (Estudante estudante : estudantes) {
            if (estudante.getNota() >= 60) {
                estudantesAprovados.append("  ").append(estudante).append("\n");
            } else {
                estudantesReprovados.append("  ").append(estudante).append("\n");
            }
        }

        estudantesAprovados.append("]\n");
        estudantesReprovados.append("]\n");

        return estudantesAprovados.toString() + estudantesReprovados.toString();
    }

    public static boolean[][] gerarPresenca(int totalEstudante, int totalDias) {
        Random random = new Random();
        boolean[][] presenca = new boolean[totalEstudante][totalDias];
        for (int i = 0; i < totalEstudante; i++) {
            for (int j = 0; j < totalDias; j++) {
                presenca[i][j] = random.nextDouble() < 0.8;
            }
        }
        return presenca;
    }

    public static void diasPresentes(Estudante[] estudantes, boolean[][] diasVindos) {
        for (int i = 0; i < estudantes.length; i++) {
            int presencas = 0;
            for (int j = 0; j < diasVindos[i].length; j++) {
                if (diasVindos[i][j]) presencas++;
            }
            String color = " ";
            double percentual = 100.0 * presencas / diasVindos[i].length;
            if (percentual <= 75){
                color = "\u001B[31m";
            }else{
                color = "\u001B[32m";
            }
            System.out.printf("Estudante: %-10s | Presenças: %s %3d/%d (%.2f%%)%n %s",
                    estudantes[i].getNome(), color ,presencas, diasVindos[i].length , percentual,"\u001B[0m");
        }


    }
}
    class Estudante {
    private UUID uuid;
    private String nome;
    private int idade;
    private int nota;
    private char sexo;

    public Estudante(String nome, int idade, int nota, char sexo) {
        this.uuid = UUID.randomUUID();
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
        this.sexo = sexo;
    }

     @Override
     public String toString() {
         return "Estudante{" +
                 "nome='" + nome + '\'' +
                 ", idade=" + idade +
                 ", nota=" + nota +
                 ", sexo=" + sexo +
                 '}';
     }

     public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public UUID getUuid() {
        return uuid;
    }

}

