package strategy.patterns.code;

import strategy.patterns.code.contextofstrategy.Context;
import strategy.patterns.code.strategies.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("***Strategy Pattern Code***");
        //Looping twice to test two different strategies
        try (Scanner in = new Scanner(System.in)) {
            IStrategy iStrategy;
            Context context = new Context();
            String input1, input2;
            for (int i = 1; i <= 2; i++) {
                System.out.println("Enter an integer:");
                input1 = in.nextLine();
                System.out.println("Enter another integer:");
                input2 = in.nextLine();
                System.out.println("Enter your Strategy(1 or 2)");
                System.out.println("Press 1 for Addition, 2 for Concatenation");
                String c = in.nextLine();

                if (c.equals("1")) {
                /*
                If user input is 1, create object of FirstStrategy (Strategy 1)
                */
                    iStrategy = new FirstStrategy();
                } else {
                /*
                If user input is 2, create object of SecondStrategy (Strategy 2)
                */
                    iStrategy = new SecondStrategy();
                }
                /*
                Associate the Strategy with Context
                */
                context.SetStrategy(iStrategy);
                context.ShowStrategy(input1, input2);
            }
        }
        System.out.println("End of Strategy pattern");
    }
}
