package com.minhaempresa.tratamento_excecoes;

import java.io.*;
import java.util.Objects;

public class ExcecoesCheckedUnchecked {

    public static void escreverArquivo(String path, String conteudo) throws IOException {
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(conteudo);
        }
    }
    public static void printTextoComDestaque(String path, String search) throws IOException {
        String texto = lerArquivo(path);
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";
        String[] palavras = texto.split("\\s+");
        int palavrasPorLinha = 12;
        int contador = 0;
        for (String palavra : palavras) {
            String palavraLimpa = palavra.replaceAll("^[\\p{Punct}]+|[\\p{Punct}]+$", "");
            if (palavraLimpa.equalsIgnoreCase(search)) {
                System.out.print(ANSI_RED + palavra + ANSI_RESET + " ");
            } else {
                System.out.print(palavra + " ");
            }
            contador++;
            if (contador % palavrasPorLinha == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }


    public static String lerArquivo(String path) throws IOException {
        StringBuilder conteudo = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                conteudo.append(linha).append(" ");
            }
        }
        return conteudo.toString();
    }

    public static int countWords(String path, String search) throws IOException {
        String[] conteudos = lerArquivo(path).split("\\s+");
        int contadorDePalavras = 0;
        for (String conteudo : conteudos) {
            String palavraLimpa = conteudo.replaceAll("^\\p{Punct}+|\\p{Punct}+$", "");
            if (palavraLimpa.equalsIgnoreCase(search)) {
                contadorDePalavras++;
            }
        }
        printTextoComDestaque(path,search);
        return contadorDePalavras;
    }
    public static void criarArquivo(String path) throws IOException {
        if (path == null || path.isEmpty()) {
            throw new IllegalArgumentException("O caminho do arquivo não pode ser vazio.");
        }

        File file = new File(path);

        if (file.exists()) {
            System.out.println("Arquivo já existe: " + file.getAbsolutePath());
        } else {
            boolean criado = file.createNewFile();
            if (criado) {
                System.out.println("Arquivo criado com sucesso: " + file.getAbsolutePath());
            } else {
                System.out.println("Falha ao criar o arquivo.");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        criarArquivo("arquivo");
        escreverArquivo("arquivo","O tempo parecia não passar naquela tarde chuvosa. Era como se o tempo tivesse parado, deixando todos presos em uma pausa silenciosa. João olhava o relógio, medindo cada segundo de tempo com ansiedade. Ele não sabia se teria tempo suficiente para terminar o que começou.\n" +
                "\n" +
                "Enquanto esperava, lembrava dos tempos antigos, quando tudo parecia mais simples. Na escola, o professor falava sobre o tempo histórico e o tempo cronológico. Mas ninguém explicava como lidar com o tempo emocional, esse que corre ou congela conforme o coração sente.\n" +
                "\n" +
                "O tempo era seu aliado e inimigo. Às vezes, ele queria mais tempo para si, para pensar, para viver. Outras vezes, desejava que o tempo passasse logo. No fim, percebeu que o tempo não espera ninguém, e que cada segundo de tempo é um presente.\n" +
                "\n" +
                "Então, fechou os olhos, respirou fundo e deixou o tempo fluir.");
        System.out.println(countWords("arquivo","tempo"));
    }
}
