package br.com.abc.javacore.generics.testes;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        // type erasure
        List<String> lista = new ArrayList<>();
        lista.add("String");
        lista.add("String");
        lista.add("José Malcher");

        for(String obj : lista){
            System.out.println(obj);
        }
        add(lista, 1L);


        /*for(String obj : lista){
            System.out.println(obj);
        }*/
        /*
        Exception in thread "main" java.lang.ClassCastException: java.lang.Long cannot be cast to java.lang.String
	    at br.com.abc.javacore.generics.testes.GenericsTest.main(GenericsTest.java:18)
	    */
    }

    public static void add(List lista, Long l){
        lista.add(l);
    }
}
