package design.patterns.observer;

public enum CricketConstants {
    ODI_TOTAL_OVERS(50);

    private int value;

    CricketConstants(int val) {
        value = val;
    }

    public int getvalue() {
        return value;
    }
}
