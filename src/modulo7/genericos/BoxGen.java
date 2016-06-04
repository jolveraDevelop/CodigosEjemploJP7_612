
package modulo7.genericos;

/**
 *
 * @author Roberto Olveras
 */
public class BoxGen <T>{
    private T obj;
    
    public void add(T obj){
        this.obj = obj;
    }
    
    public T extrat(){
        return this.obj;
    }
}
