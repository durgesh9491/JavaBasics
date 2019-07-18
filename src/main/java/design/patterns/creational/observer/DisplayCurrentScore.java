package design.patterns.creational.observer;

import lombok.Data;

@Data
public class DisplayCurrentScore extends AbstractObserver implements Observer {

    @Override
    public void update(int runs, int wickets, float overs) {
        super.updateMetrics(runs, wickets, overs);
    }

    @Override
    public void display() {
        System.out.println("Current score is :" + " Runs : " + runs + " wickets : " + wickets + " overs : " + overs);
    }
}
