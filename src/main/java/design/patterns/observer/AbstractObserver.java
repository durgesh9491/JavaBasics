package design.patterns.observer;

import lombok.Data;

@Data
public abstract class AbstractObserver {
    protected int runs;
    protected int wickets;
    protected float overs;

    protected void updateMetrics(int runs, int wickets, float overs) {
        this.runs = runs;
        this.overs = overs;
        this.wickets = wickets;
    }
}
