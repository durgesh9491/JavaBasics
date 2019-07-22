package design.patterns.behavioural.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class CreditCard implements PaymentMode {

    private String cardNo;
    private String cvv;
    private Date expiry;

    @Override
    public void pay(int amount) {
        System.out.println("amount : " + amount + " is paid using " + this);
    }
}
