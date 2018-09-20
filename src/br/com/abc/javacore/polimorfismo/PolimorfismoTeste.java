package br.com.abc.javacore.polimorfismo;

public class PolimorfismoTeste {
    public static void main(String[] args) {
        Gerente g = new Gerente("Jose", 5000 , 2000);
        Vendedor v = new Vendedor("Mario", 2000, 20000);

        RelatorioPagamento relatorioPagamento = new RelatorioPagamento();
//        relatorioPagamento.relatorioPagamentoGerente(g);
//        System.out.println("------------------------------------------------------");
//        relatorioPagamento.relatorioPagamentoVendedor(v);
        relatorioPagamento.relatorioPagamentoGenerico(g);
        System.out.println("------------------------------------------------------");
        relatorioPagamento.relatorioPagamentoGenerico(v);

//        Funcionario f = g;
//        System.out.println("##########################");
//        System.out.println(f.getSalario());

    }

    /*
    RELATORIO PARAMENTO VENDEDOR
    Nome: Jose
    Salario do mes 7000.0
    ------------------------------------------------------
    RELATORIO PARAMENTO VENDEDOR
    Nome: Mario
    Salario do mes 3000.0
    * */

}
