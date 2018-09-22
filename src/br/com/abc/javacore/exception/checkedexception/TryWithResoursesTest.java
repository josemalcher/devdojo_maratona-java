package br.com.abc.javacore.exception.checkedexception;

import java.io.*;

public class TryWithResoursesTest {
    public static void main(String[] args) {

        leitorTeste();

        /*
           Fechando leitor 2
           Fechando Leitor 1
       */

    }
    public static void lerArquivoAntigo(){
        Reader reader = null;
        try{
            reader = new BufferedReader(new FileReader("testeCheckedException.txt"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            try {
                if(reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void lerArquivoAtual(){
        try(Reader reader = new BufferedReader(new FileReader("testeCheckedException.txt"))){

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leitorTeste(){
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
