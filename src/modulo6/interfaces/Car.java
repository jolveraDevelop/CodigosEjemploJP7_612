
package modulo6.interfaces;
 
/** 
 * 
  * @author Humberto 
  */ 
 interface TurboVehicle { 
 } 
  
 interface Steerable { 
  
     class A { 
  
         public String metodo() { 
             return "method 1"; 
         } 
     } 
 } 
  
 interface Convertible { 
     public void quitarCapote();
 } 
  
 public class Car implements TurboVehicle, Steerable { 
  
     class A { 
  
         public String metodo() { 
             return "method 2"; 
         } 
     } 
 } 
  
  class SportCars extends Car implements Convertible { 
  
     public static void main(String[] args) { 
         TurboVehicle c1 = new SportCars();
         TurboVehicle tvs = new TurboVehicle();
         Steerable c2 = new SportCars();
         Convertible c3 = new SportCars();
         c3.quitarCapote();
         if(c3 instanceof SportCars){
            ((SportCars)c3).acelera(); 
         }
         
         Steerable.A a = new Steerable.A(); 
         System.out.println(a.metodo()); 
         Car cars = new Car(); 
         Car.A a1 = cars.new A(); 
         System.out.println(a1.metodo()); 
     } 
     
     public void acelera(){
          System.out.println("acelera");
     }

    @Override
    public void quitarCapote() {
        System.out.println("quitar capote");
    }
     
 } 

