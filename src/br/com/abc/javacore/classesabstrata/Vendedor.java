package br.com.abc.javacore.classesabstrata;

public class Vendedor extends Funcionario {

    private double vendas;

    @Override
    public void calculaSalario() {
        this.salario = salario + (vendas * 0.5);
    }

    public Vendedor() {
    }

    public Vendedor(String nome, String clt, double salario, double vendas) {
        super(nome, clt, salario);
        this.vendas = vendas;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    @Override
    public void imprime() {

    }
}
