
package modulo7.collecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Roberto Olveras
 */
public class TestArrayListGenerico {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        int x = 3;
        lista.add(x);
        lista.add(6);
        lista.add(7);
        //lista.add("da");
        int result =0 ;
        for (Integer valor : lista) {
            result += valor;
        }
        System.out.println("La suma total es: "+result);
        
        Iterator<Integer> iterator = lista.iterator();
        result = 0;
        while (iterator.hasNext()){
           result +=  iterator.next();
        }
        System.out.println("La suma total con iterator es: "+result);
        
    }
}
