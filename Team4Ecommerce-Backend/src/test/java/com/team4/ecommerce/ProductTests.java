package com.team4.ecommerce;

import com.team4.ecommerce.entity.product.Product;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductTests {

    @Test
    public void testCreateNewProduct() {
        Product product = new Product();
        assertThat(product.getName()).isEqualTo("Laptop");
        assertThat(product.getPrice()).isEqualTo(999.99);
    }
}