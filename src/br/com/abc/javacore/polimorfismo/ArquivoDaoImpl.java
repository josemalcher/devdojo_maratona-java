package br.com.abc.javacore.polimorfismo;

public class ArquivoDaoImpl implements GenericDAO {
    @Override
    public void save() {
        System.out.println("Salvando dados no arquivos");
    }
}
