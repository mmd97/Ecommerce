package com.team4.ecommerce;

import com.team4.ecommerce.entity.Address;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AddressTests {

    @Test
    public void testCreateNewAddress() {
        Address address = new Address();
        assertThat(address.getCity()).isEqualTo("City");
        assertThat(address.getState()).isEqualTo("State");
        assertThat(address.getCountry()).isEqualTo("Country");
    }
}