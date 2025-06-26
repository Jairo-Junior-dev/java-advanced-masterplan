package com.minhaempresa.fundamentos.tipos_primitivos;

public class WrappersPrimitivos {
    public static void main(String[] args) {

        // Integer
        Integer inteiro = Integer.valueOf("42");
        int primitivoInt = inteiro.intValue();

        System.out.println("Integer:");
        System.out.println("- valor primitivo: " + primitivoInt);
        System.out.println("- binário: " + Integer.toBinaryString(inteiro));
        System.out.println("- hexadecimal: " + Integer.toHexString(inteiro));
        System.out.println("- comparando com 100: " + Integer.compare(inteiro, 100));
        System.out.println("- quantidade de bits 1: " + Integer.bitCount(inteiro));
        System.out.println();


        Double decimal = Double.parseDouble("3.14159");
        double primitivoDouble = decimal.doubleValue();

        System.out.println("Double:");
        System.out.println("- valor primitivo: " + primitivoDouble);
        System.out.println("- é infinito? " + decimal.isInfinite());
        System.out.println("- é NaN? " + decimal.isNaN());
        System.out.println("- comparando com 2.71: " + Double.compare(decimal, 2.71));
        System.out.println();


        Character letra = 'A';
        System.out.println("Character:");
        System.out.println("- é letra? " + Character.isLetter(letra));
        System.out.println("- é maiúscula? " + Character.isUpperCase(letra));
        System.out.println("- minúscula: " + Character.toLowerCase(letra));
        System.out.println();


        Boolean bool = Boolean.parseBoolean("true");
        boolean primitivoBool = bool.booleanValue();

        System.out.println("Boolean:");
        System.out.println("- valor primitivo: " + primitivoBool);
        System.out.println("- é igual a true? " + bool.equals(Boolean.TRUE));
        System.out.println("- toString(): " + Boolean.toString(primitivoBool));
    }
}