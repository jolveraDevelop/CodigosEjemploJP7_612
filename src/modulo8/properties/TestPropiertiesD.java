
package modulo8.properties;

/**
 *
 * @author Roberto Olveras
 */
public class TestPropiertiesD {
    public static void main(String[] args) {
        System.out.println("Recuperando propiedades: ");
        System.out.println("User: "+System.getProperty("user.name.system"));
        System.out.println("User: "+System.getProperties().getProperty("user.name.system"));
        System.out.println("User: "+System.getProperties().get("user.name.system"));
    }
}
