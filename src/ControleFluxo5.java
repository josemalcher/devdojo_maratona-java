public class ControleFluxo5 {
    public static void main(String[] args) {
        /* Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
         * Porém as parcelas não podem ser menores do que 1.000 */

        double valorTotal = 30000;
        for(int parcela = 1 ; parcela <= valorTotal ; parcela++){
            double valorParcela = valorTotal/parcela;
            if(valorParcela < 1000){
                break;
            }
            System.out.println("Parcela "+ parcela + " R$ "+ valorParcela);

        }

    }
}
