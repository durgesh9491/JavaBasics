package design.patterns.behavioural.state.orderStatus;

/**
 * Created By durgesh.soni on 19/04/20
 */

public class OrderedState implements OrderStatus {
    @Override
    public void next(OrderContext context) {
        context.setOrderStatus(new DeliveredState());
    }

    @Override
    public void prev(OrderContext context) {
        context.setOrderStatus(this);
        System.out.println("Order is in the shipping office only!");
    }

    @Override
    public void printStatus() {
        System.out.println("Order is in the shipping office!");
    }
}
