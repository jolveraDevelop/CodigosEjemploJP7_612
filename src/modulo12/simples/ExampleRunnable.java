
package modulo12.simples;

public class ExampleRunnable implements Runnable{
    private int i = 0;
    @Override
    public void run() {
        for ( ;i < 100;) {
            System.out.println("Hilo : "+i);
            i++;
        }
    }
    public static void main(String[] args) {
        ExampleRunnable r1 = new ExampleRunnable();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();
        
    }
}
