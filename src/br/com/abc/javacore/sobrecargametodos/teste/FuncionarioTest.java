package br.com.abc.javacore.sobrecargametodos.teste;

import br.com.abc.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
       /* funcionario.setNome("José");
        funcionario.setCpf("789.789.789.66");
        funcionario.setSalario(5000.25);*/
       funcionario.init("Jose", "789.123.123.22", 5000.59,"444422");
       //funcionario.init("Jose", "789.123.123.22", 5000.59);
        funcionario.imprime();
    }
}
