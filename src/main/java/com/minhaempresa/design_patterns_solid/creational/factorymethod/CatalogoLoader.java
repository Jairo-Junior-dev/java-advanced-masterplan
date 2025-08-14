package com.minhaempresa.design_patterns_solid.creational.factorymethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;
import java.util.Map;

public class CatalogoLoader {
    public static List<Map<String, Object>> carregar(String caminho) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(new File(caminho), new TypeReference<List<Map<String, Object>>>() {});
        } catch (Exception e) {
            throw new RuntimeException("Erro ao carregar catálogo: " + e.getMessage(), e);
        }
    }
}