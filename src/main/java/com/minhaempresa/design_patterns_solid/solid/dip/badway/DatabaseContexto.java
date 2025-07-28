package com.minhaempresa.design_patterns_solid.solid.dip.badway;

import java.sql.Connection;
import java.util.List;

public class DatabaseContexto {

    public BancoDeDadosGenerico<Connection> bancoDeDadosGenerico = new DatabaseMySQLImpl();
    private Connection conexao;

    public void init() {
        conexao = bancoDeDadosGenerico.connection("localhost", "meubanco", "senha123", "usuario");
    }

    public void salvarEntidade(Object object) {
        String sql = "INSERT INTO entidades (nome) VALUES ('Teste')";
        bancoDeDadosGenerico.executarUpdate(conexao, sql);
    }

    public void buscarEntidades() {
        List<String> nomes = bancoDeDadosGenerico.executarQuery(conexao,
                "SELECT nome FROM entidades",
                resultSet -> {
                    try {
                        return resultSet.getString("nome");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                });

        nomes.forEach(System.out::println);
    }

    public void fechar() {
        bancoDeDadosGenerico.desconectar(conexao);
    }
}
