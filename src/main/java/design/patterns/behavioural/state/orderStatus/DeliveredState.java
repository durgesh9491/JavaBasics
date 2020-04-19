package design.patterns.behavioural.state.orderStatus;

/**
 * Created By durgesh.soni on 19/04/20
 */

public class DeliveredState implements OrderStatus {
    @Override
    public void next(OrderContext context) {
        context.setOrderStatus(new ReceivedState());
    }

    @Override
    public void prev(OrderContext context) {
        context.setOrderStatus(new OrderedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order is delivered!");
    }
}
