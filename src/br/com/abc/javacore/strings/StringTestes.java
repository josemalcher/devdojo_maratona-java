package br.com.abc.javacore.strings;

public class StringTestes {
    public static void main(String[] args) {
        String nome = "jose";

        //nome.concat("Malcher Jr.");
        nome = nome.concat("Malcher Jr.");

        String nome2 = " Malcher Jr.";
        String nome3 = new String("jose");
        // 1 Variavel de referencia 2-um obj do tipo String 3- uma String no pool de String

        System.out.println(nome);
    }
}
