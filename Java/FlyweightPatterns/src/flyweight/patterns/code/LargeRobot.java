package flyweight.patterns.code;

// Concrete Flyweight class LargeRobot
public class LargeRobot implements IRobot{
    @Override
    public void Print() {
        System.out.println(" I am a Large Robot");
    }
}
