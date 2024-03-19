package com.team4.ecommerce;

import com.team4.ecommerce.entity.Category;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CategoryTests {

    @Test
    public void testCreateNewCategory() {
        Category category = new Category("Electronics");
        assertThat(category.getName()).isEqualTo("Electronics");
    }
}