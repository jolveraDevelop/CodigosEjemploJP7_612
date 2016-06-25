/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 *
 * @author Zeidy-pc
 */
public class TestChannel {
    public static void main(String[] args) {
        try(FileChannel in = new FileInputStream("file1.txt").getChannel();
                FileChannel out = new FileOutputStream("file2.txt").getChannel();){
            //creamos un bufer del tamano del archivo origen
            ByteBuffer buff = ByteBuffer.allocate((int)in.size());            
            System.out.println("in.size(): "+in.size());
            System.out.println("buff.position() antes de leer: "+buff.position());
            in.read(buff);
            System.out.println("buff.position() despues de leer: "+buff.position());
            buff.position(0);
            out.write(buff);
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
