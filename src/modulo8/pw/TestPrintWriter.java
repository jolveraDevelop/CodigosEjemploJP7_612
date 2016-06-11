
package modulo8.pw;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Roberto Olveras
 */
public class TestPrintWriter {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(System.out,true);
        //PrintWriter pw = new PrintWriter("C:\\Users\\jr_ro\\Desktop\\log.txt");
        pw.println("Hola mundo");
        pw.println("Como estan?");
        //pw.close(); // no es necesario ya que el auto flush esta activo
    }
}
