package com.minhaempresa.design_patterns_solid.creational.builder;
public class SQLBuilder {

    private StringBuilder sql;
    private boolean hasWhere = false;

    public SQLBuilder(){
        sql = new StringBuilder();
    }

    public SQLBuilder Select(String... columns) {
        sql.append("SELECT ");
        if (columns.length == 0){
            sql.append("*");
            return this;
        }
        for (int i = 0; i < columns.length; i++){
            sql.append(columns[i]);
            if (i < columns.length - 1){
                sql.append(", ");
            }
        }
        return this;
    }

    public SQLBuilder from(Class<?> object){
        sql.append(" FROM ").append(object.getSimpleName());
        return this;
    }

    public SQLBuilder where(String column, Object value){
        if (!hasWhere){
            sql.append(" WHERE ");
            hasWhere = true;
        } else {
            sql.append(" AND ");
        }
        if (value instanceof String){
            sql.append(column).append(" = '").append(value).append("'");
        } else {
            sql.append(column).append(" = ").append(value);
        }
        return this;
    }

    public String build(){
        return sql.toString();
    }
}
