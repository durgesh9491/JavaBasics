package design.patterns.behavioural.state.orderStatus;

/**
 * Created By durgesh.soni on 19/04/20
 */

public class OrderStatusRunner {
    public static void main(String[] args) {
        OrderContext context = new OrderContext();
        context.printStatus();
        context.next();
        context.printStatus();
        context.next();
        context.printStatus();
        context.prev();
        context.printStatus();
    }
}
