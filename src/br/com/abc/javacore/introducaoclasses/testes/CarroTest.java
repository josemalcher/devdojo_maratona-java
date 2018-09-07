package br.com.abc.javacore.introducaoclasses.testes;

import br.com.abc.javacore.introducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "KA";
        carro.placa = "oju0101";
        carro.velocidadeMaxima = 200f;
        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);
    }
}
