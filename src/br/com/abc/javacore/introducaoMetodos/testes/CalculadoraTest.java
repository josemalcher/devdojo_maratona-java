package br.com.abc.javacore.introducaoMetodos.testes;

import br.com.abc.javacore.introducaoMetodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Soma");
        calc.somaDoisNumeros();
        System.out.println("Subatração");
        calc.subtraiDoisNumeros();
        System.out.println("Multiplicação");
        calc.multiplicaDoisNumero(2.2, 100);

        System.out.println("Divisão");
        double result = calc.divideDoisNumeros(10,2);
        System.out.println(result);
        System.out.println(calc.divideDoisNumeros(20,2));

        System.out.println("fim!");
    }
}
