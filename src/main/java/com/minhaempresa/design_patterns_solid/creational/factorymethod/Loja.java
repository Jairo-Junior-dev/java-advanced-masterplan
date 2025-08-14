package com.minhaempresa.design_patterns_solid.creational.factorymethod;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Loja {
    protected List<Aparelhos> estoque = new ArrayList<>();
    protected List<Venda> historicoVendas = new ArrayList<>();

    public Loja(String caminhoCatalogo) {
        carregarEstoque(caminhoCatalogo);
    }

    protected void carregarEstoque(String caminho) {
        List<Map<String, Object>> lista = CatalogoLoader.carregar(caminho);
        for (Map<String, Object> item : lista) {
            Aparelhos aparelho = criarAparelho(
                    (String) item.get("tipo"),
                    (String) item.get("nome"),
                    ((Number) item.get("preco")).doubleValue()
            );
            estoque.add(aparelho);
        }
    }

    protected abstract Aparelhos criarAparelho(String tipo, String nome, double preco);

    public void listarEstoque() {
        System.out.println("Estoque disponível:");
        int id = 1;
        for (Aparelhos a : estoque) {
            System.out.println(id++ + " - " + a.getNome() + " | R$ " + a.getPreco());
        }
    }

    public void vender(int codigoProduto) {
        if (codigoProduto < 1 || codigoProduto > estoque.size()) {
            System.out.println("Código inválido!");
            return;
        }
        Aparelhos aparelho = estoque.remove(codigoProduto - 1);
        historicoVendas.add(new Venda(aparelho));
        System.out.println("Venda realizada: " + aparelho.getNome());
        aparelho.ligar();
        aparelho.desligar();
    }

    public void mostrarHistorico() {
        System.out.println("Histórico de vendas:");
        for (Venda v : historicoVendas) {
            System.out.println(v);
        }
    }
}

