package com.minhaempresa.fundamentos.tipos_primitivos;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TiposPrimitivos {


    public static void main(String[] args) {
        /**
         * AO TOTAL SÃO 8 TIPOS PRIMITIVOS
         * */
        byte b = 2;
        long l = 222;
        int i = 32;

        float f = 3.3f;
        double d = 4.4d;

        char c1 = 'a';
        char c2 = 64;
        boolean bool = true;
        /**
         *Operadores Logicos:
         *  &&(and | e) quando as duas sentenças estão Corretas
         *  ||(or | ou ) quando pelo menos uma das sentenças esteja correta
         *Operadores aritimeticos
         *  > Maior que
         *  < Menor que
         *  == igual a que
         *  ! Diferente(Negação)
         *  >= maior ou igual a que
         *  <= menor ou igual a que
         * */

        boolean and = (b > 1 && l > 200);
        boolean or = (b > 1 || l > 200);
        System.out.printf("Setença and com valores: %d  e  %d sejam maior que 200 é %b%n",b,l,and);
        System.out.printf("Setença and com valores: %d  ou  %d sejam maior que 200 é %b%n",b,l,or);
        /*
        * Tipo de referencia :
        *  Quando faz referencia a uma classe ou objeto
        *
        * */
        char c3 = '\u263A';
        String string = new String(new char[]{'a','b','a','c','a','x','i'});
        System.out.printf("%s%n%n",string);
        string = "Cebola , Carne , Tomate , Alface";
        System.out.printf("%s%n%n",string);
        String[] nstring = string.split(" , ");
        System.out.printf("%c Terceira posição : %s%n%n" ,c3,nstring[2]);
        string = nstring[2].substring(2);
        System.out.printf("%c SubString da palavra %s : %s%n%n" ,c3, nstring[2] ,string);
        String concat = " é muito bom!";
        string = nstring[2].concat(concat);
        System.out.printf("%c Concatenação da palavra '%s' com a frase '%s' : %s%n%n" , c3,nstring[2] ,concat,string);
        string = nstring[2].replace('T','S');
        System.out.printf("%c A palavra refeita  '%s' : %s%n%n" ,c3, nstring[2] ,string);
        int[] numeros = {1,2,3};
        String array = Arrays.stream(numeros).mapToObj(String::valueOf).collect(Collectors.joining(" , "));
        System.out.println(array);
        int[] nNumeros = {12, 34, 56,45 ,54,34,43};
        Map<String, List<Integer>> map = Arrays.
                stream(nNumeros).boxed().
                collect(Collectors.groupingBy(n-> n%2 == 0 ?"PAR":"ÍMPARES"));

        System.out.println(map);

    }




}
