package design.patterns.behavioural.state.mobileAlert;

/**
 * @author durgesh.soni
 */
public class SilentMode implements MobileMode {
    @Override
    public void notify(MobileAlert alert) {
        System.out.println("Phone is in silent mode");
    }
}
