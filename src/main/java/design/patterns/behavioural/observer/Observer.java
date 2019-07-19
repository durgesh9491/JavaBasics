package design.patterns.behavioural.observer;

public interface Observer {
    void update(int runs, int wickets, float overs);

    void display();
}
