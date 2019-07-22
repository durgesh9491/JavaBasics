package design.patterns.behavioural.strategy;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class ShoppingCart implements Cart {
    private Set<Item> items;

    ShoppingCart() {
        items = new HashSet<>();
    }

    @Override
    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public void removeItem(Item item) {
        items.remove(item);
        System.out.println("Item : " + item + " is removed");
    }

    @Override
    public void payBill(PaymentMode mode) {
        mode.pay(getBill());
    }

    @Override
    public int getBill() {
        return items.stream().map(Item::getPrice).reduce(0, Integer::sum);
    }
}
