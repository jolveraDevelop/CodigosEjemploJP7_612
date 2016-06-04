
package modulo7.genericos;

/**
 *
 * @author Roberto Olveras
 */
public class Box {
    private Object obj;
    
    public void add(Object obj){
        this.obj = obj;
    }
    
    public Object extract(){
        return this.obj;
    }
}
