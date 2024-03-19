package com.team4.ecommerce;

import com.team4.ecommerce.entity.*;
import com.team4.ecommerce.entity.order.Order;
import com.team4.ecommerce.entity.order.OrderDetail;
import com.team4.ecommerce.entity.order.OrderStatus;
import com.team4.ecommerce.entity.order.PaymentMethod;
import com.team4.ecommerce.entity.product.Product;
import org.junit.jupiter.api.Test;
import java.util.Date;
import java.util.HashSet;
import static org.assertj.core.api.Assertions.assertThat;

public class OrderTests {

    @Test
    public void testCreateNewOrder() {
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setLastName("Doe");
        customer.setPhoneNumber("1234567890");
        customer.setAddressLine1("123 Main St");
        customer.setAddressLine2("Unit 4");
        customer.setCity("Springfield");
        customer.setCountry(new Country("USA"));
        customer.setPostalCode("98765");
        customer.setState("IL");

        Product product = new Product();


        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setProduct(product);
        orderDetail.setQuantity(1);
        orderDetail.setSubtotal(200.0f);

        HashSet<OrderDetail> orderDetails = new HashSet<>();
        orderDetails.add(orderDetail);

        Order order = new Order();
        order.setCustomer(customer);
        order.setOrderDetails(orderDetails);
        order.setOrderTime(new Date());
        order.setProductCost(200.0f);
        order.setShippingCost(15.0f);
        order.setSubtotal(215.0f);
        order.setTax(10.0f);
        order.setTotal(225.0f);
        order.setDeliverDays(5);
        order.setPaymentMethod(PaymentMethod.CREDIT_CARD);
        order.setStatus(OrderStatus.PROCESSING);


        order.copyAddressFromCustomer();


        assertThat(order.getCustomer()).isEqualTo(customer);
        assertThat(order.getOrderDetails()).hasSize(1);
        assertThat(order.getTotal()).isEqualTo(225.0f);
        assertThat(order.getPaymentMethod()).isEqualTo(PaymentMethod.CREDIT_CARD);
        assertThat(order.getStatus()).isEqualTo(OrderStatus.PROCESSING);
        assertThat(order.getShippingAddress()).contains("John Doe", "123 Main St", "Unit 4", "Springfield", "IL", "USA", "98765");
        assertThat(order.getDeliverDays()).isEqualTo(5);

        assertThat(order.getRecipientName()).isEqualTo("John Doe");
        assertThat(order.getRecipientAddress()).contains("123 Main St", "Unit 4", "Springfield", "IL", "98765");
        assertThat(order.isCOD()).isFalse();
        assertThat(order.isProcessing()).isTrue();
    }
}
