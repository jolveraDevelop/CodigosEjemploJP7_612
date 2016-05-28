package modulo6.interfaces; 
 
/** 
 * 
 * @author Humberto 
  */ 

class TestInterface{
    public static void main(String[] args) {
        System.out.println("A.VALOR: "+A.VALOR);
        // A.VALOR = 70; // recuerda que es una cosntante
        System.out.println("A.VALOR: "+A.VALOR);
    }
}
 public interface A { 
    public static final int VALOR = 100; 
    void method1(); 
    public abstract void method2(); 
 }   
 interface B extends A { 
     void method1();
     static int VALOR = 10; 
  
     void method3(); 
 } 
  
 interface X extends A, B { 
   @Override
   void method1(); 
   void method4(); 
 } 


class XX implements X{
    //static int VALOR = 10; 
    public void method1(){}//System.out.println("VALOR: "+VALOR);}// AMBIGUO, NO SABES SI ES DE A O B
    public void method2(){}
    public void method3(){}
    public void method4(){}
}
  
 abstract class C implements B, A { 
  
     @Override 
     public void method3() { 
     } 
  
     @Override 
     public void method2() { 
         System.out.println(B.VALOR); 
     } 
  
 } 
  
 class D extends C { 
  
     @Override 
     public void method1() { 
     } 
  
 } 

class AA implements A{
    public void method1(){
        
    }
    public void method2(){
        
    }
}