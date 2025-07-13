package com.minhaempresa.colecoes_generics.list_set_map.map;
/**
 * 6. Produto Mais Caro:
 * Dado um Map com produtos e seus preços, exiba qual produto tem o maior valor.
 */
/**
 * 7. Soma dos Valores:
 * Dado um Map com valores numéricos, calcule a soma de todos os valores.
 */
/**
 * 8. Agrupar Pessoas por Faixa Etária:
 * Dado um Map com nomes e idades, agrupe os nomes em três faixas: Jovem (0–17), Adulto (18–59), Idoso (60+).
 */
/**
 * 9. Inverter Mapa:
 * Dado um Map<String, Integer>, crie um novo Map<Integer, List<String>> agrupando as chaves com o mesmo valor.
 */

import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 10. Top 3 Palavras Mais Frequentes:
 * Dada uma lista de palavras, exiba as 3 palavras mais frequentes e suas contagens.
 */
public class ExercicioMap {

    public static void main(String[] args) {
        quantidadeDePalavras();
        agendaDeContatos();
        dicionarioPortuguesParaIngles();
        mediaNotaAluno();
        quantidadeDeCaracteres("Palavra");
    }
    /**
     *  1. Contagem de Palavras:
     * Dada uma lista de palavras, conte quantas vezes cada palavra aparece.
     */
    public  static  void quantidadeDePalavras(){
        System.out.println("1. Contagem de Palavras:");
        List<String> palavras  = List.of("java", "map", "java", "code", "map");
        Map<String,Integer> quantidadeDePalavras  = new HashMap<>();
        for (String palavra: palavras){
            quantidadeDePalavras.put(palavra,quantidadeDePalavras.getOrDefault(palavra,0) +1);
        }
        quantidadeDePalavras.forEach((k,v)-> System.out.println(k + " : "+v));

    }
    /**
     * 2. Agenda de Contatos:
     * Crie um Map onde a chave é o nome de uma pessoa e o valor é o telefone.
     * Permita adicionar, remover e buscar contatos.
     */
    public static void agendaDeContatos(){
        System.out.println("2. Agenda de Contatos:");
        Map<String ,String> agenda = new HashMap<>();
        agenda.put("Jairo","92992-2232");
        agenda.put("Pedro","92992-2232");
        agenda.put("Carlos","92992-2232");
        agenda.put("Thiago","92992-2232");
        System.out.println("Numero do contato : Jairo " + agenda.get("Jairo"));
        System.out.println("Todos os contatos" );
        System.out.println(agenda);
        System.out.println("Removendo o contato do Pedro");
        agenda.remove("Pedro");
        System.out.println(agenda);
    }
    /**
     * 3. Dicionário Português-Inglês:
     * Armazene palavras em português e sua tradução em inglês.
     * Permita consultar a tradução de uma palavra.
     */
    public static  void dicionarioPortuguesParaIngles(){
        System.out.println("3. Dicionário Português-Inglês:");
        Map<String,String> dicionario = Map.of("Cachorro","Dog","Gato","Cat","Pessoa","People");
        System.out.println("Tradução da palavra Gato: "+dicionario.get("Gato"));
    }
    /**
     * 4. Notas dos Alunos:
     * Armazene o nome dos alunos e suas listas de notas.
     * Calcule e exiba a média de cada aluno.
     */
    public static void  mediaNotaAluno(){
        System.out.println("4. Notas dos Alunos: ");
        Map<String , List<Double>> alunos = new HashMap<>();
        alunos.put("Jairo" ,List.of(5.5,4.4,8.0,7.5));
        alunos.put("Carlos" ,List.of(6.0,4.4,5.6,7.2));
        alunos.put("Mathias" ,List.of(5.5,4.4,8.3,7.5));
        alunos.put("Algusto" ,List.of(5.5,4.4,8.3,7.1));
        Map<String, Double> medias = alunos.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        e -> e.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0.0)
                ));
        medias.forEach((nome, media) -> System.out.println(nome + " - Média: " + media));
    }
    /**
     * 5. Frequência de Caracteres:
     * Dado um texto, conte quantas vezes cada caractere aparece.
     *
     */

    public static void quantidadeDeCaracteres(String palavra){
        Map<Character,Integer> quantidadeDeCaracteres = new HashMap<>();
        for (Character c :palavra.toCharArray()){
            quantidadeDeCaracteres.put(c,quantidadeDeCaracteres.getOrDefault(c,0) +1);
        }
        quantidadeDeCaracteres.forEach((k, v) -> System.out.println(k + ": " + v));

    }
}
