
package modulo5.internas;

/**
 *
 * @author Roberto Olveras
 */
public class Externa {
    private int x ;
    public void m3(){System.out.println("m3 de externa");}
    public static void m1(){System.out.println("m1 de externa");}
    
    protected class Interna{
        private int y ;
        public void m1(){System.out.println("X: "+x);}
        public void m2(){m3(); new Externa().m1();}
    }
    
    public void hacerAlgo(){
        final int b = 9;
        class Local{
            int a;
            public void m1(){System.out.println("b: "+b);}
        }
    }
    
    public static class InternaEstaica{
        private int y ;
        public void m1(){System.out.println("X: ");}
        //public void m2(){m3(); new Externa().m1();}
    }
    
    public static void main(String[] args) {
        //Interna in = new Externa().new Interna();
        Externa ex = new Externa();
        Interna in = ex.new Interna();
        InternaEstaica inEst = new Externa.InternaEstaica();
        
    }
    
}
