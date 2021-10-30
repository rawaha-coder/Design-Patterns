package flyweight.patterns.code;

// FlyweightFactory class

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, IRobot> shapes = new HashMap<String, IRobot>();
    public int TotalObjectsCreated()
    {
        return shapes.size();
    }
    IRobot GetRobotFromFactory(String robotType) throws Exception{
        IRobot robotCategory= null;
        if (shapes.containsKey(robotType))
        {
            robotCategory = shapes.get(robotType);
        }
        else
        {
            switch (robotType)
            {
                case "King":
                    System.out.println("\nWe do not have King Robot. So we are creating a King Robot now.");
                    robotCategory = new Robot("King");
                    shapes.put("King",robotCategory);
                    break;
                case "Queen":
                    System.out.println("\nWe do not have Queen Robot. So we are creating a Queen Robot now.");
                    robotCategory = new Robot("Queen");
                    shapes.put("Queen",robotCategory);
                    break;
                default:
                    throw new Exception(" Robot Factory can create only king and queen type robots");
            }
        }
        return robotCategory;
    }
}
