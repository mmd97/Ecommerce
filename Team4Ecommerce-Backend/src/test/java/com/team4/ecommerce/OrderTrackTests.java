package com.team4.ecommerce;

import com.team4.ecommerce.entity.order.Order;
import com.team4.ecommerce.entity.order.OrderStatus;
import com.team4.ecommerce.entity.order.OrderTrack;
import org.junit.jupiter.api.Test;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.assertj.core.api.Assertions.assertThat;

public class OrderTrackTests {

    @Test
    public void testCreateNewOrderTrack() throws Exception {

        Order order = new Order();
        order.setId(1);

        OrderTrack orderTrack = new OrderTrack();
        orderTrack.setNotes("Package received by the shipping center");
        orderTrack.setStatus(OrderStatus.PROCESSING);
        orderTrack.setOrder(order);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date updatedTime = sdf.parse("2022-10-05T15:30:00");
        orderTrack.setUpdatedTime(updatedTime);


        assertThat(orderTrack.getNotes()).isEqualTo("Package received by the shipping center");
        assertThat(orderTrack.getStatus()).isEqualTo(OrderStatus.PROCESSING);
        assertThat(orderTrack.getOrder()).isEqualTo(order);
        assertThat(orderTrack.getUpdatedTime()).isEqualTo(updatedTime);

        assertThat(orderTrack.getUpdatedTimeOnForm()).isEqualTo("2022-10-05T15:30:00");

        orderTrack.setUpdatedTimeOnForm("2022-11-05T16:45:00");
        Date updatedTimeFromForm = sdf.parse("2022-11-05T16:45:00");
        assertThat(orderTrack.getUpdatedTime()).isEqualTo(updatedTimeFromForm);
    }
}
