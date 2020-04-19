package design.patterns.behavioural.chainofResponsibility.atmDispenser;

/**
 * Created By durgesh.soni on 19/04/20
 */

public class Dollar30Dispenser extends AtmDispenser {
    private static final int value = 30;

    public Dollar30Dispenser(AtmDispenser nextDispenser) {
        super(nextDispenser);

    }

    @Override
    protected void dispense(Currency currency) {
        int targetCurrencyValue = currency.getValue();
        int count = targetCurrencyValue / Dollar30Dispenser.value;
        int remaining = targetCurrencyValue % Dollar30Dispenser.value;
        System.out.println("Dispensing dollar 30 note : " + count + " times!");
        dispenseNext(new Currency(currency.getCountry(), remaining));
    }
}
