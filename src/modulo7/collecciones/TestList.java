
package modulo7.collecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import modulo6.composite.BasicCar;

/**
 *
 * @author Roberto Olveras
 */
public class TestList {
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("Java");
        lista.add(123);
        lista.add(new BasicCar());
        System.out.println(lista);
        System.out.println("contains Mundo ? "+lista.contains("Mundo"));
        System.out.println("elemento en pos 2: ? "+lista.get(2));
        System.out.println("index of Java: ? "+lista.indexOf("Java"));
        System.out.println("sublist [1,3]: ? "+lista.subList(1,2));
        System.out.println("lista.isEmpty() ? "+lista.isEmpty());
        System.out.println("lista.set(2, \"Jajajaja\")? "+lista.set(2, "Jajajaja"));
        
        System.out.println(lista);
        
        Collections.sort(lista);
        System.out.println("lista ordenada");
        System.out.println(lista);
        
    }
}
