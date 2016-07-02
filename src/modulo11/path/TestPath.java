package modulo11.path;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestPath {
    public static void main(String[] args) {
        Path p = Paths.get("home");
        Path p2 = Paths.get("home","foo","bar","file1.txt");
        
        //Path p3 = new Path();
        
        for (Path aux : p2) {
//            System.out.println(aux);
//            System.out.println(aux.toAbsolutePath());
        }
        //FileSystem hdh = new FileSystem();
        
        FileSystem fs = FileSystems.getDefault();
        Path p3 = fs.getPath("D:\\home\\foo\\..\\bar\\.\\file.txt");
        System.out.println("p3: "+p3);
        System.out.println("p3.getFileName(): "+p3.getFileName());
        System.out.println("p3.getParent(): "+p3.getParent());
        System.out.println("p3.getRoot(): "+p3.getRoot());
        System.out.println("p3.getNameCount(): "+p3.getNameCount());
        System.out.println("p3.isAbsolute(): "+p3.isAbsolute());
        System.out.println("p3.toUri(): "+p3.toUri());
        
        // normalizando path
        p3 = p3.normalize();
        // recordar que normalize no afecta el objeto origen
        System.out.println("p3.normalize(): "+p3);
        //System.out.println("p3: "+p3);
        
        System.out.println("p3.getName(0): "+p3.getName(0));
        System.out.println("p3.getName(1): "+p3.getName(1));
        //System.out.println("p3.getName(40): "+p3.getName(40));
        System.out.println("p3.subpath(0, 1): "+p3.subpath(0, 1));       
        System.out.println("p3.subpath(0, 2): "+p3.subpath(0, 2));   
        
        Path absolute = Paths.get("\\home","java");
        Path relative = Paths.get("dir");
        Path file = Paths.get("MyFile.txt");
        System.out.println("absolute.resolve(relative): "
                                    +absolute.resolve(relative));
        System.out.println("absolute.resolve(file): "
                                    +absolute.resolve(file));
        System.out.println("relative.resolve(file): "
                                    +relative.resolve(file));
        
        System.out.println("relative.resolve(absolute): "
                                    +relative.resolve(absolute));
        
        System.out.println("file.resolve(absolute): "
                                    +file.resolve(absolute));
        
        System.out.println("file.resolve(relative): "
                                    +file.resolve(relative));
        
        // llegando a un PATH
        // como condicion debe tener el mismo root
        Path origen = Paths.get("\\home","java","src","MyFile.java");
        Path destino = Paths.get("\\home","java","biuld","MyFile.class");
        System.out.println("origen: "+origen);
        System.out.println("destino: "+destino);
        System.out.println("origen.relativize(destino): "
                +origen.relativize(destino));
        System.out.println("origen.startsWith(\"home\"): "
                                   +(origen.startsWith("home")));
        System.out.println("origen.startsWith(\"\\home\"): "
                                   +(origen.startsWith("\\home")));
        
        System.out.println("origen.endsWith(\"java\"): "+
                (origen.endsWith("java")));
        System.out.println("origen.toString().endsWith(\"java\"): "+
                (origen.toString().endsWith("java")));
        System.out.println("origen.endsWith(\"MyFile.java\"): "+
                (origen.endsWith("MyFile.java")));
        
        Path file1 = Paths.get("D:", "archivoPDF.pdf");
        Path file2 = Paths.get("C:", "archivo");
        
        try {
            Files.createSymbolicLink(file2, file1);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
        
    }
}
