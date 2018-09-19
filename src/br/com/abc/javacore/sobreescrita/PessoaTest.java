package br.com.abc.javacore.sobreescrita;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Jose Malcher jr");
        p.setIdade(34);
        System.out.println(p);
        System.out.println(p.toString());
    }
}
