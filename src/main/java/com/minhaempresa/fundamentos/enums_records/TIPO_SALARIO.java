package com.minhaempresa.fundamentos.enums_records;

public enum TIPO_SALARIO {
    CLT(1, "clt") {
        @Override
        public double calcular(double salario) {
            return salario * 1.3;
        }
    },
    CNPJ(2, "cnpj") {
        @Override
        public double calcular(double salario) {
            return salario * 1.2;
        }
    },
    CONTRATAL(3, "contratal") {
        @Override
        public double calcular(double salario) {
            return salario * 1.5;
        }
    };

    private final int code;
    private final String description;

    TIPO_SALARIO(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public abstract double calcular(double salario);
}
