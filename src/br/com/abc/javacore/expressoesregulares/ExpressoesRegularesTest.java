package br.com.abc.javacore.expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {
    public static void main(String[] args) {

        /*
        *  \d - todos os dígitos
        *  \D - Tudo que não for dígito
        *  \s - espaços em branco \t \n \f \r
        *  \S - caracteres que naõ é branco
        *  \w - caracteres de palavras a-z A-Z, digitos e _
        *  \W - tudo o que não for caractere de palavra
        */

        String regex = "\\W";
        String texto = "0a  #$ ba1ba2baba345 ";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto: " + texto);
        System.out.println("Indice: 0123456789 ");
        System.out.println("Expressão: " + matcher.pattern());
        System.out.println("Posições encontradas: ");
        while(matcher.find()){
            System.out.print(matcher.start() + " ");
        }

    }
}
