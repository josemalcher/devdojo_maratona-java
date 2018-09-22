package br.com.abc.javacore.assertions;

public class AssertTest {
    public static void main(String[] args) {
        calcSalario(-100);
    }

    private static void calculaSalario(double salario){
        assert(salario > 0): "Salario deve Ser maior que ZERO";
        // Run configuration - VM
        // -ea
    }
    public static void calcSalario(double salario){
        if(salario < 0){
            throw new IllegalArgumentException();
        }
    }

    public static void diasDaSemana(int dia){
        switch (dia){
            case 1:
                break;
            case 2:
                break;
                default: assert false;
        }
    }
}
