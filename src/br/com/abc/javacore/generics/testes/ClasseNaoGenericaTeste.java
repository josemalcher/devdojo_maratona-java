package br.com.abc.javacore.generics.testes;


import br.com.abc.javacore.generics.classes.Carro;
import br.com.abc.javacore.generics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

class CarroAlugavel{
    private List<Carro> carroDisponiveis = new ArrayList<>();

    {
        carroDisponiveis.add(new Carro("GOL"));
        carroDisponiveis.add(new Carro("BMW"));
    }

    //alugar
    public Carro getCarroDisponivel(){
        Carro c = carroDisponiveis.remove(0);
        System.out.println("Alugando Carro " + c);
        System.out.println("Corros disponíveis "+ carroDisponiveis);
        return c;
    }
    public void devolverCarro(Carro c){
        System.out.println("DEVOLVENDO carro "+ c);
        carroDisponiveis.add(c);
        System.out.println("Corros disponíveis "+ carroDisponiveis);
    }
}

class ComputadorAlugavel {
    private List<Computador> computadoresDisponiveis = new ArrayList<>();
    {
        computadoresDisponiveis.add(new Computador("Alienware"));
        computadoresDisponiveis.add(new Computador("HP"));
    }
    //Alugar
    public Computador getComputadorDisponivel(){
        Computador c = computadoresDisponiveis.remove(0);
        System.out.println("Alugando pc: "+c);
        System.out.println("PC disponiveis: "+ computadoresDisponiveis);
        return c;
    }
    public void devolverComputador(Computador c){
        System.out.println("Devolvendo PC: "+c);
        computadoresDisponiveis.add(c);
        System.out.println("PC disponiveis: "+ computadoresDisponiveis);
    }
}

public class ClasseNaoGenericaTeste {
    public static void main(String[] args) {

        CarroAlugavel carroAlugavel = new CarroAlugavel();
        Carro carroAlugado = carroAlugavel.getCarroDisponivel();
        System.out.println("USANDO O CARRO POR UM MES");
        carroAlugavel.devolverCarro(carroAlugado);

        System.out.println(" -----------------------  ");

        ComputadorAlugavel computadorAlugavel = new ComputadorAlugavel();
        Computador computador = computadorAlugavel.getComputadorDisponivel();
        System.out.println("Usando o PC");
        computadorAlugavel.devolverComputador(computador);
    }
}
