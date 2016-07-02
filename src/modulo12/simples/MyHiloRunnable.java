
package modulo12.simples;


public class MyHiloRunnable implements Runnable{
    
    private MyAccion acccion;
    
    private String id;

    public MyHiloRunnable() {
        this.acccion = new MyAccion();
    }
  
    
    public MyHiloRunnable(MyAccion acccion,String id) {
        this.id = id;
        this.acccion = acccion;
    }
    
    
    
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyHiloRunnable "+id+" : "+i);
            System.out.println("accion.getI: "+id+" : "
                    +acccion.getI());
            acccion.setI(acccion.getI()+1);
        }
    }
    
}
