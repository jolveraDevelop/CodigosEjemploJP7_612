
package modulo7.collecciones;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Roberto Olveras
 */
public class TestTreeSet {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("uno");
        System.out.println(set);
        set.add("dos");
        System.out.println(set);
        set.add("tres");
        System.out.println(set);
        set.add("cuatro");
        System.out.println(set);
        set.add("uno");// descarta el elemento duplicado
        System.out.println(set);
        
        for (String elem : set) {
            System.out.println(elem);
        }
        
        
        
    }
}
