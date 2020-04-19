package design.patterns.behavioural.chainofResponsibility.atmDispenser;

import java.util.Scanner;

/**
 * Created By durgesh.soni on 19/04/20
 */

public class AtmDispenseRunner {
    public static void main(String[] args) {
        AtmDispenser atmDispenser = buildDispenser();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int targetAmount = scanner.nextInt();
            atmDispenser.dispense(new Currency(Currency.Country.AMERICA, targetAmount));
        }
    }

    private static AtmDispenser buildDispenser() {
        return new Dollar50Dispenser(new Dollar30Dispenser(new Dollar10Dispenser(null)));
    }
}
