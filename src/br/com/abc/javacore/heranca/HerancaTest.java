package br.com.abc.javacore.heranca;

public class HerancaTest {
    public static void main(String[] args) {
        //Pessoa p = new Pessoa("Jose");
        Endereco end = new Endereco();
        //p.setNome("Jose");
        //p.setCpf("789");
        //end.setRua("Rua Tal");
        end.setBairro("Marco");
        //p.setEndereco(end);
        //p.imprime();

        System.out.println("------------------");

        Funcionario f = new Funcionario("Jose Funcionario");
        //f.setNome("Jose Funcionario");
        f.setCpf("916");
        f.setSalario(3000.00);
        f.setEndereco(end);
        //f.imprime();
    }
}
