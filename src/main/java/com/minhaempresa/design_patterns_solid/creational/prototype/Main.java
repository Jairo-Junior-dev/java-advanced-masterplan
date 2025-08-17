package com.minhaempresa.design_patterns_solid.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Prototype prototype = new DocumentoPDF("Carlos");
        Prototype prototype1 = prototype.cloner();
        Prototype prototype2 = new DocumentoPDF("CAAARLOS");
        System.out.println( prototype1);
        System.out.println(prototype);
        System.out.println(prototype1.equals(prototype));
    }
}
