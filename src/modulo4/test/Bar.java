
package modulo4.test;

import modulo4.demo.Foo;

public class Bar extends Foo{
    public int result = 2;
    
    public int reportSum(){
        return super.result +5;
    }
}
