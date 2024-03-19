package com.team4.ecommerce;

import com.team4.ecommerce.entity.product.Product;
import com.team4.ecommerce.entity.product.ProductDetail;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductDetailTests {

    @Test
    public void testCreateNewProductDetail() {
        Product product = new Product();
        product.setName("Smartphone");


        ProductDetail productDetail = new ProductDetail();
        productDetail.setName("Color");
        productDetail.setValue("Black");
        productDetail.setProduct(product);


        assertThat(productDetail.getName()).isEqualTo("Color");
        assertThat(productDetail.getValue()).isEqualTo("Black");
        assertThat(productDetail.getProduct()).isEqualTo(product);

        ProductDetail newDetail = new ProductDetail("Storage", "256GB", product);
        assertThat(newDetail.getName()).isEqualTo("Storage");
        assertThat(newDetail.getValue()).isEqualTo("256GB");
        assertThat(newDetail.getProduct()).isEqualTo(product);

        ProductDetail detailWithId = new ProductDetail(1, "Screen Size", "6 inches", product);
        assertThat(detailWithId.getId()).isEqualTo(1);
        assertThat(detailWithId.getName()).isEqualTo("Screen Size");
        assertThat(detailWithId.getValue()).isEqualTo("6 inches");
        assertThat(detailWithId.getProduct()).isEqualTo(product);
    }
}
