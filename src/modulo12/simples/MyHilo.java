
package modulo12.simples;


public class MyHilo extends Thread{
    
    @Override
    public void run() {
        // aqui escribir lo que quiero que se ejecute
         for (int i = 0; i < 100; i++) {
            System.out.println("MyHilo: "+i);
        }
    }
}
