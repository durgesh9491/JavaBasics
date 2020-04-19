package design.patterns.behavioural.state.mobileAlert;

import lombok.Setter;

/**
 * @author durgesh.soni
 */
@Setter
public class MobileAlert {
    private MobileMode mode;

    MobileAlert() {
        mode = new VibrationMode();
    }

    void processAlert() {
        mode.notify(this);
    }
}
