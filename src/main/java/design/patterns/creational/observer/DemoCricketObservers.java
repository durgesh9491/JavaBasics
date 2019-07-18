package design.patterns.creational.observer;

public class DemoCricketObservers {
    public static void main(String[] args) {

        DisplayAnalytics displayAnalytics = new DisplayAnalytics();
        DisplayCurrentScore displayCurrentScore = new DisplayCurrentScore();

        CricketData data = new CricketData();
        data.registerObserver(displayAnalytics);
        data.registerObserver(displayCurrentScore);
        data.updateScoreBoard();

        displayAnalytics.display();
        displayCurrentScore.display();

        data.unregisterObserver(displayAnalytics);
        data.updateScoreBoard();

        /**
         * Now displayAnalytics shows older data -> unregistered
         */
        displayAnalytics.display();
        displayCurrentScore.display();
    }
}
