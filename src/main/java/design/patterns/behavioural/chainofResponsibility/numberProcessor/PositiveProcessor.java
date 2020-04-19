package design.patterns.behavioural.chainofResponsibility.numberProcessor;

/**
 * @author durgesh.soni
 */
class PositiveProcessor implements NumberProcessor {

    private NumberProcessor nextProcessor;

    @Override
    public void setNext(NumberProcessor processor) {
        nextProcessor = processor;
    }

    @Override
    public void process(Number number) {
        if (number.getValue() >= 0) {
            System.out.println("Positive number : " + number.getValue());
        } else {
            nextProcessor.process(number);
        }
    }
}
