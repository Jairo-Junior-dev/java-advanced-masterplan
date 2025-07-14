    package com.minhaempresa.fundamentos.enums_records;

    import java.time.LocalDate;
    import java.util.UUID;

    public record Pessoa(String nome, UUID id, LocalDate dataDeNacimento) {

        public Pessoa {
            if (nome == null) {
                throw new IllegalArgumentException("Nome não pode ser nulo");
            }
            if (id == null) {
                throw new IllegalArgumentException("ID não pode ser nulo");
            }
            if (dataDeNacimento == null) {
                throw new IllegalArgumentException("Data de nascimento não pode ser nula");
            }
        }
    }
