package br.com.abc.javacore.jdbc.conn;

import java.sql.*;

public class ConexaoFactory {
    //java.sql = Connection, Statement, ResultSet
    //DriverManager
    public static Connection getConexao() {
        String url = "jdbc:mysql://localhost:3306/devdojo_agencia?useTimezone=true&serverTimezone=UTC";
        //String url = "jdbc:mysql://localhost:3306/devdojo_agencia?useSSL=false";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println(connection);
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
