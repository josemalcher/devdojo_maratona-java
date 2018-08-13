public class OperadoresLogicos {
    public static void main(String[] args) {
        int idade = 18;
        float salario = 2000f;

        System.out.println(idade >= 16 && salario >= 2000);
        System.out.println(idade <= 16 && salario >= 2000);
        System.out.println(idade >= 16 || salario >= 2000);
    }
}
