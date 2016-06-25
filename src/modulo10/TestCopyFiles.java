/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Guest
 */
public class TestCopyFiles {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("file1.txt");
                FileOutputStream fos = new FileOutputStream("file2.txt");){
            
            byte [] buffer = new byte [128]; 
            int buff = fis.read(buffer);
            //System.out.println("Byte avalivles: "+fis.available());
            while(buff!=-1){
                System.out.println("Byte avalivles: "+fis.available());
                fos.write(buffer);
                //fos.write(buff);
                buff = fis.read(buffer);
                //buff = fis.read(buff);
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
        
        try(FileReader fis = new FileReader("file1.txt");
                FileWriter fos = new FileWriter("file3.txt");){
            
            char [] buffer = new char [128]; 
            int buff = fis.read(buffer);
            //System.out.println("Byte avalivles: "+fis.available());
            while(buff!=-1){
                fos.write(buffer);
                //fos.write(buff);
                buff = fis.read(buffer);
                //buff = fis.read(buff);
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
