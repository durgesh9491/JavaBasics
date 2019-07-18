package design.patterns.creational.observer;

public interface Subject {
    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyAllObserver();
}
