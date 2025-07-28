package com.minhaempresa.design_patterns_solid.solid.dip.niceway;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DatabasePostgresImpl implements DatabasePostgres {

    @Override
    public Connection connection(String url, String db, String password, String username) {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(
                    "jdbc:postgresql://" + url + "/" + db,
                    username,
                    password
            );
        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
    }

    @Override
    public void desconectar(Connection conexao) {
        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        } catch (SQLException e) {
            System.out.println("Erro ao desconectar: " + e.getMessage());
        }
    }

    @Override
    public boolean isConectado(Connection conexao) {
        try {
            return conexao != null && !conexao.isClosed();
        } catch (SQLException e) {
            return false;
        }
    }

    @Override
    public void executarUpdate(Connection conexao, String sql) {
        try (Statement stmt = conexao.createStatement()) {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Erro ao executar update: " + e.getMessage());
        }
    }

    @Override
    public <R> List<R> executarQuery(Connection conexao, String sql, Function<ResultSet, R> mapper) {
        List<R> resultados = new ArrayList<>();
        try (Statement stmt = conexao.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                resultados.add(mapper.apply(rs));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao executar query: " + e.getMessage());
        }
        return resultados;
    }

    @Override
    public void iniciarTransacao(Connection conexao) {
        try {
            if (conexao != null) {
                conexao.setAutoCommit(false);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao iniciar transação: " + e.getMessage());
        }
    }

    @Override
    public void commit(Connection conexao) {
        try {
            if (conexao != null) {
                conexao.commit();
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fazer commit: " + e.getMessage());
        }
    }

    @Override
    public void rollback(Connection conexao) {
        try {
            if (conexao != null) {
                conexao.rollback();
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fazer rollback: " + e.getMessage());
        }
    }

    @Override
    public boolean testeConexao(String url, String db, String password, String username) {
        try (Connection conexao = connection(url, db, password, username)) {
            return isConectado(conexao);
        } catch (Exception e) {
            System.out.println("Erro no teste de conexão: " + e.getMessage());
            return false;
        }
    }
}
