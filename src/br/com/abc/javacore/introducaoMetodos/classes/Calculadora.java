package br.com.abc.javacore.introducaoMetodos.classes;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(5 - 5);
    }

    public void multiplicaDoisNumero(double num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDoisNumerosDivididos(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return; // funciona como um bream em métodos void
        }
        System.out.println("Não é possível dividir por 0");
    }

    public void alteraDoisNumeros(int a, int b) {
        a = 20;
        b = 30;
        System.out.println("Dentro do método alteraDoisNumeros");
        System.out.println("num 1 = " + a);
        System.out.println("num 2 = " + b);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    //public void somaVarArgs(String valorDouble, int... numeros) {
    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
