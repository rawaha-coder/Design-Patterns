package strategy.patterns.code.strategies;

public class SecondStrategy implements IStrategy {
    @Override
    public void myStrategy(String s1, String s2) {
        System.out.println("You wanted to concatenate the numbers.");
        System.out.println(" The result of the addition is:"+s1+s2);
        System.out.println("***End of the strategy***");
    }
}
