
package modulo8.tokenizer;

import java.util.StringTokenizer;

/**
 *
 * @author Roberto Olveras
 */
public class TestTokenizer {
    public static void main(String[] args) {
        String saludo = "Hola,Mundo, Java, No, Se, Duerman;";
        StringTokenizer st = new StringTokenizer(saludo, ", ");
        System.out.println("Tokens");
        
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }
    }
}
