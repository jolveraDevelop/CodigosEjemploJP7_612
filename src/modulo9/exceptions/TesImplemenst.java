/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo9.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author Guest
 */
public class TesImplemenst {
    
}

interface AA {
    void metodo();
    void metodo2() throws Exception ;
}

class BB implements AA{
    public void metodo() throws RuntimeException {
       
    }

    @Override
    public void metodo2() throws Exception {
        FileInputStream fis = new FileInputStream("");
    }
}
