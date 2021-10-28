package strategy.patterns.code.contextofstrategy;

import strategy.patterns.code.strategies.IStrategy;

public class Context {
    IStrategy myStrategy;
    // Set a Strategy or algorithm in the Context
    public void SetStrategy(IStrategy is)
    {
        myStrategy = is;
    }
    public void ShowStrategy(String s1,String s2)
    {
        myStrategy.myStrategy(s1,s2);
    }
}
