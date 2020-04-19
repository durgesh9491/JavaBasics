package design.patterns.behavioural.state.orderStatus;

/**
 * Created By durgesh.soni on 19/04/20
 */

public class ReceivedState implements OrderStatus {
    @Override
    public void next(OrderContext context) {
        System.out.println("Order is already received by the customer!");
        context.setOrderStatus(this);
    }

    @Override
    public void prev(OrderContext context) {
        context.setOrderStatus(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order is received by the customer!");
    }
}
