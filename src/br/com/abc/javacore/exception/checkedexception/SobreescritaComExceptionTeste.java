package br.com.abc.javacore.exception.checkedexception;

import java.io.FileNotFoundException;

public class SobreescritaComExceptionTeste {
    public static void main(String[] args) {
        Funcionario fun = new Funcionario();
        Pessoa p = new Pessoa();
        try {
            fun.salvar();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
