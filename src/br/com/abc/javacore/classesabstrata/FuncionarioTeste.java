package br.com.abc.javacore.classesabstrata;

public class FuncionarioTeste {
    public static void main(String[] args) {
        //Funcionario f = new Funcionario("Marcos", "2018", 2000);
        Gerente g = new Gerente("Ana", "123-123", 2000);
        Vendedor v = new Vendedor("Camila", "123", 2000, 5000);
        //f.calculaSalario();
        g.calculaSalario();
        v.calculaSalario();
        //System.out.println(f);
        System.out.println(v);
        System.out.println(g);
    }
}
