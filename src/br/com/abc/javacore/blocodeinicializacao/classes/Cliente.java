package br.com.abc.javacore.blocodeinicializacao.classes;

public class Cliente {

    /*
    *   1 - Alocado espaço na memória para o objete que será criado
    *   2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitados
    *   3 - Bloco de inicialização é executado
    *   4 - o construtor é executado
    *
    * */

    //private int[] parcelas = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    private int[] parcelas;

    // inicio do bloco de inicialização
    {
        parcelas = new int[100];
        System.out.println("Dentro do blobo de inicialização!");
        for(int i = 1 ; i <= 100; i++){
            parcelas[i - 1] = i;
        }
    }

    public Cliente() {
//        System.out.println("Dentro do construtor");
//        for (int parcela : this.parcelas){
//            System.out.print(parcela + " ");
//        }
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
