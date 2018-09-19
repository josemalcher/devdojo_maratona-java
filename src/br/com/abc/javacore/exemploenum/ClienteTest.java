package br.com.abc.javacore.exemploenum;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jose", TipoCliente.PESSOA_FISICA);
        System.out.println(cliente);
    }
}
