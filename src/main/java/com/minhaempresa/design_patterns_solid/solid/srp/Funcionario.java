package com.minhaempresa.design_patterns_solid.solid.srp;

public class Funcionario {
    private String name;
    private double salario;
    public void setarFuncionario( String nome, double salario){

        this.salario = salario;
        this.name = nome;
    }

    public void calcularSalario(){
          this.salario  = this.salario *  1.3;
    }
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
