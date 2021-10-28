package decorator.patterns.code;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n***Decorator pattern Code***\n");

        ConcreteComponent cc = new ConcreteComponent();

        ConcreteDecoratorEx1 cd_1 = new ConcreteDecoratorEx1();

        cd_1.SetTheComponent(cc);
        cd_1.doJob();

        System.out.println("\n***************************\n");

        ConcreteDecoratorEx2 cd_2 = new ConcreteDecoratorEx2();
        cd_2.SetTheComponent(cd_1);
        cd_2.doJob();

        System.out.println("\n***************************\n");
    }
}
