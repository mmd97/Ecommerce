package com.team4.ecommerce;

import com.team4.ecommerce.entity.Country;
import com.team4.ecommerce.entity.Customer;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Date;

public class CustomerTests {

    @Test
    public void testCreateNewCustomer() {
        Customer customer = new Customer();
        customer.setEmail("john.doe@example.com");
        customer.setPassword("SecurePassword123");
        customer.setVerificationCode("123456");
        customer.setEnabled(true);
        customer.setCreatedTime(new Date());
        customer.setResetPasswordToken("ResetToken123");

        customer.setFirstName("John");
        customer.setLastName("Doe");
        customer.setCountry(new Country(1, "United States", "US"));

        assertThat(customer.getEmail()).isEqualTo("john.doe@example.com");
        assertThat(customer.getPassword()).isEqualTo("SecurePassword123");
        assertThat(customer.getVerificationCode()).isEqualTo("123456");
        assertThat(customer.isEnabled()).isTrue();
        assertThat(customer.getCreatedTime()).isNotNull();
        assertThat(customer.getResetPasswordToken()).isEqualTo("ResetToken123");
        assertThat(customer.getFullName()).isEqualTo("John Doe");
        assertThat(customer.getCountry().getName()).isEqualTo("United States");

    }
}
