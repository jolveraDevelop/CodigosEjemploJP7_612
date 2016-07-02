/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo11.matcher;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 * @author Humberto Banuelos
 */
public class MyPathMatcher extends SimpleFileVisitor<Path> {

    private final PathMatcher matcher;

    public MyPathMatcher() {
        matcher = FileSystems.getDefault().getPathMatcher("glob:*html");
    }
    
    void find(Path file){
        Path name = file.getFileName();
        if(name != null && matcher.matches(name)){
            System.out.println(name);
        }
    }
    public FileVisitResult visitFile(Path file, BasicFileAttributes atr){
        find(file);
        return FileVisitResult.CONTINUE;
    }
    public static void main(String[] args)throws  IOException{
        MyPathMatcher obj = new MyPathMatcher();
        Files.walkFileTree(Paths.get("home/foo/"),obj);
    }
}
