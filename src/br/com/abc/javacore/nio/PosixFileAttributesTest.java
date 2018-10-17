package br.com.abc.javacore.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributesTest {
    public static void main(String[] args) throws IOException {

        /* PARA USAR NO OS LINUX  */

        Path path = Paths.get("/home/josemalcher/dev/arquivo");

        PosixFileAttributes posix = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(posix.permissions());

        System.out.println("Alterando as permissões");
        Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rw-rw-rw-");
        Files.setPosixFilePermissions(path, permissions);

        posix = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(posix.permissions());


    }
}
