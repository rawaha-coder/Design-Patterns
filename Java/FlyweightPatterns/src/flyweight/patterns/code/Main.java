package flyweight.patterns.code;

public class Main {

    public static void main(String[] args) throws Exception {
        RobotFactory robotFactory = new RobotFactory();
        System.out.println("\n***Flyweight Pattern Code***\n");
        IRobot shape = robotFactory.GetRobotFromFactory("small");
        shape.Print();

/*
Here we are trying to get the objects additional 2 times. Note that from
now onward we do not need to create additional small robots as we have
already created this category
*/
        for (int i = 0; i < 2; i++)
        {
            shape = robotFactory.GetRobotFromFactory("small");
            shape.Print();
        }
        int NumOfDistinctRobots = robotFactory.TotalObjectsCreated();
        System.out.println("\nDistinct Robot objects created till now= "+ NumOfDistinctRobots);

/*
Here we are trying to get the objects 5 times. Note that the second time
onward we do not need to create additional large robots as we have already
created this category in the first attempt(at i=0)
*/
        for (int i = 0; i < 5; i++)
        {
            shape = robotFactory.GetRobotFromFactory("large");
            shape.Print();
        }
        NumOfDistinctRobots = robotFactory.TotalObjectsCreated();
        System.out.println("\n Finally no of Distinct Robot objects created: "+ NumOfDistinctRobots);
    }
}
