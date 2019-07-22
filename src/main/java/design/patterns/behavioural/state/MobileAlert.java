package design.patterns.behavioural.state;

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
