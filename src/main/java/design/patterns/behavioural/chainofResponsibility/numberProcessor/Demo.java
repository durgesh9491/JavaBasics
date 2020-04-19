package design.patterns.behavioural.chainofResponsibility.numberProcessor;

/**
 * @author durgesh.soni
 */
public class Demo {
    public static void main(String[] args) {
        NumberProcessor p1 = new NegativeProcessor();
        NumberProcessor p2 = new PositiveProcessor();

        p1.setNext(p2);
        p2.setNext(p1);

        p1.process(new Number(100));
        p1.process(new Number(-100));
        p2.process(new Number(100));
        p2.process(new Number(-100));
    }
}
