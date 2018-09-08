package br.com.abc.javacore.introducaoMetodos.testes;

import br.com.abc.javacore.introducaoMetodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome =  "José Malcher JR;";
        estudante.idade = 34;
        //estudante.notas = new double[]{5,5,4.1};
        estudante.print();
        estudante.calcMedia();
    }
}
