
package modulo11.watch;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;


public class WatchFileTest {

    public static void main(String[] args) throws IOException {
        
        Path dir = Paths.get("home");
        
        WatchService watcher = 
                FileSystems.getDefault().newWatchService(); // create empty watch service
        
        dir.register(watcher, ENTRY_DELETE, ENTRY_CREATE); 
       
        while (true) {
            WatchKey key;
            try {
                key = watcher.take(); 
            } catch (InterruptedException x) {
                x.printStackTrace();
                return; 
            }
            for (WatchEvent<?> event : key.pollEvents()) {
                WatchEvent.Kind<?> kind = event.kind();
                System.out.println("***************");
                System.out.println(kind.name()); 
                System.out.println(kind.type()); 
                System.out.println(event.context()); 
                
            }
            key.reset(); 
        }
    }
}
