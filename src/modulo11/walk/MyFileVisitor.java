package modulo11.walk;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor implements FileVisitor<Path>{

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("preVisitDirectory: "+dir);
        if(dir.toString().endsWith("xxx")){
            return FileVisitResult.SKIP_SUBTREE;
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("visitFile: "+file);
        if(file.getFileName().toString().equals("MyClass.java")){
            return FileVisitResult.SKIP_SIBLINGS;
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("visitFileFailed: "+file);
        exc.printStackTrace();
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("postVisitDirectory: "+dir);
        return FileVisitResult.CONTINUE;
    }
    
}
