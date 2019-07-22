package design.patterns.behavioural.strategy;

import java.util.Set;

public interface Cart {
    void addItem(Item item);

    void removeItem(Item item);

    Set<Item> getItems();

    int getBill();

    void payBill(PaymentMode mode);
}
