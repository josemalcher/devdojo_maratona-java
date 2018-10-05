package br.com.abc.javacore.io.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTeste {
    public static void main(String[] args) {
        File file = new File("fileWriteReader.txt");

        try (FileWriter fw = new FileWriter(file);
             FileReader fr = new FileReader(file)){

            fw.write("\nEscrevendo uma mensagem no arquivo\nPulando Lina");
            fw.flush();


            char[] in = new char[500];
            int size = fr.read(in);
            System.out.println("Tamanho do arquivo: "+ size);

            for (char c : in){
                System.out.print(c);
            }

            fr.close();


        }catch (IOException e){
            e.printStackTrace();
        }

        /*try {
            //FileWriter fw = new FileWriter(file, true); // true = append char
            fw.write("\nEscrevendo uma mensagem no arquivo\nPulando Lina");
            fw.flush();
            fw.close();

            FileReader fr = new FileReader(file);
            char[] in = new char[500];
            int size = fr.read(in);
            System.out.println("Tamanho do arquivo: "+ size);

            for (char c : in){
                System.out.print(c);
            }

            fr.close();


        }catch (IOException e){
            e.printStackTrace();
        }*/
    }
}
