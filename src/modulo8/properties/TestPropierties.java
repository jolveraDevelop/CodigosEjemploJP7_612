
package modulo8.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/**
 *
 * @author Roberto Olveras
 */
public class TestPropierties {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\jr_ro\\Desktop\\prueba.properties");
        prop.load(fis);
        
        System.out.println("Version del sistema: "+prop.get("develop.hm.version"));
        System.out.println("Lenguaje del sistema: "+prop.getProperty("develop.hm.lenguage"));
        System.out.println("Otra Propiedad: "+prop.getProperty("develop.hm.xxx"));
        
    }
}
