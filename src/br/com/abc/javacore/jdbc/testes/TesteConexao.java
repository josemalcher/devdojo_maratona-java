package br.com.abc.javacore.jdbc.testes;

        import br.com.abc.javacore.jdbc.classes.Comprador;
        import br.com.abc.javacore.jdbc.db.CompradorDB;

        import java.util.List;


public class TesteConexao {
    public static void main(String[] args) {

        //List<Comprador> listaComprador =  selecionarTudo();
        List<Comprador> listaComprador1 =  buscarPorNome("SIL");
        //System.out.println(listaComprador);
        System.out.println(listaComprador1);

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
        Comprador comprador = new Comprador(5,"111.000.111-56 ", "MARIA SILVA");
        CompradorDB.update(comprador);
    }
    public static List<Comprador> selecionarTudo(){
        return CompradorDB.selectALL();
    }
    public static List<Comprador> buscarPorNome(String nome){
        return CompradorDB.selectByName(nome);
    }


}
