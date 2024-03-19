package com.team4.ecommerce;

import com.team4.ecommerce.entity.product.Product;
import com.team4.ecommerce.entity.product.ProductImage;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductImageTests {

    @Test
    public void testCreateNewProductImage() {
        Product product = new Product();
        product.setId(1);
        product.setName("Smartphone");

        ProductImage productImage = new ProductImage("image1.jpg", product);

        assertThat(productImage.getName()).isEqualTo("image1.jpg");
        assertThat(productImage.getProduct()).isEqualTo(product);

        String expectedPath = Constants.S3_BASE_URI + "/product-images/1/extras/image1.jpg";
        assertThat(productImage.getImagePath()).isEqualTo(expectedPath);
    }

    @Test
    public void testSetProductImage() {
        Product product = new Product();
        product.setId(2);
        ProductImage productImage = new ProductImage();
        productImage.setName("image2.jpg");
        productImage.setProduct(product);


        assertThat(productImage.getProduct()).isEqualTo(product);
        assertThat(productImage.getProduct().getId()).isEqualTo(2);


        String expectedNewPath = Constants.S3_BASE_URI + "/product-images/2/extras/image2.jpg";
        assertThat(productImage.getImagePath()).isEqualTo(expectedNewPath);
    }
}
