
package modulo5.figuras;

/**
 *
 * @author Roberto Olveras
 */
public class Cuadrado extends Cuadrilatero{

    private double lado;

    public Cuadrado() {
    }
    
    @Override
    public double calcularArea() {
        return lado*lado;
    }

    
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    

}
