package decorator.patterns.code;

public class ConcreteDecoratorEx2 extends AbstractDecorator{
    public void doJob()
    {
        super.doJob();
        System.out.println("||||||||| Explicitly From Decorator Extension 2");
    }
}
