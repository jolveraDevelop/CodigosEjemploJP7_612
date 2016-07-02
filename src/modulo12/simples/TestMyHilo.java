
package modulo12.simples;


public class TestMyHilo {
    public static void main(String[] args) {
        Thread t = new MyHilo();
        Thread t1 = new Thread(new MyHiloRunnable());
        t.start();
        t1.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("Main: "+i);
        }
        
    }
}
