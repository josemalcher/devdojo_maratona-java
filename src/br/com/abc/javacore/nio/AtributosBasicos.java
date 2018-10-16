package br.com.abc.javacore.nio;

import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AtributosBasicos {
    public static void main(String[] args) throws IOException {

        Date primeiroDeDezembro = new GregorianCalendar(2017, Calendar.DECEMBER, 1).getTime();

        File file = new File("folder_nio_1\\arquivo.txt");
        file.createNewFile();
        file.setLastModified(primeiroDeDezembro.getTime());
        System.out.println(file.lastModified());
        file.delete();
        System.out.println("---------------------------------");
        Path path = Paths.get("folder_nio_1\\arquivo.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.fromMillis(primeiroDeDezembro.getTime());
        Files.setLastModifiedTime(path,fileTime);
        System.out.println(Files.getLastModifiedTime(path));
        Files.delete(path);
        System.out.println("---------------------------------");
        path = Paths.get("C:\\Users\\josemalcher\\Documents\\09-Workspaces\\devdojo-maratona-java\\src\\Teste.txt");
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isExecutable(path));
        System.out.println("---------------------------------");
        // BasicFileattributes, posixFileAttributes, DosFileAttributes
        BasicFileAttributes atributosBasicos = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("Create "+ atributosBasicos.creationTime());
        System.out.println("LastAcess "+ atributosBasicos.lastAccessTime());
        System.out.println("LastModified "+ atributosBasicos.lastModifiedTime());
        System.out.println(atributosBasicos.isDirectory());
        System.out.println(atributosBasicos.isSymbolicLink());
        System.out.println(atributosBasicos.isRegularFile());
        System.out.println("---------------------------------");
        // BasicFileAttributeView, PosixFileAttibuteView, DosFileAttributeView, FileOwnerAttributeView, AclFileAttributeView
        FileTime lastModified = atributosBasicos.lastModifiedTime();
        FileTime created = atributosBasicos.creationTime();
        FileTime lastAcess = FileTime.fromMillis(System.currentTimeMillis());

        BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        basicView.setTimes(lastModified, lastAcess, created);
        atributosBasicos = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("CREATE: " + atributosBasicos.creationTime());
        System.out.println("LAST ACESS: " + atributosBasicos.lastAccessTime());
        System.out.println("Last Modific: " + atributosBasicos.lastModifiedTime());


    }
}
