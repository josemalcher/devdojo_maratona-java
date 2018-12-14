package br.com.abc.javacore.jdbc.testes;

        import br.com.abc.javacore.jdbc.classes.Comprador;
        import br.com.abc.javacore.jdbc.db.CompradorDB;


public class TesteConexao {
    public static void main(String[] args) {

        atualizar();

    }


    public static void inserir(){
        Comprador comprador = new Comprador("789.789.789-55", "Jose Junior ");
        CompradorDB.save(comprador);
    }
    public static void deletar(){
        Comprador comprador = new Comprador();
        comprador.setId(3);
        CompradorDB.delete(comprador);
    }
    public static void atualizar(){
        Comprador comprador = new Comprador(5,"MARIA SILVA ", "111.000.111-56");
        CompradorDB.update(comprador);
    }
}
