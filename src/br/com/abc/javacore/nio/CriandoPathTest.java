package br.com.abc.javacore.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CriandoPathTest {
    public static void main(String[] args) {
        // C:\Users\josemalcher\Documents\09-Workspaces\devdojo-maratona-java\src\Teste.txt
        Path p1 = Paths.get("C:\\Users\\josemalcher\\Documents\\09-Workspaces\\devdojo-maratona-java\\src\\Teste.txt");
        Path p2 = Paths.get("C:\\Users\\josemalcher\\Documents\\09-Workspaces\\devdojo-maratona-java\\src","Teste.txt");
        Path p3 = Paths.get("C:","Users\\josemalcher\\Documents\\09-Workspaces\\devdojo-maratona-java\\src","Teste.txt");
        Path p4 = Paths.get("C:","Users","josemalcher","Documents\\09-Workspaces","devdojo-maratona-java\\src","Teste.txt");

        System.out.println(p4.toAbsolutePath());
        File file = p4.toFile();
        Path path = file.toPath();

        Path path1 = Paths.get("pasta_nio");
        Path path2 = Paths.get(  "pasta_nio\\subpasta\\subsubPasta\\");
        Path arquivo = Paths.get("pasta_nio\\subpasta\\subsubPasta\\file_nio.txt");

        try {
//            if(Files.notExists(path1)){
//                Files.createDirectory(path1);
//            }
            if(Files.notExists(path2.getParent())){
                Files.createDirectories(path2.getParent());
            }
            if(Files.notExists(arquivo)){
                Files.createFile(arquivo);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        Path source = Paths.get("folder2\\arquivo_renomeado.txt");
        Path target = Paths.get(path2.toString()+"\\arquivo_copiado.txt");
        try{
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            //Files.delete(target);
        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
