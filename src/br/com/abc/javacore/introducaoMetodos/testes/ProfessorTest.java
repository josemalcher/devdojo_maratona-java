package br.com.abc.javacore.introducaoMetodos.testes;

import br.com.abc.javacore.introducaoMetodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof1 = new Professor();
        prof1.nome = "jose";
        prof1.matricula = "123";
        prof1.rg = 321;
        prof1.cpf = "123.123.123-55";

        Professor prof2 = new Professor();
        prof2.nome = "Mario";
        prof2.matricula = "222";
        prof2.rg = 314;
        prof2.cpf = "321.321.122-11";

        prof1.imprime(prof1);
        prof1.imprime(prof2);

        /*
        System.out.println(prof1.nome);
        System.out.println(prof1.matricula);
        System.out.println(prof1.cpf);
        System.out.println(prof1.rg);

        System.out.println(prof2.nome);
        System.out.println(prof2.matricula);
        System.out.println(prof2.cpf);
        System.out.println(prof2.rg);
        */
    }
}
