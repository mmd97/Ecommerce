package com.team4.ecommerce;

import com.team4.ecommerce.entity.Category;
import com.team4.ecommerce.entity.order.Order;
import com.team4.ecommerce.entity.order.OrderDetail;
import com.team4.ecommerce.entity.product.Product;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class OrderDetailTests {

    @Test
    public void testCreateNewOrderDetail() {
        Category category = new Category("Electronics");
        Product product = new Product();
        product.setName("Laptop");
        product.setCategory(category);
        product.setPrice(1200.00f);


        Order order = new Order();
        order.setId(1);


        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setProduct(product);
        orderDetail.setQuantity(2);
        orderDetail.setProductCost(2400.00f);
        orderDetail.setShippingCost(50.00f);
        orderDetail.setUnitPrice(1200.00f);
        orderDetail.setSubtotal(2450.00f);
        orderDetail.setOrder(order);

        assertThat(orderDetail.getProduct()).isEqualTo(product);
        assertThat(orderDetail.getQuantity()).isEqualTo(2);
        assertThat(orderDetail.getProductCost()).isEqualTo(2400.00f);
        assertThat(orderDetail.getShippingCost()).isEqualTo(50.00f);
        assertThat(orderDetail.getUnitPrice()).isEqualTo(1200.00f);
        assertThat(orderDetail.getSubtotal()).isEqualTo(2450.00f);
        assertThat(orderDetail.getOrder()).isEqualTo(order);


        assertThat(orderDetail.getProduct().getCategory()).isEqualTo(category);
        assertThat(orderDetail.getProduct().getName()).isEqualTo("Laptop");
    }
}
