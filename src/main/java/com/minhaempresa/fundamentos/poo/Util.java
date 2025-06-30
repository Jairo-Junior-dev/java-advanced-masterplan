package com.minhaempresa.fundamentos.poo;

import java.util.List;
import java.util.function.Predicate;

public class Util {

    public static <T> void mostrarInformacoes(List<T> entidades) {
        for (T entidade : entidades) {
            System.out.println(entidade);
        }
    }

    public static <T> int contar(List<T> entidades) {
        return entidades.size();
    }

    public static <T> void filtrarEExibir(List<T> entidades, Predicate<T> condicao) {
        for (T entidade : entidades) {
            if (condicao.test(entidade)) {
                System.out.println(entidade);
            }
        }
    }

    public static <T> boolean todosAtendem(List<T> entidades, Predicate<T> condicao) {
        for (T entidade : entidades) {
            if (!condicao.test(entidade)) {
                return false;
            }
        }
        return true;
    }

    public static <T> void paraCada(List<T> entidades, java.util.function.Consumer<T> acao) {
        for (T entidade : entidades) {
            acao.accept(entidade);
        }
    }

}
