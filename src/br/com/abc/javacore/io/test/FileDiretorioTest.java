package br.com.abc.javacore.io.test;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {
    public static void main(String[] args) throws IOException {
/*

        File diretorio = new File("io_folder");
        boolean mkdir = diretorio.mkdir();
        System.out.println("Diretório CRIADO "+ mkdir);

        File arquivo = new File(diretorio, "arquivo.txt");
        boolean newFile = arquivo.createNewFile();
        System.out.println("Arquivo criado " + newFile);

        File arquivoNovoNome = new File(diretorio, "arquivo_renomeado.txt");
        boolean renammed = arquivo.renameTo(arquivoNovoNome);
        System.out.println("RENOMEADO " + renammed);


        File diretorioRenomeado = new File("folder2");
        boolean diretorioReno = diretorio.renameTo(diretorioRenomeado);
        System.out.println("Diretorio Renomeado" + diretorioReno);
*/

        buscarArquivos();

    }

    public static void buscarArquivos(){
        File file = new File("C:\\Users\\josemalcher\\Documents\\09-Workspaces\\devdojo-maratona-java\\folder2");
        String[] list = file.list();
        for(String arquivo : list){
            System.out.println(arquivo);
        }
    }
}
