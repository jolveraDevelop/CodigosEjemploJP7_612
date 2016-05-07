
package modulo4.test;

import modulo4.demo.Foo;

public class Bar extends Foo{
    private int result = 2;

    @Override
    public int getResult() {
        return result;
    }
    
    @Override
    public int reportSum(){
        return result +3;
    }
}
