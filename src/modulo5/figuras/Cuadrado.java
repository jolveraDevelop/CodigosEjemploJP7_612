
package modulo5.figuras;

/**
 *
 * @author Roberto Olveras
 */
public class Cuadrado extends Cuadrilatero{

    private final double lado ;

    public Cuadrado() {
        this.lado = 20;
    }

    
    public Cuadrado(int lado) {
        this.lado = lado;
    }
    
    
    @Override
    public double calcularArea() {
        return lado*lado;
    }

    
    
    public double getLado() {
        return lado;
    }

//    public void setLado(double lado) {
//        this.lado = lado;
//    }
//    
    

}
