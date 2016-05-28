
package modulo6.interfaces;
 
/** 
 * 
  * @author Humberto 
  */ 
 public interface Event { 
     String x = "EVENT X";
     String getCategory(); 
 } 

// public interface Event { 
//     String getCategory(); 
// } 
  
  
 class CueSports { 
     
     public String x = "CueSports X";
     public String getCategory() {//line 8 
         return "Cue sports"; 
     } 
 } 
  
 class Snooker extends CueSports implements Event {//line 9 
  
     public static void main(String[] args) {//line 10 
         Event obj1 = new Snooker();//Line 11 
         CueSports obj2 = new Snooker();//line 12 
         System.out.println(obj1.getCategory() + "," + obj2.getCategory());//line 13 
     } 
      
      public String getCategory() { 
         return "Snooker sports"; 
     } 
 } 