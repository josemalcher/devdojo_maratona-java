package br.com.abc.javacore.exemploenum;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jose", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.AVISTA);
        Cliente cliente2 = new Cliente("Jose 2", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.APRAZO);
        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(TipoCliente.PESSOA_FISICA.getId());
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
    }
}
