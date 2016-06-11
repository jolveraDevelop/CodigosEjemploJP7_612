
package modulo8.tokenizer;

/**
 *
 * @author Roberto Olveras
 */
public class TestSplit {
    public static void main(String[] args) {
        String saludo = "Hola,Mundo,Java";
        String[] split = saludo.split(", ");
        System.out.println("Cadena original: "+saludo);
        for (String token : split) {
            System.out.println("token: "+token);
        }
    }
}
