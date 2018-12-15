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
               return  DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection connection){
        try{
            if(connection != null){
                connection.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void close(Connection connection, Statement stm){
        close(connection);
        try{
            if(stm != null){
                stm.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void close(Connection connection, Statement stm, ResultSet rs){
        close(connection, stm);
        try{
            if(rs != null){
                rs.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }


}
