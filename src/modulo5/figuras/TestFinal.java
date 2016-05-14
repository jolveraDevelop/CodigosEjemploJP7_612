
package modulo5.figuras;

/**
 *
 * @author Roberto Olveras
 */
public class TestFinal {
    public static void main(String[] args) {
        Figura figura[] = new Figura[3];
        Cuadrado c = new Cuadrado(5);
        Cuadrado c2 = new Cuadrado(2);
        Cuadrado c3 = new Cuadrado(8);
        figura[0] = c;
        figura[1] = c2;
        figura[2] = c3;
        for (Figura f : figura) {
            System.out.println(f.calcularArea());
        }
        final int x = 3;
        x = 7;
        
    }
    
    public static void hacerAlgo(final int y){
        System.out.println("y: "+y);
        y = 1;
    }
}
