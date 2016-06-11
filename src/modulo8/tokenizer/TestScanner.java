
package modulo8.tokenizer;

import java.util.Scanner;

/**
 *
 * @author Roberto Olveras
 */
public class TestScanner {
    public static void main(String[] args) {
        String saludo = "Hola,Mundo,Java";
        Scanner s = new Scanner(saludo);
        s.useDelimiter(", ");
        while(s.hasNext()){
            System.out.println(s.next());
        }
        
//        String precios = "3.5, 2.5, hola, 9";
//        Scanner sPrecios = new Scanner(precios);
//        sPrecios.useDelimiter(", ");
//        float result = 0;
//        // manda un error porque no puede convertir hola a flotante
//        while(sPrecios.hasNextFloat() || sPrecios.hasNext()){
//            result += sPrecios.nextFloat();
//        }
//        System.out.println("result: "+result);
    }
}
