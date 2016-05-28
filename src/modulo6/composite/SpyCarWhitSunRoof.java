
package modulo6.composite;

/**
 *
 * @author Roberto Olveras
 */
public class SpyCarWhitSunRoof implements Car{
    BasicCar basicCarAddon = new BasicCar();
    SpyCar spyCarAddon = new SpyCar();
    CarWithSunRoof carWithSunRoofAddon = new CarWithSunRoof();
    
    public void start(){
        this.basicCarAddon.start();
    }

    public void openSunRoof() {
        carWithSunRoofAddon.openSunRoof();
    }

    public void closeSunRoof() {
        carWithSunRoofAddon.closeSunRoof();
    }

    public void shootRockets() {
        spyCarAddon.shootRockets();
    }
    
    
}
