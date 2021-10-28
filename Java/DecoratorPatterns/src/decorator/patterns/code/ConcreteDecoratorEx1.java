package decorator.patterns.code;

public class ConcreteDecoratorEx1 extends AbstractDecorator{
    public void doJob()
    {
        super.doJob();
        System.out.println("|||||| I am explicitly from Extension 1");
    }
}
