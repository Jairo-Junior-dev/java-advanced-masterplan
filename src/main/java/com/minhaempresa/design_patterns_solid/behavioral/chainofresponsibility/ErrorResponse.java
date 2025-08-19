package com.minhaempresa.design_patterns_solid.behavioral.chainofresponsibility;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ErrorResponse {
    private Map<Class<?>, List<String >>erros;
    public ErrorResponse(){
        this.erros = new HashMap<>();
    }

    public void addError (Class<?> classDoError , List<String> errors ){
        this.erros.put(classDoError,errors);
    }

    public Map<Class<?>, List<String >> getErros(){
        return erros;
    }

    public void detalharInfor() {
        for (Map.Entry<Class<?>, List<String>> errorInfor : erros.entrySet()) {
            Class<?> clazz = errorInfor.getKey();
            System.out.println("Classe responsável: " + clazz.getSimpleName());
            Method[] methods = clazz.getDeclaredMethods();
            System.out.println("Métodos responsáveis:");
            for (Method m : methods) {
                System.out.println(" - " + m.getName());
            }
            System.out.println("Errors: " + errorInfor.getValue());
        }
    }

}
