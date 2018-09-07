package br.com.abc.javacore.introducaoMetodos.testes;

import br.com.abc.javacore.introducaoMetodos.classes.Calculadora;

public class ParametrosTest {
    public static void main(String[] args) {
        Calculadora calcu = new Calculadora();
        int num1 = 100;
        int num2 = 500;

        calcu.alteraDoisNumeros(num1, num2);

        System.out.println("Dentro do método Principal de Teste");
        System.out.println("num1 = "+ num1);
        System.out.println("num2 = "+ num2);
    }
}
