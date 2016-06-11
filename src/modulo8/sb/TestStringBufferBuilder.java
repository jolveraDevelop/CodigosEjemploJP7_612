
package modulo8.sb;

/**
 *
 * @author Roberto Olveras
 */
public class TestStringBufferBuilder {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = s2;
        System.out.println("---String");
        System.out.println("s1.equals(s2): "+s1.equals(s2));
        System.out.println("s1 == s2 :"+(s1 == s2));
        System.out.println("s2 == s3: "+(s2 == s3));
        
        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = new StringBuilder("abc");
        StringBuilder sb3 = sb2;
        System.out.println("---StringBuilder");
        System.out.println("sb1.equals(sb2): "+sb1.equals(sb2));
        System.out.println("sb1 == sb2 :"+(sb1 == sb2));
        System.out.println("sb2 == sb3: "+(sb2 == sb3));
        
        StringBuffer sbf1 = new StringBuffer("abc");
        StringBuffer sbf2 = new StringBuffer("abc");
        StringBuffer sbf3 = sbf2;
        
        // sbf3 = s1; no compila
        //sbf3 = sb2;
        
        System.out.println("---StringBuffer");
        System.out.println("sbf1.equals(sbf2): "+sb1.equals(sbf2));
        System.out.println("sbf1 == sbf2 :"+(sbf1 == sbf2));
        System.out.println("sbf2 == sbf3: "+(sbf2 == sbf3));
        
        
        
    }
}
