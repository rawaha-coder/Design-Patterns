package observer.patterns.code;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject{

    List<IObserver> observerList = new ArrayList<IObserver>();

    private int value;

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
        notifyObservers(value);
    }

    @Override
    public void register(IObserver o) {
        observerList.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers(int updatedValue) {
        for (IObserver iObserver : observerList) {
            iObserver.update(updatedValue, iObserver.getClass().getSimpleName());
        }
    }


}
