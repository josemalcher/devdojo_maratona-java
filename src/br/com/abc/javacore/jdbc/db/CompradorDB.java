package br.com.abc.javacore.jdbc.db;

import br.com.abc.javacore.jdbc.classes.Comprador;
import br.com.abc.javacore.jdbc.conn.ConexaoFactory;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CompradorDB {
    public static void save(Comprador comprador) {
        String sql = "INSERT INTO `devdojo_agencia`.`comprador` (`cpf`,`nome`) VALUES ('" + comprador.getCpf() + "' , '" + comprador.getNome() + "')";
        System.out.println(sql);
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro inserido com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possível excluir o registro");
            return;
        }
        String sql = "DELETE FROM `devdojo_agencia`.`comprador` WHERE `id` = '" + comprador.getId() + "'";
        System.out.println(sql);
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro excluído com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possivel atualizar o registro");
            return;
        }
        String sql = "UPDATE `devdojo_agencia`.`comprador` SET `cpf`= '" + comprador.getCpf() + "', `nome`='" + comprador.getNome() + "' WHERE `id`= '" + comprador.getId() + "'";
        System.out.println(sql);
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro atualizado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Comprador> selectALL() {

        String sql = "SELECT * FROM comprador";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            List<Comprador> compradorList = new ArrayList<>();
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
            }
            ConexaoFactory.close(conn, stmt, rs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Comprador> selectByName(String nome) {

        String sql = "SELECT * FROM comprador WHERE nome LIKE '%"+nome+"%'";
        System.out.println(sql);
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            List<Comprador> compradorList = new ArrayList<>();
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
            }
            ConexaoFactory.close(conn, stmt, rs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}
