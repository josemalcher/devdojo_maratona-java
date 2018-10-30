package br.com.abc.javacore.colecoes.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversaoDeListasArraysTest {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(9);
        numeros.add(0);
        numeros.add(5);
        numeros.add(1);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);

        Integer[] numerosArrays = new Integer[numeros.size()];
        numeros.toArray(numerosArrays);
        System.out.println(numeros);
        System.out.println(Arrays.toString(numerosArrays));
        System.out.println("----------------------");

        Integer[] numerosArrys2 = new Integer[4];
        numerosArrys2[0] = 9;
        numerosArrys2[1] = 3;
        numerosArrys2[2] = 4;
        numerosArrys2[3] = 0;

        List<Integer> numeros2 = Arrays.asList(numerosArrys2);
        System.out.println(numeros2);

        List<Integer> numeros3 = new ArrayList<>();
        numeros3.addAll(Arrays.asList(numerosArrys2));
        System.out.println(numeros3);

        numeros2.set(0,1);
        numeros3.add(10);

        System.out.println(numeros2);
        System.out.println(numeros3);

    }
}
