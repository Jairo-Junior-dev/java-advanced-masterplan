package com.minhaempresa.design_patterns_solid.solid.dip.badway;

import java.sql.ResultSet;
import java.util.List;
import java.util.function.Function;

public interface BancoDeDadosGenerico<T> {
        T connection(String url, String db, String password, String username);
        void desconectar(T conexao);
        boolean isConectado(T conexao);

        void executarUpdate(T conexao, String sql);
        <R> List<R> executarQuery(T conexao, String sql, Function<ResultSet, R> mapper);

        void iniciarTransacao(T conexao);
        void commit(T conexao);
        void rollback(T conexao);

        boolean testeConexao(String url, String db, String password, String username);
    }


