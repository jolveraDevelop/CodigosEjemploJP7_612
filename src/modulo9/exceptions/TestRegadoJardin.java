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
public class TestRegadoJardin {
    
    static Boolean llaveAbierta = true;
   
    public static void main(String[] args) {
        try {
            regar();
        } catch (Exception ex) {
            System.out.println("La mangera se rompio");
        } finally {
            cerrarLlave();
        }       
    }
    
    static void regar()throws Exception{
        while(llaveAbierta){
            System.out.println("regando");
        }
    }
    
    static void cerrarLlave(){
        llaveAbierta = false;
    }
}
