/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moduo9.asserts;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guest
 */
public class TestAserts {
    public static void main(String[] args)  {
        FileWriter fr = null;
        try {
            String[] values = {"SE","me","EE"};
            System.out.println("result: "+metodo(0));
            fr = new FileWriter("ddsd");
//        for (String val : values) {
//            switch (val) {
//                case "SE":
//                    System.out.println("Version de Java Estandar");
//                break;
//                case "ME":
//                    System.out.println("Version de Java Mobil");
//                break;
//                case "EE":
//                    System.out.println("Version de Java Empresarial");
//                break;
//                default:
//                    assert false : "No es un valor valido." ;
//            }
//        }
        } catch (IOException | FileNotFoundException ex) {
            Logger.getLogger(TestAserts.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(TestAserts.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private static int metodo(int x){
        try{
            assert x!=0;
        }catch(AssertionError e){
            System.out.println("no puedes dividir entre cero");
            throw e;
        } 
        return 4/x;
    }
    
}
