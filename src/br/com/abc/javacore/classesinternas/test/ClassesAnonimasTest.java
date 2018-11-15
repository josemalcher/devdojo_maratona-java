package br.com.abc.javacore.classesinternas.test;


import br.com.abc.javacore.generics.classes.Carro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Animal{
    public void andar(){
        System.out.println("Andando...");
    }
}

public class ClassesAnonimasTest {
    public static void main(String[] args) {
        Animal a = new Animal(){
            @Override
            public void andar() {
                System.out.println("Andando Anonimamente!!!");
            }

            public void correr(){ /* Não é possível!!*/
                System.out.println("CORRENDO!");
            }
        };
        a.andar();

        List<Carro> carroList  = new ArrayList<>();
        carroList.add(new Carro("FERRARI"));
        carroList.add(new Carro("AUDI"));
        carroList.add(new Carro("BMW"));
        Collections.sort(carroList, new Comparator<Carro>(){
            @Override
            public int compare(Carro o1, Carro o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        System.out.println(carroList);

    }
}
