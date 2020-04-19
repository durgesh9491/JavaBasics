package design.patterns.behavioural.state.mobileAlert;

/**
 * @author durgesh.soni
 */
public class DemoStateChanger {
    public static void main(String[] args) {
        MobileAlert alert = new MobileAlert();
        alert.processAlert();
        alert.setMode(new SilentMode());
        alert.processAlert();
        alert.setMode(new RingMode());
        alert.processAlert();
    }
}
