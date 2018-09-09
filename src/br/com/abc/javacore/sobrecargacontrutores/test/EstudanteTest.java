package br.com.abc.javacore.sobrecargacontrutores.test;

import br.com.abc.javacore.sobrecargacontrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante("123","José Malcher Jr.", new double[]{8.5,8.5,3.0}, "rg123");
        est.imprime();
    }
}
