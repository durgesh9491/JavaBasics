package design.patterns.behavioural.chainofResponsibility.atmDispenser;

/**
 * Created By durgesh.soni on 19/04/20
 */

public class Dollar50Dispenser extends AtmDispenser {
    private static final int value = 50;

    public Dollar50Dispenser(AtmDispenser nextDispenser) {
        super(nextDispenser);
    }

    @Override
    protected void dispense(Currency currency) {
        int targetCurrencyValue = currency.getValue();
        int count = targetCurrencyValue / Dollar50Dispenser.value;
        int remaining = targetCurrencyValue % Dollar50Dispenser.value;
        System.out.println("Dispensing dollar 50 note : " + count + " times!");
        dispenseNext(new Currency(currency.getCountry(), remaining));
    }
}
