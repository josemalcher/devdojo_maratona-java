package br.com.abc.javacore.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvendoPaths {
    public static void main(String[] args) {
        Path dir = Paths.get("home\\josemalcher");
        Path arquivo = Paths.get("dev\\arquivo.txt");
        Path result = dir.resolve(arquivo);
        System.out.println(result);

        System.out.println("-----------------------------");

        Path absoluto = Paths.get("home/josemalcher");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");

        System.out.println("1: " + absoluto.resolve(relativo));
        System.out.println("2: " + absoluto.resolve(file));
        System.out.println("3: " + relativo.resolve(file));
        System.out.println("4: " + relativo.resolve(absoluto));
        System.out.println("5: " + file.resolve(absoluto));
        System.out.println("6: " + file.resolve(relativo));
    }
}
