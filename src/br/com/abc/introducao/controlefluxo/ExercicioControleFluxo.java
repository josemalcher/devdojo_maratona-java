package br.com.abc.introducao.controlefluxo;

public class ExercicioControleFluxo {
    public static void main(String[] args) {
        /*
         * Crie uma variável salario e imprima seu imposto
         * Imposto:
         * salario < 1000 5%
         * salario >= 1000 && salario < 2000 10$
         * salario >= 2000 && salario < 4000 15%
         * salario > 5000 20%
         * */
        double salario = 900;
        double totalImposto = 0;

        if (salario < 1000) {
            totalImposto = salario * 0.05;
        } else if (salario >= 1000 && salario < 2000) {
            totalImposto = salario * 0.1;
        } else if (salario >= 2000 && salario < 4000) {
            totalImposto = salario * 0.15;
        } else {
            totalImposto = salario * 0.2;
        }
        System.out.println("O total de impostos = " + totalImposto);

    }
}
