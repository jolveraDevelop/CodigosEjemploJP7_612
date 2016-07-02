
package modulo11.channels;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;

public class TestSeekableByteChannel {
    public static void main(String[] args) {
         try (SeekableByteChannel fcIn =
                 new FileInputStream("home/foo/bar/file1.txt").getChannel();
                FileChannel fcOut = 
                        new FileOutputStream("home/foo/bar/file2.txt").getChannel()) {
            
            System.out.println("fcIn.size(): "+fcIn.size());
            ByteBuffer buff = ByteBuffer.allocate((int) fcIn.size());
            fcIn.read(buff);
            System.out.println(buff.position()); // posición del buffer
            //fcOut.write(buff); // hay que recorrer el cursor del buffer
            buff.position(10); // lo posiciona en el número 10
            System.out.println(buff.position());//número de posición en el buffer
            fcOut.write(buff); // escribe los bytes
            fcOut.truncate(10); // después de 10 caracteres no guarda nada
          
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
