package br.com.abc.javacore.nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class FindAllTest extends SimpleFileVisitor<Path>{
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{java,class}");
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(matcher.matches(file)){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}
public class PathMatcherTest {
    public static void main(String[] args) throws IOException{
        Path path1 = Paths.get("folder_nio_1/subpasta/teste.bkp");
        Path path2 = Paths.get("teste.bkp");
        Path path3 = Paths.get("jose malcher");
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.bkp");
        System.out.println(matcher.matches(path1));
        System.out.println(matcher.matches(path2));
        System.out.println("-------------------");
        matches(path1,"glob:*.bkp");
        matches(path1,"glob:**/*.bkp");
        matches(path1,"glob:*");
        matches(path1,"glob:**");
        System.out.println("-------------------");
        matches(path1,"glob:*.???");
        matches(path1,"glob:**/*.???");
        matches(path1,"glob:**.???");
        System.out.println("-------------------");
        matches(path3,"glob:{jose*,malcher*}");
        matches(path3,"glob:{jose,malcher}*");
        matches(path3,"glob:{jose,malcher}");
        Files.walkFileTree(Paths.get("./"), new FindAllTest());
    }
    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob+": "+matcher.matches(path));

    }
}
