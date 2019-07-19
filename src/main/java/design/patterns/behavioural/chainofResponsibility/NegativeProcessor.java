package design.patterns.behavioural.chainofResponsibility;

/**
 * @author durgesh.soni
 */
class NegativeProcessor implements NumberProcessor {
    private NumberProcessor nextProcessor;

    @Override
    public void setNext(NumberProcessor processor) {
        nextProcessor = processor;
    }

    @Override
    public void process(Number number) {
        if (number.getValue() < 0) {
            System.out.println("Negative number : " + number.getValue());
        } else {
            nextProcessor.process(number);
        }
    }
}
