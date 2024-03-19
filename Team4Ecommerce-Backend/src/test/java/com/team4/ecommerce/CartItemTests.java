package com.team4.ecommerce;

import com.team4.ecommerce.entity.CartItem;
import com.team4.ecommerce.entity.Customer;
import com.team4.ecommerce.entity.product.Product;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CartItemTests {

    @Test
    public void testCreateNewCartItem() {
        Customer customer = new Customer();
        Product product = new Product();


        CartItem cartItem = new CartItem();
        cartItem.setCustomer(customer);
        cartItem.setProduct(product);
        cartItem.setQuantity(2);
        cartItem.setShippingCost(15.99f);


        assertThat(cartItem.getCustomer()).isEqualTo(customer);
        assertThat(cartItem.getProduct()).isEqualTo(product);
        assertThat(cartItem.getQuantity()).isEqualTo(2);
        assertThat(cartItem.getShippingCost()).isEqualTo(15.99f);

        assertThat(cartItem.toString()).contains("John Doe", "Laptop", "2");

        assertThat(cartItem.getSubtotal()).isEqualTo(999.99f * 2);
    }
}
