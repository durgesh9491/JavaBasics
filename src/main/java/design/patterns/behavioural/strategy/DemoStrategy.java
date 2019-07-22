package design.patterns.behavioural.strategy;

import java.util.Date;

public class DemoStrategy {
    public static void main(String[] args) {
        Cart cart = new ShoppingCart();

        Item i1 = new Item("Fruit", 100, 1);
        Item i2 = new Item("Biscuit", 20, 2);
        Item i3 = new Item("Cloth", 500, 3);
        cart.addItem(i1);
        cart.addItem(i2);
        cart.addItem(i3);

        System.out.println("Items are : " + cart.getItems());
        System.out.println("Total bill is : " + cart.getBill());

        cart.removeItem(i2);
        System.out.println("Items are : " + cart.getItems());
        System.out.println("Total bill is : " + cart.getBill());

        cart.payBill(new CreditCard("1234", "999", new Date()));
        cart.payBill(new Paypal("random", "ipsum"));
    }
}
