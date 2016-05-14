
package modulo5.figuras;

/**
 *
 * @author Roberto Olveras
 */
public class Triangulo extends Figura{
    
    private double base;
    private double altura;
    
    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    

}
