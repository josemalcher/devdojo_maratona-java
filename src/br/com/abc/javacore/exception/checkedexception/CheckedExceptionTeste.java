package br.com.abc.javacore.exception.checkedexception;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTeste {
    public static void main(String[] args) {
        try{
            criarArquivo();

        }catch (IOException e ){
            e.printStackTrace();
        }
    }

    private static void criarArquivo() throws IOException {
        /*File file = new File("testeCheckedException.txt");
        try {
            file.createNewFile();
            System.out.println("Arquivo Criado");
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // Relançar a exception ex1
        /*
        File file = new File("testeCheckedException.txt");
        file.createNewFile();
        System.out.println("Arquivo Criado");
        */

        // Relançar a exception ex2
        File file = new File("testeCheckedException.txt");
        try{
            file.createNewFile();
            System.out.println("Arquivo Criado");

        }catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }
    public static String abrirArquivo(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Executando o aquivo e leitura");
            //throw new Exception();
            return "valor";
        }catch (Exception e){
            System.out.println("Dentro do catch");
            e.printStackTrace();
        }finally {// bloco sempre será executado
            System.out.println("Fechar o arquivo");
        }
        return null;
    }
}
