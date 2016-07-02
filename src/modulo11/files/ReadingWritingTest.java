/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo11.files;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import static java.nio.file.StandardOpenOption.*;
import java.util.List;

/**
 *
 * @author Humberto Banuelos
 */
public class ReadingWritingTest {

    public static void main(String[] args) throws IOException {
        Path source = Paths.get("home/foo/bar/TextFile.txt");
        Path file = Paths.get("home/foo/bar/TextFileCopy.txt");
        List<String> lines;
        Charset cs = Charset.forName("UTF-8");
        Charset cs2 = Charset.forName("Windows-1250");
        lines = Files.readAllLines(source,cs);
        for (String line : lines) {
            System.out.println(line);
        }
        
        Files.write(file, lines, cs2, StandardOpenOption.APPEND,
                StandardOpenOption.CREATE);
    }
}
    