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
        *  ^ - Negação
        *
        */

//        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
//        String texto = "12 0x 0X 0X01FFABC 0x10G 0x1";

        //String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; //([\\w\\.])+@([a-zA-Z])+(\.([a-zA-Z])+)+
        //String texto = "fulano@hotmail.com, 123abc@gmail.com, @#te@gmail.com, teste@teste.com.br, teste@teste.com, teste@mail";

        //String regex = "\\d{2}/\\d{2}/\\d{2,4}";
        //String texto = "05/10/2010 05/05/2015 1/1/01 01/05/95"; // dd/MM/yyyy

        String regex = "proj([^,])*";
        String texto = "proj1.bkp, proj1.java, proj1.classes, proj1final.java, proj2.bkp, proj3.java, diagrama, texto, foto";

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
