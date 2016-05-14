
package modulo5.figuras;

/**
 *
 * @author Roberto Olveras
 */
public class TestFigura {
    public static void main(String[] args) {
        Figura figura[] = new Figura[3];
        Cuadrado c = new Cuadrado(); c.setLado(3);
        figura[0] = c;
        Circulo ci = new Circulo(); ci.setRadio(7);
        figura[1] = ci;
        Triangulo t = new Triangulo(); t.setAltura(4); t.setBase(8);
        figura[2] = t;
        for (Figura f : figura) {
            // mostrar el area de la figura
            
            System.out.println(CalcularAreaFigura.carcular(f));
        }
    }
}
