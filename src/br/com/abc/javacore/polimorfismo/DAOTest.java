package br.com.abc.javacore.polimorfismo;

public class DAOTest {
    public static void main(String[] args) {
        //GenericDAO dao = new ArquivoDaoImpl();
        GenericDAO dao = new DataBaseDAOImpl();
        dao.save();

    }
}
