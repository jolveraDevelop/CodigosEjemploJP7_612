
package modulo4.test;

import modulo4.demo.Foo;

/**
 *
 * @author Roberto Olveras
 */
public class TestMetodosVirtuales {
    public static void main(String[] args) {
        Foo x = new Bar();
        Foo y = new Foo();
        System.out.println("reportSum y: "+y.reportSum());
        System.out.println("reportSum x: "+x.reportSum());
        System.out.println("------------------");
//        System.out.println("result y: "+y.result);
//        System.out.println("result x: "+x.result);
        System.out.println("result y: "+y.getResult());
        System.out.println("result x: "+x.getResult());
        
        
        
        
    }
}
