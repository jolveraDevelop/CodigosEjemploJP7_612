/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo9.exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guest
 */
public class TestFinally {
    public static void main(String[] args) {
        System.out.println("hacerAlgo(): "+hacerAlgo());
    }
    
    static int hacerAlgo(){
        try {
            if(1==2){
                return 1;
            }
            throw new Exception();
        } catch (Exception ex) {
            return 2;
        }
        finally {
            return 3;
        }
        
    }
}
