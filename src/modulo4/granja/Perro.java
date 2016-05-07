
package modulo4.granja;

/**
 *
 * @author Roberto Olveras
 */
public class Perro extends Animal{
    @Override
    protected String hacerRuido(){
        return "guaguau";
    }
    
    @Override
    public Perro getInstance(){
        return new Perro();
    }
    
    //@Override
    private void m1(){
        
    }
}
