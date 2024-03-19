package com.team4.ecommerce;

import com.team4.ecommerce.entity.Review;
import com.team4.ecommerce.entity.User;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ReviewTests {

    @Test
    public void testCreateNewReview() {
        User user = new User();
        Review review = new Review();
        assertThat(review.getComment()).isEqualTo("Excellent product");
        assertThat(review.getRating()).isEqualTo(5);
    }
}