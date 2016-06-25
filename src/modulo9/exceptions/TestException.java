/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo9.exceptions;

/**
 *
 * @author Guest
 */
public class TestException {
    public static void main(String[] args) {
        try{
          hacerAlgo();  
        }catch(ArithmeticException e){
            System.out.println("ocurrio un error y se capturo en main: "+e.getMessage());
            //e.printStackTrace();
        }  
    }
    
    public static void hacerAlgo(){
        hacerAlgoMas();
    }
    
    public static void hacerAlgoMas(){
        System.out.println("intentando hacer una division");
        try{
            System.out.println("20 / 0 = "+(20/0));
            //System.out.println("20 / 1 = "+(20/1));
        }catch(ArithmeticException e){
            System.out.println("ocurrio un error y es"
                    + " capturado en hacerAlgoMas; "+e.getMessage());
        }
        System.out.println("division finalizada");
    }
}
