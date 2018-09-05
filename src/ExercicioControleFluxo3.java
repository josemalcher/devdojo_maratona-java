public class ExercicioControleFluxo3 {
    /*  Crie um switch que dado um valor de 1 a 7
     *   considerando 1 domingo imprima se é dia util ou dia de semana
     **/
    public static void main(String[] args) {
        byte dia = 7;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Últil");
                break;
            default:
                System.out.println("Opção inválida");

        }
    }
}
