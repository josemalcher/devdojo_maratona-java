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
        *  []
        *
        *  ? zero ou uma
        *  * zero ou mais
        *  + uma ou mais
        *  {n,m} de n até m
        *  ()
        *  |
        *  &
        *  o(v|c)o = ovo, oco
        *  maca(rr|c)ão = macarrão ou macação
        *
        */

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0X01FFABC 0x10G 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto: " + texto);
        System.out.println("Indice: 0123456789 ");
        System.out.println("Expressão: " + matcher.pattern());
        System.out.println("Posições encontradas: ");
        while(matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }

    }
}
