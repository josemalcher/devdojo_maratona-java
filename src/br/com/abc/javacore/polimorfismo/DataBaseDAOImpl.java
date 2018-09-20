package br.com.abc.javacore.polimorfismo;

public class DataBaseDAOImpl implements GenericDAO {
    @Override
    public void save() {
        System.out.println("Salvando dados no BANCO DE DADOS");
    }
}
