
package modulo12.simples;

public class TestStop implements Runnable{
    public volatile boolean quit = false;
    @Override
    public void run() {
        while (!quit) {
            System.out.println("Hola");
        }
        System.out.println("end TestStop");
    }  
    
    public void stop(){
        this.quit = true;
    }
    
    public static void main(String[] args) {
        TestStop testStop = new TestStop();
        Thread t1 = new Thread(testStop);
        t1.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("i: "+i);
        }
        //testStop.stop();
        t1.stop();
    }
}
