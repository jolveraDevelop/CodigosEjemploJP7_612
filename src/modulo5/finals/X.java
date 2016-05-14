
package modulo5.finals;

/**
 *
 * @author Roberto Olveras
 */
public class X {
    public final void m1(){}
}

final class Y extends X {
    public void m2(){ super.m1();}
    @Override
    public void m1() {}
}

class Z extends Y{}

class Test{
    public static void main(String[] args) {
        Y y = new Y();
        y.m1();
    }
}