public class OperadoresAtribuicao {
    public static void main(String[] args) {
        // = , -= , += , /= , %=

        int salario = 1000;
        //salario = salario + 200;
        //salario += 200;
        salario = salario + (int)(salario * 0.2);
        int numero = 11;
        numero %= 2;

        System.out.println(salario);
        System.out.println(numero);

    }
}
