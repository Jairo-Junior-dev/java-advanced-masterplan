package com.minhaempresa.colecoes_generics.list_set_map.map;


import java.util.*;
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
        produtoMaisCaro();
        somaValores();
        agruparPessoasPelaFaixaEtaria();
        palavrasMaisFrequentes();
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
        System.out.println("5. Frequência de Caracteres:");
        for (Character c :palavra.toCharArray()){
            quantidadeDeCaracteres.put(c,quantidadeDeCaracteres.getOrDefault(c,0) +1);
        }
        quantidadeDeCaracteres.forEach((k, v) -> System.out.println(k + ": " + v));

    }
    /**
     * 6. Produto Mais Caro:
     * Dado um Map com produtos e seus preços, exiba qual produto tem o maior valor.
     */
    public static void produtoMaisCaro(){
        System.out.println("6. Produto Mais Caro");
        Map<String,Double> produtos = new HashMap<>();

        produtos.put("Maçã",20d);
        produtos.put("Caneta",2.5d);
        produtos.put("Panela",30d);
        produtos.put("Arroz",29.99d);
        produtos.put("Caldo",100.00d);
        produtos.put("Feijão",29.99d);
        produtos.put("Sabonete",29.99d);
        produtos.put("Legumes",29.99d);
        double maiorPreco = 0d;
        String produtoComMaiorPreco = " ";
        for(Map.Entry<String,Double> produto : produtos.entrySet() ){

           if(produto.getValue()>maiorPreco){
               maiorPreco = produto.getValue();
               produtoComMaiorPreco = produto.getKey();
           }

        }
        System.out.println(" O Produto de maior valor é :"+ produtoComMaiorPreco +" com o valor de : R$ "+maiorPreco);
    }
    /**
     * 7. Soma dos Valores:
     * Dado um Map com valores numéricos, calcule a soma de todos os valores.
     */
    public static void somaValores(){
        System.out.println("7. Soma dos Valores");
        Map<String , Integer> peoples = new HashMap<>();
        peoples.put("Jairo",27);
        peoples.put("Jonas",30);
        peoples.put("Maria",16);
        peoples.put("Manuel",40);
        peoples.put("Mathias",32);
        int somatoriaDeIdades = 0;
        for (Map.Entry<String , Integer> people : peoples.entrySet() ){
            somatoriaDeIdades = somatoriaDeIdades + people.getValue();
        }
        System.out.println("A somatoria de idade das "+peoples.size()+"  pessoas é de "+somatoriaDeIdades);
    }
    /**
     * 8. Agrupar Pessoas por Faixa Etária:
     * Dado um Map com nomes e idades, agrupe os nomes em três faixas: Jovem (0–17), Adulto (18–59), Idoso (60+).
     */
    public static void agruparPessoasPelaFaixaEtaria(){
        Map<String,Map<String,Integer>> agrupar = new HashMap<>();
        Map<String , Integer> pessoas = new HashMap<>();
        pessoas.put("Jairo",27);
        pessoas.put("Jonas",10);
        pessoas.put("Maria",16);
        pessoas.put("Manuel",30);
        pessoas.put("Paulo",40);
        pessoas.put("Augusto",12);
        pessoas.put("João",23);

        for (Map.Entry<String,Integer> pessoa: pessoas.entrySet()){
            Integer idadeAtual = pessoa.getValue();
            String status = "";

            if (idadeAtual >0 && idadeAtual <= 17 ){
                status =" Jovem";
            } else if (idadeAtual >=18 && idadeAtual <= 59 ){
                status = "Adulto";
            }else if (idadeAtual > 59 ){
                status = "Velho";
            }else {
                System.out.println("Idade nao pode ser nulo");
            }
            agrupar.putIfAbsent(status,new HashMap<>());
            agrupar.get(status).put(pessoa.getKey(),pessoa.getValue() );

        }
        System.out.println(agrupar);
    }
    /**
     * 9. Inverter Mapa:
     * Dado um Map<String, Integer>,
     * crie um novo Map<Integer, List<String>> agrupando as chaves com o mesmo valor.
     */
    public static void inverterMap() {
        Map<String, Integer> mapaOriginal = new HashMap<>();
        mapaOriginal.put("a", 1);
        mapaOriginal.put("b", 2);
        mapaOriginal.put("c", 1);
        mapaOriginal.put("d", 3);
        Map<Integer, List<String>> mapAgrupado = new HashMap<>();
        for (Map.Entry<String, Integer> entry : mapaOriginal.entrySet()) {
            String keyOriginal = entry.getKey();
            Integer valor = entry.getValue();
            mapAgrupado.computeIfAbsent(valor, k -> new ArrayList<>()).add(keyOriginal);
        }
        for (Map.Entry<Integer, List<String>> entry : mapAgrupado.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    /**
     * 10. Top 3 Palavras Mais Frequentes:
     * Dada uma lista de palavras, exiba as 3 palavras mais frequentes e suas contagens.
     */
    /**
     * 10. Top 3 Palavras Mais Frequentes:
     * Dada uma lista de palavras, exiba as 3 palavras mais frequentes e suas contagens.
     */
    public static void palavrasMaisFrequentes() {
        final int limit = 3;
        Map<String, Integer> contagemDePalavras = new HashMap<>();

               List<String> palavras = Arrays.asList(
                "java", "c", "java", "python", "java", "python", "c", "c", "c", "go"
        );

        for (String palavra : palavras) {
            if (contagemDePalavras.containsKey(palavra)) {
                contagemDePalavras.put(palavra, contagemDePalavras.get(palavra) + 1);
            } else {
                contagemDePalavras.put(palavra, 1);
            }
        }

        List<Map.Entry<String, Integer>> listaOrdenada = new ArrayList<>(contagemDePalavras.entrySet());
        Collections.sort(listaOrdenada, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                return e2.getValue() - e1.getValue();
            }
        });
        System.out.println("Top " + limit + " palavras mais frequentes:");
        for (int i = 0; i < limit && i < listaOrdenada.size(); i++) {
            Map.Entry<String, Integer> entrada = listaOrdenada.get(i);
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }
    }

}
