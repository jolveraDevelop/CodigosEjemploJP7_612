
package modulo11.files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestList {
    public static void main(String[] args) {
        Path dir = Paths.get("home","foo");
        try(DirectoryStream<Path> stream = 
                Files.newDirectoryStream(dir,"*{java,html}");){
            for (Path p : stream) {
                System.out.println(p.getFileName());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
   
}
