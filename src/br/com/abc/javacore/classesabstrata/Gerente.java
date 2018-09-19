package br.com.abc.javacore.classesabstrata;

public class Gerente extends Funcionario {
    public Gerente() {
    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    public void calculaSalario() {
        //super.calculaSalario();
        this.salario = salario + (salario * 0.2);
    }
}
