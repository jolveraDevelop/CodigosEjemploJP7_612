/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo5.enumsV1;

/**
 *
 * @author Humberto
 */
public class TestCafe {
    
    public static void pedirCafe(int tamano) {
        switch (tamano) {
            case Cafe.CHICO:
                System.out.println("Sirviendo cafe Chico.");
                break;
            case Cafe.MEDIANO:
                System.out.println("Sirviendo cafe Mediano.");
                break;
            case Cafe.GRANDE:
                System.out.println("Sirviendo cafe Grande.");
                break;
            default:
                System.out.println("Opcion incorrecta.");
        }
    }
    
    public static void main(String[] args) {
        pedirCafe(Cafe.GRANDE);
        pedirCafe(Cafe.MEDIANO);
        pedirCafe(1);
        pedirCafe(5);
    }
}
