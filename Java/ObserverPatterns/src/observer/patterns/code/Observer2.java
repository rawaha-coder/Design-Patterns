package observer.patterns.code;

public class Observer2 implements IObserver{
    @Override
    public void update(int i, String s) {
        System.out.println(s + ": myValue in Subject is now: " + i);
    }
}
