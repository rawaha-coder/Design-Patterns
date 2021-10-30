package flyweight.patterns.code;

// Concrete Flyweight class SmallRobot
public class SmallRobot implements IRobot{
    @Override
    public void Print() {
        System.out.println(" This is a Small Robot");
    }
}
