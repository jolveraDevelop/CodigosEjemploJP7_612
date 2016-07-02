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
public class FindTest extends SimpleFileVisitor<Path> {

    private PathMatcher matcher
            = FileSystems.getDefault().getPathMatcher(
                    "glob:**/??r/*.html"); 

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException {
        if (matcher.matches(file)) {
            System.out.println(file);
        }
        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) throws Exception {
        FindTest dirs = new FindTest();
        Files.walkFileTree(Paths.get("home"), dirs); // start with root
    }
}
