package lab3.Observer;

public interface ObservedSubject {
    void register (Observer obj);
    void unregister (Observer obj);
    void NotifyObserver (String message);
}
