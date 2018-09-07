package br.com.abc.javacore.introducaoMetodos.testes;

import br.com.abc.javacore.introducaoMetodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        System.out.println("Continua...");
        calc.subtraiDoisNumeros();
        System.out.println("fim!");
    }
}
