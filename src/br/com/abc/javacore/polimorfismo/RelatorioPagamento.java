package br.com.abc.javacore.polimorfismo;

public class RelatorioPagamento {

    /*public void relatorioPagamentoGerente(Gerente gerente){
        System.out.println("RELATORIO PARAMENTO GERENTE");
        gerente.calcularPagamento();
        System.out.println("Nome: "+ gerente.getNome());
        System.out.println("Salario do mes "+ gerente.getSalario());
    }

    public void relatorioPagamentoVendedor(Vendedor vendedor){
        System.out.println("RELATORIO PARAMENTO VENDEDOR");
        vendedor.calcularPagamento();
        System.out.println("Nome: "+ vendedor.getNome());
        System.out.println("Salario do mes "+ vendedor.getSalario());
    }*/

    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("RELATORIO PARAMENTO VENDEDOR");
        funcionario.calcularPagamento();
        System.out.println("Nome: "+ funcionario.getNome());
        System.out.println("Salario do mes "+ funcionario.getSalario());
    }

}
