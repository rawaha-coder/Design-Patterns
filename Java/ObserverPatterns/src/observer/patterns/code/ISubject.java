package observer.patterns.code;

public interface ISubject {
    void register(Observer o);
    void unregister( Observer o);
    void notifyObservers();
}
