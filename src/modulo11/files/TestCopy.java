package modulo11.files;

import static com.sun.org.apache.xml.internal.resolver.Catalog.URI;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class TestCopy {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Path p1 = Paths.get("home","foo","bar","index.html");
        Path p3 = Paths.get("home","foo","bar","index.html");
        Path p2 = Paths.get("home","foo","index.html");   
        Files.copy(p1,p2,StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.COPY_ATTRIBUTES);
        
        System.out.println("Files.isSameFile(p1, p2): "+Files.isSameFile(p1, p2));
        System.out.println("Files.isSameFile(p1, p3): "+Files.isSameFile(p1, p3));
        
        Path destino = Paths.get("home","foo","bar","google.html");
        Path destinoMovido = Paths.get("home","bar","googleMovido.html");
        
        URI u = new URI("https://www.google.com.mx/");
        try(InputStream in = u.toURL().openStream();){
            // copiamos el archvo a la ruta destino
            Files.copy(in, destino,StandardCopyOption.REPLACE_EXISTING);
            //despues movemos ese archivo
            Files.move(destino, destinoMovido, StandardCopyOption.REPLACE_EXISTING, 
                    StandardCopyOption.ATOMIC_MOVE);
        }
        
    }
}
