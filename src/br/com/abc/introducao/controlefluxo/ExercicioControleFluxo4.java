package br.com.abc.introducao.controlefluxo;

public class ExercicioControleFluxo4 {

    public static void main(String[] args) {
        // imprima todos os numero pares de 0 até 100000

        int valor = 10000000;
        for (int i = 0 ; i<= valor ; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

    }
}
