package br.com.abc.javacore.jdbc.testes;

import br.com.abc.javacore.jdbc.conn.ConexaoFactory;


public class TesteConexao {
    public static void main(String[] args) {
        ConexaoFactory conn = new ConexaoFactory();
        conn.getConexao();
    }
}
