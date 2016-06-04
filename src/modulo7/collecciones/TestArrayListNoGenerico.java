
package modulo7.collecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roberto Olveras
 */
public class TestArrayListNoGenerico {
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add(3);
        lista.add(6);
        lista.add(7);
        //lista.add("da");
        int result =0 ;
        for (Object valor : lista) {
            result += (Integer)valor;
        }
        System.out.println("La suma total es: "+result);
    }
}
