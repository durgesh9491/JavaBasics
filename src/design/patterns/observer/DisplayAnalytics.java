package design.patterns.observer;

public class DisplayAnalytics extends AbstractObserver implements Observer {

    private float runRate;
    private float predictedScore;

    @Override
    public void update(int runs, int wickets, float overs) {
        super.updateMetrics(runs, wickets, overs);
        updateAnalytics();
    }

    @Override
    public void display() {
        System.out.println("Current runrate is : " + this.runRate + " and predicted score is : " + this.predictedScore);

    }

    private void updateAnalytics() {
        this.runRate = runs / overs;
        this.predictedScore = (this.runRate) * CricketConstants.ODI_TOTAL_OVERS.getvalue();
    }
}
