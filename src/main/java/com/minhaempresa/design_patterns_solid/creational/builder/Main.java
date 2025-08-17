package com.minhaempresa.design_patterns_solid.creational.builder;

import com.minhaempresa.design_patterns_solid.creational.prototype.DocumentoPDF;

public class Main {
    public static void main(String[] args) {
        SQLBuilder sqlBuilder = new SQLBuilder();
        sqlBuilder.Select("nome", "idade", "casa").
                from(DocumentoPDF.class).
                where("idade", " 28 ").
                where("nome", "jairo");
        System.out.println(sqlBuilder.build());

    }
}