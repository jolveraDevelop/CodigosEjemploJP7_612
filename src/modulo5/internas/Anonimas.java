
package modulo5.internas;

/**
 *
 * @author Roberto Olveras
 */
public class Anonimas {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(o.toString());
        Object o2 = new Object(){
            @Override
            public String toString() {
                return "Hola Anonima";
            }
        };
        System.out.println(o2.toString());
        Tarea guardarBase = new Tarea(){
            @Override
            public void hacerTarea() {
                System.out.println("Guardando en base de datos...");
            }
            
        };
        
        Tarea mostrarResultado = new Tarea(){
            @Override
            public void hacerTarea() {
                System.out.println("Mostrando el resultado en consola...");
            }
            
        };
        
    }
}
interface Tarea {
    void hacerTarea();
}
