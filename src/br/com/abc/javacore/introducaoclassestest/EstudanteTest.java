package br.com.abc.javacore.introducaoclassestest;

import br.com.abc.javacore.introducaoclasses.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante jose = new Estudante();

        jose.nome = "José Malcher";
        jose.matricula = "201901";
        jose.idade = 34;

        System.out.println(jose.nome);
        System.out.println(jose.matricula);
        System.out.println(jose.idade);

    }
}
