package br.com.abc.javacore.introducaoMetodos.testes;

import br.com.abc.javacore.introducaoMetodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("José Malcher JR");
        estudante.setIdade(34);
        estudante.setNotas(new double[]{5,10,4.1});
        estudante.print();
        estudante.calcMedia();
        estudante.calcMedia();
        System.out.println("APROVADO: " + estudante.isSituacao());

    }
}
