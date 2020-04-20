package design.patterns.behavioural.chainofResponsibility.atmDispenser;

import lombok.AllArgsConstructor;

import java.util.Objects;

/**
 * Created By durgesh.soni on 19/04/20
 */

@AllArgsConstructor
public abstract class AtmDispenser {
    private AtmDispenser nextDispenser;

    protected abstract void dispense(Currency currency);

    protected final void dispenseNext(Currency currency) {
        if (Objects.nonNull(nextDispenser)) {
            nextDispenser.dispense(currency);
        }
    }
}