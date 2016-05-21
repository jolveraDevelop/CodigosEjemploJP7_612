
package modulo5.singleton;

/**
 *
 * @author Roberto Olveras
 */
public class SingletonEjemplo {
    private static SingletonEjemplo instance = new SingletonEjemplo();
    
    private SingletonEjemplo(){
        if(instance==null){
            instance = new SingletonEjemplo();
        }
    }
    
    public static SingletonEjemplo getInstance(){
        if(instance==null){
            instance = new SingletonEjemplo();
        }
        return instance;
    }
}
