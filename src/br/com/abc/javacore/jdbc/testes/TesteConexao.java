package br.com.abc.javacore.jdbc.testes;

import br.com.abc.javacore.jdbc.classes.Comprador;
import br.com.abc.javacore.jdbc.db.CompradorDB;


public class TesteConexao {
    public static void main(String[] args) {

        Comprador comprador = new Comprador("789.789.789-55", "Jose Junior ");
        CompradorDB compradorDB = new CompradorDB();
        compradorDB.save(comprador);
    }
}
