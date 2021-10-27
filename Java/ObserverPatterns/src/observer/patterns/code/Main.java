package observer.patterns.code;

public class Main {

    public static void main(String[] args) {

        System.out.println("*** Observer Pattern Test ***\n");

        Subject subject = new Subject();

        IObserver o1 = new Observer1();
        subject.register(o1);

        IObserver o2 = new Observer2();
        subject.register(o2);

        IObserver o3 = new Observer3();
        subject.register(o3);

        System.out.println("Setting value = 5 ");
        subject.setValue(5);
        System.out.println("Setting value = 25 ");
        subject.setValue(25);
        subject.unregister(o1);
        System.out.println("Setting value = 50 ");
        subject.setValue(50);
        System.out.println("Setting value = 100 ");
        subject.unregister(o2);
        subject.setValue(100);

    }
}
