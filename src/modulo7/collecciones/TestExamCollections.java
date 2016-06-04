
package modulo7.collecciones;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Roberto Olveras
 */
public class TestExamCollections {
    public static void main(String[] args) {
         Set<String> set = new TreeSet<>(); 
         set.add("X"); 
         set.add("Y"); 
         set.add("X"); 
         set.add("Y"); 
         set.add("X"); 
         Iterator<String> it = set.iterator(); 
         int count = 0; 
         while (it.hasNext()) { 
             switch (it.next()) { 
                 case "X": 
                     System.out.print("X "); 
                     break; 
                 case "Y": 
                     System.out.print("Y "); 
                     break; 
             } 
             count++; 
         } 
         System.out.println("\ncount = " + count); 
        
    }
}
