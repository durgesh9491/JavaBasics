package design.patterns.behavioural.chainofResponsibility.numberProcessor;

/**
 * @author durgesh.soni
 */
interface NumberProcessor {
    void setNext(NumberProcessor processor);

    void process(Number number);
}
