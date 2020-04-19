package design.patterns.behavioural.state.orderStatus;

/**
 * Created By durgesh.soni on 19/04/20
 */

public interface OrderStatus {
    void next(OrderContext context);

    void prev(OrderContext context);

    void printStatus();
}
