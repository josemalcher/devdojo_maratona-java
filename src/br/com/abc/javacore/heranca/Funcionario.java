package br.com.abc.javacore.heranca;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome) {
        super(nome); // primeira linha sempre!
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    static{
        System.out.println("BLoco de inicilização estático - FUNCIONARIO");
    }
    {
        System.out.println("BLoco de inicialização - 1 - funcionario");
    }
    {
        System.out.println("BLoco de inicialização - 2 - funcionario");
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salario: "+ this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento(){
        System.out.println("Eu " + super.getNome() + " Recebi "+ this.salario);
    }
}
