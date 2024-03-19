package com.team4.ecommerce;

import com.team4.ecommerce.entity.Brand;
import com.team4.ecommerce.entity.Category;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.HashSet;
import java.util.Set;

public class BrandTests {

    @Test
    public void testCreateNewBrand() {

        Category category1 = new Category();
        Category category2 = new Category();
        Set<Category> categories = new HashSet<>();
        categories.add(category1);
        categories.add(category2);


        Brand brand = new Brand();
        brand.setId(1);
        brand.setName("Electronics");
        brand.setLogo("electronics-logo.png");
        brand.setCategories(categories);


        assertThat(brand.getId()).isEqualTo(1);
        assertThat(brand.getName()).isEqualTo("Electronics");
        assertThat(brand.getLogo()).isEqualTo("electronics-logo.png");
        assertThat(brand.getCategories()).hasSize(2).containsExactlyInAnyOrder(category1, category2);


        assertThat(brand.toString()).contains("Electronics");


        assertThat(brand.getLogoPath()).isEqualTo(Constants.S3_BASE_URI + "/brand-logos/" + brand.getId() + "/" + brand.getLogo());
    }
}
