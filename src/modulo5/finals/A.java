/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo5.finals;

/**
 *
 * @author Humberto
 */
public /*final*/ class A {

    public static final int a;

    {
        
        System.out.println("A{}");
    }

    static {
        a = 15;
        System.out.println("A static{}");
    }

    public A() {
        System.out.println("A()");

    }

    final public void m() {

    }
}

class B extends A {

    {
        System.out.println("B{}");
    }

    static {
        System.out.println("B static{}");
    }

    public B() {
        System.out.println("B()");
    }
    
    @Override
    public void m() {

    }

}

class TestStatic {

    public static void main(String[] args) {
        B b = new B();
        B b2 = new B();
    }
}
