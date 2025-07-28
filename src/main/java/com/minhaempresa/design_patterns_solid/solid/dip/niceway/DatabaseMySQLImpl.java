package com.minhaempresa.design_patterns_solid.solid.dip.niceway;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DatabaseMySQLImpl implements DatabaseMySQL {

    @Override
    public Connection connection(String url, String db, String password, String username) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String fullUrl = String.format("jdbc:mysql://%s/%s", url, db);
            return DriverManager.getConnection(fullUrl, username, password);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao conectar: " + e.getMessage(), e);
        }
    }

    @Override
    public void desconectar(Connection conexao) {
        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
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
            throw new RuntimeException(e);
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
            throw new RuntimeException(e);
        }
        return resultados;
    }

    @Override
    public void iniciarTransacao(Connection conexao) {
        try {
            conexao.setAutoCommit(false);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void commit(Connection conexao) {
        try {
            conexao.commit();
            conexao.setAutoCommit(true);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void rollback(Connection conexao) {
        try {
            conexao.rollback();
            conexao.setAutoCommit(true);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean testeConexao(String url, String db, String password, String username) {
        try (Connection conn = connection(url, db, password, username)) {
            return isConectado(conn);
        } catch (Exception e) {
            return false;
        }
    }
}
