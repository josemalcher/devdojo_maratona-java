package br.com.abc.javacore.exception.checkedexception;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTeste {
    public static void main(String[] args) {
        criarArquivo();
    }

    private static void criarArquivo() {
        File file = new File("testeCheckedException.txt");

        try {
            file.createNewFile();
            System.out.println("Arquivo Criado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
