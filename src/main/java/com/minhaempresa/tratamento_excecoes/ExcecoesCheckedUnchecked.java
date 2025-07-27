package com.minhaempresa.tratamento_excecoes;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class ExcecoesCheckedUnchecked {

    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";

    public static void criarArquivo(String path) throws IOException {
        if (path == null || path.isEmpty()) {
            throw new IllegalArgumentException("O caminho do arquivo não pode ser vazio.");
        }

        File file = new File(path);

        if (file.exists()) {
            System.out.println("Arquivo já existe: " + file.getAbsolutePath());
        } else {
            boolean criado = file.createNewFile();
            System.out.println(criado ? "Arquivo criado com sucesso: " + file.getAbsolutePath()
                    : "Falha ao criar o arquivo.");
        }
    }

    public static void escreverArquivo(String path, String conteudo) throws IOException {
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(conteudo);
        }
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

    public static int countWords(String texto, String search) {
        String[] conteudos = texto.split("\\s+");
        int contadorDePalavras = 0;
        for (String conteudo : conteudos) {
            String palavraLimpa = limparPontuacao(conteudo);
            if (palavraLimpa.equalsIgnoreCase(search)) {
                contadorDePalavras++;
            }
        }
        return contadorDePalavras;
    }

    public static void printTextoComDestaque(String texto, String search) {
        String[] palavras = texto.split("\\s+");
        int palavrasPorLinha = 12;
        int contador = 0;
        for (String palavra : palavras) {
            String palavraLimpa = limparPontuacao(palavra);
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

    public static Set<String> findWordsStartWith(String texto, String startWith) {
        Set<String> words = new HashSet<>();
        Pattern pattern = Pattern.compile("^" + Pattern.quote(startWith), Pattern.CASE_INSENSITIVE);

        String[] tokens = texto.split("\\s+");
        for (String token : tokens) {
            String palavraLimpa = limparPontuacao(token);
            if (pattern.matcher(palavraLimpa).find()) {
                words.add(palavraLimpa);
            }
        }

        return words;
    }

    private static String limparPontuacao(String palavra) {
        return palavra.replaceAll("^[\\p{Punct}]+|[\\p{Punct}]+$", "");
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        String caminho = "arquivo.txt";

        try {
            criarArquivo(caminho);
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
            return;
        }

        while (true) {
            System.out.println("\n------ MENU ------");
            System.out.println("1 - Escrever texto no arquivo");
            System.out.println("2 - Contar palavras e destacar");
            System.out.println("3 - Buscar palavras por prefixo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = sc.nextLine();

            try {
                switch (opcao) {
                    case "1":
                        System.out.println("Digite o texto a ser salvo:");
                        String conteudo = sc.nextLine();
                        escreverArquivo(caminho, conteudo);
                        System.out.println("Texto salvo com sucesso.");
                        break;
                    case "2":
                        String texto = lerArquivo(caminho);
                        System.out.print("Digite a palavra para contar e destacar: ");
                        String busca = sc.nextLine();
                        int contagem = countWords(texto, busca);
                        System.out.println("\nTexto com destaque:");
                        printTextoComDestaque(texto, busca);
                        System.out.println("\nOcorrências da palavra '" + busca + "': " + contagem);
                        break;
                    case "3":
                        texto = lerArquivo(caminho);
                        System.out.print("Digite o prefixo para busca: ");
                        String prefixo = sc.nextLine();
                        Set<String> encontradas = findWordsStartWith(texto, prefixo);
                        System.out.println("Palavras encontradas com prefixo '" + prefixo + "':");
                        encontradas.forEach(System.out::println);
                        break;
                    case "0":
                        System.out.println("Encerrando...");
                        return;
                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (IOException e) {
                System.out.println("Erro ao acessar o arquivo: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
