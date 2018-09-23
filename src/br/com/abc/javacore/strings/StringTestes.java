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

        String teste  = "Maria";
        String teste2 = "maria";
        String teste3 = "AAaaaaoooooii";
        String teste4 = "     meio      ";

        System.out.println(teste.charAt(3)); // i
        System.out.println(teste.equalsIgnoreCase(teste2)); // true
        System.out.println(teste.length()); // 5


        System.out.println(teste3.replace('a', 'B')); // AABBBBoooooii
        System.out.println(teste3.toUpperCase()); // AAAAAAOOOOOII
        System.out.println(teste3.toLowerCase()); // aaaaaaoooooii

        System.out.println(teste.substring(0,3)); // Mar
        System.out.println(teste4.trim()); //meio


    }
}
