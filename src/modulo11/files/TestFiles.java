
package modulo11.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestFiles {
    public static void main(String[] args) throws IOException {
       Path p = Paths.get("home", "bar");
       Path p3 = Paths.get("home", "bar","com");
       System.out.println("Files.exists(p): "+Files.exists(p));
       System.out.println("Files.notExists(p): "+Files.notExists(p));
       //creamos solo un directorio
       //Files.createDirectory(p);
       // creamos una ruta completa
       
       //System.out.println("creamos a p3");
       System.out.println("Files.exists(p3): "+Files.exists(p3));
       
       Files.delete(p3);
       
       if(Files.exists(p3)){
           //Files.delete(p3);
       }else{
          //Files.createDirectories(p3);
       }
       
       Path acceso = Paths.get("D:" , "accesoPDF");
       Path file = Paths.get("D:" , "archivoPDF.pdf");
       
       System.out.println("Files.exists(acceso): "+Files.exists(acceso));
       System.out.println("Files.notExists(acceso): "+Files.notExists(acceso));
       System.out.println("Files.exists(acceso): "+Files.exists(acceso,LinkOption.NOFOLLOW_LINKS));
       System.out.println("Files.notExists(acceso): "+Files.notExists(acceso,LinkOption.NOFOLLOW_LINKS));
       
       System.out.println("Files.isExecutable(file):"
               +Files.isExecutable(file));
       System.out.println("Files.isReadable(file):"
               +Files.isReadable(file));
       System.out.println("Files.isWritable(file):"
               +Files.isWritable(file));
       System.out.println("Files.isSymbolicLink(file):"
               +Files.isSymbolicLink(file));
       System.out.println("Files.isSymbolicLink(acceso):"
               +Files.isSymbolicLink(acceso));
    
    }
}
