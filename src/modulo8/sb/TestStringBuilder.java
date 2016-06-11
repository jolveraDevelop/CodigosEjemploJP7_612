
package modulo8.sb;

/**
 *
 * @author Roberto Olveras
 */
public class TestStringBuilder {
    public static void main(String[] args) {
        //StringBuilder sb = "Hola Mundo"; // no es posible inicializar literalmente
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        sb.append("Hola mundo ");
        sb.append("Hola mundo ");
        System.out.println(sb);
        sb.replace(11,21,"Java");
        System.out.println(sb);
        sb.insert(11, "Programacion ");
        System.out.println(sb);
        sb.delete(11, 24);
        System.out.println(sb);
        
        StringBuilder sb2 = new StringBuilder("Hola mundo ");
        sb2.append("Hola mundo ").replace(11,21,"Java").insert(11, "Programacion ").delete(1, 4);
        System.out.println(sb2);
        
        //H mundo Programacion Java 
    }
}
