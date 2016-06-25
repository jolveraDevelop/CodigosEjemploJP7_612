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
public class MyAutoClose2 implements AutoCloseable{
    @Override
    public void close()throws Exception{
        System.out.println("close() en MyAutoClose2");
        throw new Exception("Lanzada desde MyAutoClose2");
    }
}
