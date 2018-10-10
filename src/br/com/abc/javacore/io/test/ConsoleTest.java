package br.com.abc.javacore.io.test;

import java.io.Console;

public class ConsoleTest {
    public static void main(String[] args) {
        Console c = System.console();
        char[] pw = c.readPassword("%s", "pw:");
        for(char pass : pw){
            c.format("%c", pass);
        }
        c.format("\n");

        String texto;
        while(true){
            texto = c.readLine("%s", "Digite: ");
            c.format("Ese texto %s foi digitado", retorno(texto));
        }

    }

    private static String retorno(String texto) {
        return texto;
    }
}
