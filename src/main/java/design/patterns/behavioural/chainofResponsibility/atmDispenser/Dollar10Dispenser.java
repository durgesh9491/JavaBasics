package design.patterns.behavioural.chainofResponsibility.atmDispenser;

/**
 * Created By durgesh.soni on 19/04/20
 */

public class Dollar10Dispenser extends AtmDispenser {
    private static final int value = 10;

    public Dollar10Dispenser(AtmDispenser nextDispenser) {
        super(nextDispenser);
    }

    @Override
    protected void dispense(Currency currency) {
        int targetCurrencyValue = currency.getValue();
        int count = targetCurrencyValue / Dollar10Dispenser.value;
        int remaining = targetCurrencyValue % Dollar10Dispenser.value;
        System.out.println("Dispensing dollar 10 note : " + count + " times!");
        dispenseNext(new Currency(currency.getCountry(), remaining));
    }
}
