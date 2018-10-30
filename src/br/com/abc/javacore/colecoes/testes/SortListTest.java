package br.com.abc.javacore.colecoes.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Jose");
        nomes.add("Luci");
        nomes.add("DevDojo");
        nomes.add("Breno");
        nomes.add("Caio");
        nomes.add(0, "Anna");

        Collections.sort(nomes);

        List<Double> numeros = new ArrayList<>();
        numeros.add(1.6);
        numeros.add(1.1);
        numeros.add(0.6);
        numeros.add(1.0);
        numeros.add(2d);

        Collections.sort(numeros);

        for(String nome: nomes){
            System.out.println(nome);
        }

        for(Double numero : numeros){
            System.out.println(numero);
        }

        /*
        *   Anna
            Breno
            Caio
            DevDojo
            Jose
            Luci
            0.6
            1.0
            1.1
            1.6
            2.0
        *
        * */

    }
}
