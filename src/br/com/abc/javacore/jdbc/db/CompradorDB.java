package br.com.abc.javacore.jdbc.db;

import br.com.abc.javacore.jdbc.classes.Comprador;
import br.com.abc.javacore.jdbc.conn.ConexaoFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CompradorDB {
    public void save(Comprador comprador){

        String sql = "INSERT INTO `devdojo_agencia`.`comprador` (`cpf`,`nome`) VALUES ('"+comprador.getCpf()+"' , '"+comprador.getNome()+"')";
        System.out.println(sql);
        Connection conn = ConexaoFactory.getConexao();
        try{
            Statement stmt = conn.createStatement();
            System.out.println(stmt.executeUpdate(sql));
            ConexaoFactory.close(conn, stmt);
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
