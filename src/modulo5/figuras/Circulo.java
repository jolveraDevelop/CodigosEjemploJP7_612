
package modulo5.figuras;

import static java.lang.Math.PI;
import static java.lang.Math.*;
/**
 *
 * @author Roberto Olveras
 */
public class Circulo extends Figura{

    double radio;
    
    @Override
    public double calcularArea() {
        return pow(radio, 2)*PI;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    

}
