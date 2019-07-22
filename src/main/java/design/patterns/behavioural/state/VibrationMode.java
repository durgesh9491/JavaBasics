package design.patterns.behavioural.state;

/**
 * @author durgesh.soni
 */
public class VibrationMode implements MobileMode {
    @Override
    public void notify(MobileAlert alert) {
        System.out.println("Phone is vibrating");
    }
}
