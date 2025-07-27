package com.minhaempresa.design_patterns_solid.solid.srp;

public class Funcionario {
    private String name;
    private double salario;
    // Funcionalidade unica de adicionar nome e salario.
    public void setarFuncionario( String nome, double salario){

        this.salario = salario;
        this.name = nome;
    }

    //Funcionalidade Unica de calcular o salario.
    public void calcularSalario(){
          this.salario  = this.salario *  1.3;
    }
    //Funcionalidade unica de mostrar as informações do funcionario.
    public void mostrarInfor(){
        System.out.println("Nome do funcionario:  " + this.name + "\n Salario do funcionario: " + this.salario);
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setarFuncionario("Jairo",123d);
        funcionario.calcularSalario();
        funcionario.mostrarInfor();
    }
}
