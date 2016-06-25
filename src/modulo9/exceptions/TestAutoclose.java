/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo9.exceptions;

import modulo9.autoclose.MyAutoClose1;
import modulo9.autoclose.MyAutoClose2;

/**
 *
 * @author Guest
 */
public class TestAutoclose {
    public static void main(String[] args) {
        try (MyAutoClose1 obj1 = new MyAutoClose1();
                MyAutoClose2 obj2 = new MyAutoClose2();){
            System.out.println("en el try");
            obj1.metodo();
            //if(1==1)throw new Exception("Lanzada desde main");
            System.out.println("fin del try");
        }catch (Exception ex) {
            Throwable[] suppressed = ex.getSuppressed();
            for (Throwable sup : suppressed) {
                System.out.println("Tipo de Exception: "+sup.getClass().getName());
                System.out.println("Mensaje de Exception: "+sup.getMessage());
            }
            System.out.println("Exception en el catch: "+ex.getMessage());
        }finally{
            System.out.println("en el finally");
        }
        
        
        
//        FileInputStream fis = null;
//        try {
//            System.out.println("Abriendo el archivo");
//            fis = new FileInputStream("archivo.txt");
//            System.out.println("Operaciones");
//            if(1==1){throw new RuntimeException();}
//            System.out.println("Cerrar el archivo");
//            fis.close();
//        } catch ( IOException ex) {
//            
//        }finally{
//            try {
//                fis.close();
//            } catch (IOException ex) {
//                
//            }
//        }
    }
}
