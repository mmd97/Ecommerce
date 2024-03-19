package com.team4.ecommerce;

import com.team4.ecommerce.entity.Customer;
import com.team4.ecommerce.entity.Review;
import com.team4.ecommerce.entity.ReviewVote;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ReviewVoteTests {

    @Test
    public void testCreateNewReviewVote() {
        Customer customer = new Customer();
        customer.setFirstName("Jane");
        customer.setLastName("Doe");

        Review review = new Review();
        review.setId(1);


        ReviewVote reviewVoteUp = new ReviewVote();
        reviewVoteUp.setCustomer(customer);
        reviewVoteUp.setReview(review);
        reviewVoteUp.voteUp();

        ReviewVote reviewVoteDown = new ReviewVote();
        reviewVoteDown.setCustomer(customer);
        reviewVoteDown.setReview(review);
        reviewVoteDown.voteDown();


        assertThat(reviewVoteUp.getCustomer()).isEqualTo(customer);
        assertThat(reviewVoteUp.getReview()).isEqualTo(review);
        assertThat(reviewVoteUp.isUpvoted()).isTrue();
        assertThat(reviewVoteUp.isDownvoted()).isFalse();


        assertThat(reviewVoteDown.getCustomer()).isEqualTo(customer);
        assertThat(reviewVoteDown.getReview()).isEqualTo(review);
        assertThat(reviewVoteDown.isUpvoted()).isFalse();
        assertThat(reviewVoteDown.isDownvoted()).isTrue();


        assertThat(reviewVoteUp.toString()).contains("1", "Jane Doe");
        assertThat(reviewVoteDown.toString()).contains("-1", "Jane Doe");
    }
}
