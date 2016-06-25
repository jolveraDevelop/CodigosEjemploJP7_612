/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo9.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Guest
 */
public class TestChekedException3 {
    public static void main(String[] args) throws Exception {
        recuperarInformacion(3);
    }
    
    public static void recuperarInformacion(int fuente)/*throws Exception*/{
        System.out.println("Intentando abrir un archvo");
        try{
            if(fuente == 1){
                 FileInputStream fis = new FileInputStream("archivo.txt");
            }else if(fuente == 2){
                Connection conn = DriverManager.getConnection("");
            }else {
                throw new IllegalArgumentException(
                        "No se envio el parametro correcto: "+fuente);
            }
        }
//        catch(Exception e){
//            System.out.println("Error : "+e.getMessage());
//            System.out.println("Tipo de exception : "+e.getClass().getName());
//        }
        catch(FileNotFoundException | SQLException  e){
            System.out.println("Error : "+e.getMessage());
        }
//        catch(FileNotFoundException e){
//            System.out.println("Error : "+e.getMessage());
//        }
//        catch(SQLException e){
//            System.out.println("Error : "+e.getMessage());
//        }
//        catch(Exception e){
//            System.out.println("Error : "+e.getMessage());
//        }
    }
}
