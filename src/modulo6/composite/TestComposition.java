
package modulo6.composite;

/**
 *
 * @author Roberto Olveras
 */
public class TestComposition {
    public static void main(String[] args) {
//        BasicCar c1 = new SpyCar();
//        BasicCar c2 = new CarWithSunRoof();
//        BasicCar c3 = new SpyCarWhitSunRoof();

        Car c = new BasicCar();
        Car c1 = new SpyCar();
        Car c2 = new CarWithSunRoof();
        Car c3 = new SpyCarWhitSunRoof();
    }
}
