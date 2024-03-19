package com.team4.ecommerce;

import com.team4.ecommerce.entity.order.OrderStatus;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class OrderStatusTests {

    @Test
    public void testDefaultDescriptions() {
        assertThat(OrderStatus.NEW.defaultDescription()).isEqualTo("Order was placed by the customer");
        assertThat(OrderStatus.CANCELLED.defaultDescription()).isEqualTo("Order was rejected");
        assertThat(OrderStatus.PROCESSING.defaultDescription()).isEqualTo("Order is being processed");
        assertThat(OrderStatus.PACKAGED.defaultDescription()).isEqualTo("Products were packaged");
        assertThat(OrderStatus.PICKED.defaultDescription()).isEqualTo("Shipper picked the package");
        assertThat(OrderStatus.SHIPPING.defaultDescription()).isEqualTo("Shipper is delivering the package");
        assertThat(OrderStatus.DELIVERED.defaultDescription()).isEqualTo("Customer received products");
        assertThat(OrderStatus.RETURN_REQUESTED.defaultDescription()).isEqualTo("Customer sent request to return purchase");
        assertThat(OrderStatus.RETURNED.defaultDescription()).isEqualTo("Products were returned");
        assertThat(OrderStatus.PAID.defaultDescription()).isEqualTo("Customer has paid this order");
        assertThat(OrderStatus.REFUNDED.defaultDescription()).isEqualTo("Customer has been refunded");
    }
}
