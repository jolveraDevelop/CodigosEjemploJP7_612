
package modulo12.simples;


public class TestSharingData {
    public static void main(String[] args) {
        MyAccion accion = new MyAccion();
        Thread t1 = new Thread(new MyHiloRunnable(accion,"A"));
        Thread t2 = new Thread(new MyHiloRunnable(accion,"B"));
        t1.start();
        t2.start();
    }
}
