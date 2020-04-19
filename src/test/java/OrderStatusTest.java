import design.patterns.behavioural.state.orderStatus.DeliveredState;
import design.patterns.behavioural.state.orderStatus.OrderContext;
import design.patterns.behavioural.state.orderStatus.OrderedState;
import design.patterns.behavioural.state.orderStatus.ReceivedState;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

/**
 * Created By durgesh.soni on 19/04/20
 */

public class OrderStatusTest {

    @Test
    public void givenNewOrder_whenOrderReceived_thenStateReceived() {
        OrderContext orderContext = new OrderContext();
        assertThat(orderContext.getOrderStatus(), instanceOf(OrderedState.class));

        orderContext.next();
        assertThat(orderContext.getOrderStatus(), instanceOf(DeliveredState.class));

        orderContext.next();
        assertThat(orderContext.getOrderStatus(), instanceOf(ReceivedState.class));

        orderContext.prev();
        assertThat(orderContext.getOrderStatus(), instanceOf(DeliveredState.class));
    }
}
