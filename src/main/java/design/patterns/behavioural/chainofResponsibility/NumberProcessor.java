package design.patterns.behavioural.chainofResponsibility;

/**
 * @author durgesh.soni
 */
interface NumberProcessor {
    void setNext(NumberProcessor processor);

    void process(Number number);
}
