package br.com.abc.javacore.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CriandoPathTest {
    public static void main(String[] args) {
        // C:\Users\josemalcher\Documents\09-Workspaces\devdojo-maratona-java\src\Teste.txt
        Path p1 = Paths.get("C:\\Users\\josemalcher\\Documents\\09-Workspaces\\devdojo-maratona-java\\src\\Teste.txt");
        Path p2 = Paths.get("C:\\Users\\josemalcher\\Documents\\09-Workspaces\\devdojo-maratona-java\\src","Teste.txt");
        Path p3 = Paths.get("C:","Users\\josemalcher\\Documents\\09-Workspaces\\devdojo-maratona-java\\src","Teste.txt");
        Path p4 = Paths.get("C:","Users","josemalcher","Documents\\09-Workspaces","devdojo-maratona-java\\src","Teste.txt");
    }
}
