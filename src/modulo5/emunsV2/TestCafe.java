/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo5.emunsV2;

/**
 *
 * @author Humberto
 */
public class TestCafe {

    public static void pedirCafe(Cafe cafe) {
        switch (cafe) {
            case CHICO:
                System.out.println("Sirviendo cafe Chico.");
                break;
            case MEDIANO:
                System.out.println("Sirviendo cafe Mediano.");
                break;
            case GRANDE:
                System.out.println("Sirviendo cafe Grande.");
                break;
            case EXTRA_GRANDE:
                System.out.println("Sirviendo cafe Extra Grande.");
        }
    }

    public static void main(String[] args) {
        pedirCafe(Cafe.GRANDE);
        pedirCafe(Cafe.MEDIANO);
        pedirCafe(Cafe.CHICO);
        pedirCafe(Cafe.EXTRA_GRANDE);
        
        System.out.println(Cafe.EXTRA_GRANDE);
        

        System.out.println("Mililitros del cafe Chico: " + Cafe.CHICO.getMililitros());
        System.out.println("Precio del cafe Mediano: " + Cafe.MEDIANO.getPrecio());

        Cafe cafeGrande = Cafe.GRANDE;
        System.out.println("Mililitros del cafe Grande: " + cafeGrande.getMililitros());
        System.out.println("Precio del cafe Grande: " + cafeGrande.getPrecio());

        Cafe[] cafes = Cafe.values();
        for (Cafe cafe : cafes) {
            System.out.println(cafe + " mililitros: " + cafe.getMililitros());
        }
    }
}
