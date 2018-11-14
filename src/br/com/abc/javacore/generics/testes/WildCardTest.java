package br.com.abc.javacore.generics.testes;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Animal{
    public abstract void consulta();
}

class Cachorro extends Animal implements Comparable{
    @Override
    public void consulta() {
        System.out.println("Consultando Cachorro");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class Gato extends Animal{
    @Override
    public void consulta() {
        System.out.println("Consultando GATO!");
    }
}

public class WildCardTest {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};

        //consultarAnimais(cachorros);
        //consultarAnimais(gatos);

        List<Cachorro> cachorroList = new ArrayList<>();
        cachorroList.add(new Cachorro());

        List<Gato> gatoList = new ArrayList<>();
        gatoList.add(new Gato());

        consultaAnimalList(cachorroList);
        consultaAnimalList(gatoList);
        ordernaLista(cachorroList);

    }

    public static void consultarAnimais(Animal[] animals){
        for(Animal animal : animals){
            animal.consulta();
        }
    }

    // type erasure | ?
    public static void consultaAnimalList(List<? extends Animal> animals){
        for(Animal animal : animals){
            animal.consulta();
        }
    }
    public static void consultaCachorroList(List<? super Cachorro> cachorroList){
        Cachorro c1 = new Cachorro();
        Animal c2 = new Cachorro();
        Object o = new Cachorro();
        cachorroList.add(new Cachorro());
    }

    public static void ordernaLista(List<? extends Comparable> lista){
        Collections.sort(lista);
    }

}
