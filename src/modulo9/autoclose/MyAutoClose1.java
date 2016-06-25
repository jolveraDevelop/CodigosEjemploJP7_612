/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo9.autoclose;

import java.io.IOException;

/**
 *
 * @author Guest
 */
public class MyAutoClose1 implements AutoCloseable{

    public void metodo(){
        System.out.println("metodo() en MyAutoClose1");
    }
    
    @Override
    public void close()throws IOException{
        System.out.println("close() en MyAutoClose1");
        throw new IOException("Lanzada desde MyAutoClose1");
    }
    
}
