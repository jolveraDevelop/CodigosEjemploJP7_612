
package modulo7.genericos;

import modulo6.composite.BasicCar;
import modulo6.composite.Car;

/**
 *
 * @author Roberto Olveras
 */
public class TestBox {
    public static void main(String[] args) {
        Box boxString = new Box();
        boxString.add("Hola");
        System.out.println(boxString.extract());
        String result = (String)boxString.extract();
        
        Box boxIntBox = new Box();
        boxIntBox.add(5);
        System.out.println(boxString.extract());
        
        
        BoxGen<String> boxGen = new BoxGen<String>();
        boxGen.add("Hola");
        String result2 = boxGen.extrat();
        
        BoxGen<Integer> boxGenInt = new BoxGen<>();
        boxGenInt.add(30);
        int result3 = boxGenInt.extrat();
        
        Car c = new BasicCar();
        BasicCar c2 = new BasicCar();
        BoxGen<Car> boxCar = new BoxGen<>();
        boxCar.add(c);
        boxCar.add(c2);
        
    }
}

