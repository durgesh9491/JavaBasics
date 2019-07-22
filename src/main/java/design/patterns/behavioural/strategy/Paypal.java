package design.patterns.behavioural.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Paypal implements PaymentMode {

    private String userName;
    private String pass;

    @Override
    public void pay(int amount) {
        System.out.println("amount : " + amount + " is paid using " + this);
    }
}
