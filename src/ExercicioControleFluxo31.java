import java.util.Scanner;

public class ExercicioControleFluxo31 {
    static void show(String mensagem) {
        System.out.printf(mensagem + "\n");
    }

    static Scanner Scanner() {
        return new Scanner(System.in);
    }

    public static void main(String[] args) {
        String[] DiaDaSemana = {"Domingo", "Segunda", "Quarta", "Quinta", "Sexta", "Sábado"};
        show("Digite um dia da semana");

        int dia = Scanner().nextInt();

        System.out.println();

        switch (dia) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                show("Dia útil");
                break;
            case 5:
                show("Final de Semana");
                break;
            case 6:
                show("Dia útil");
                break;
            default:
                show("Inválido");

        }

    }
}
