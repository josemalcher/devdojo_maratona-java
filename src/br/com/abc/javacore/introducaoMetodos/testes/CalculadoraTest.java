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

        System.out.println("Divisão");
        calc.imprimeDoisNumerosDivididos(10,2);
        calc.imprimeDoisNumerosDivididos(10,0);

        System.out.println("fim!");
        System.out.println("Var Args");

        int[] numeros = {1,2,3,4,5};
        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5);


    }
}
