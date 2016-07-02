
package modulo11.attr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestAtributes {
    public static void main(String[] args) {
        Path p1 =
                Paths.get("home","foo","bar","PdfDocument.pdf");
        
        try {
            DosFileAttributes attrFiles = 
                    Files.readAttributes(p1,
                            DosFileAttributes.class);
            System.out.println(p1);
            System.out.println("attrFiles.creationTime(): "+
                    attrFiles.creationTime());
            
            System.out.println("attrFiles.lastAccessTime(): "+
                    attrFiles.lastAccessTime());
            
            System.out.println("attrFiles.lastModifiedTime(): "+
                    attrFiles.lastModifiedTime());
            
            System.out.println("attrFiles.isDirectory(): "+
                    attrFiles.isDirectory());
            
            DosFileAttributeView attrWrite =
                    Files.getFileAttributeView(p1,DosFileAttributeView.class);
            
            FileTime now = 
                    FileTime.fromMillis(System.currentTimeMillis());
            attrWrite.setTimes(attrFiles.lastModifiedTime(),
                    now,attrFiles.creationTime() );
            
            attrFiles = 
                    Files.readAttributes(p1,
                            DosFileAttributes.class);
            System.out.println("*****************");
            System.out.println(p1);
            System.out.println("attrFiles.creationTime(): "+
                    attrFiles.creationTime());
            
            System.out.println("attrFiles.lastAccessTime(): "+
                    attrFiles.lastAccessTime());
            
            System.out.println("attrFiles.lastModifiedTime(): "+
                    attrFiles.lastModifiedTime());
            
            System.out.println("attrFiles.isDirectory(): "+
                    attrFiles.isDirectory());
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
