package br.com.abc.javacore.io.test;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        File file =  new File("io_File.txt");
        try {
            System.out.println(file.createNewFile());

            boolean exists = file.exists();
            System.out.println("Permissão de leitura " + file.canRead());
            System.out.println("PATH " + file.getPath());
            System.out.println("PATH " + file.getAbsolutePath());
            System.out.println("Diretório " + file.isDirectory());
            System.out.println("Hidden? " + file.isHidden());
            System.out.println("Ultima modificação " + file.lastModified());
            if(exists){
                System.out.println("DELETADO? " + file.delete());
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
