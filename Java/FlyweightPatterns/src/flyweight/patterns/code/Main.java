package flyweight.patterns.code;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {

        RobotFactory robotFactory = new RobotFactory();
        System.out.println("\n***Flyweight Pattern Code***\n");
        Robot shape;
        /*Here we are trying to get 3 king type robots*/
        for (int i = 0; i < 3; i++)
        {
            shape =(Robot) robotFactory.GetRobotFromFactory("King");
            shape.setColor(getRandomColor());
            shape.Print();
        }
        /*Here we are trying to get 3 queen type robots*/
        for (int i = 0; i < 3; i++)
        {
            shape =(Robot) robotFactory.GetRobotFromFactory("Queen");
            shape.setColor(getRandomColor());
            shape.Print();
        }
        int NumOfDistinctRobots = robotFactory.TotalObjectsCreated();
        System.out.println("\n Finally no of Distinct Robot objects created: "+ NumOfDistinctRobots);

    }

    static String getRandomColor(){
        Random r = new Random();
        int random = r.nextInt(20);
        if(random%2==0)
        {
            return "red";
        }
        else
        {
            return "green";
        }

    }
}
