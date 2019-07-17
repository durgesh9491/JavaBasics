package design.patterns.observer;

import java.util.HashSet;
import java.util.Set;

public class CricketData implements Subject {

    private int runs;
    private int wickets;
    private float overs;

    private Set<Observer> observers;

    CricketData() {
        observers = new HashSet<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        observers.forEach(observer -> observer.update(runs, wickets, overs));
    }

    /**
     * Some implementation to get live score
     * for now taking dummy
     */
    public void updateScoreBoard() {
        this.runs += 80;
        this.wickets += 2;
        this.overs += 15.4;
        notifyAllObserver();
    }
}
