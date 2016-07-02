
package modulo11.walk;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestMyFileVisitor {
    public static void main(String[] args) {
        try {
            Path dir = Paths.get("home");
            Path walkFileTree = 
                    Files.walkFileTree(dir, new MyFileVisitor());
            
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
