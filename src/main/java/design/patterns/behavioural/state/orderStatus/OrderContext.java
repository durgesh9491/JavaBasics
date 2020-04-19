package design.patterns.behavioural.state.orderStatus;

import lombok.Data;

/**
 * Created By durgesh.soni on 19/04/20
 */

@Data
public class OrderContext {

    private OrderStatus orderStatus;

    public OrderContext() {
        orderStatus = new OrderedState();
    }

    public void next() {
        orderStatus.next(this);
    }

    public void prev() {
        orderStatus.prev(this);
    }

    public void printStatus() {
        orderStatus.printStatus();
    }
}
