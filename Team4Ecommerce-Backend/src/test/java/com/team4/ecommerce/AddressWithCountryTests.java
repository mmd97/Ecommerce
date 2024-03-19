package com.team4.ecommerce;

import com.team4.ecommerce.entity.AddressWithCountry;
import com.team4.ecommerce.entity.Country;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AddressWithCountryTests {

    @Test
    public void testCreateNewAddressWithCountry() {
        Country country = new Country();


        AddressWithCountry address = new AddressWithCountry();
        address.setFirstName("John");
        address.setLastName("Doe");
        address.setAddressLine1("123 Main St");
        address.setAddressLine2("Apt 4");
        address.setCity("Springfield");
        address.setState("IL");
        address.setCountry(country);
        address.setPostalCode("62704");
        address.setPhoneNumber("555-1234");


        assertThat(address.getFirstName()).isEqualTo("John");
        assertThat(address.getLastName()).isEqualTo("Doe");
        assertThat(address.getAddressLine1()).isEqualTo("123 Main St");
        assertThat(address.getAddressLine2()).isEqualTo("Apt 4");
        assertThat(address.getCity()).isEqualTo("Springfield");
        assertThat(address.getState()).isEqualTo("IL");
        assertThat(address.getCountry()).isEqualTo(country);
        assertThat(address.getPostalCode()).isEqualTo("62704");
        assertThat(address.getPhoneNumber()).isEqualTo("555-1234");


        assertThat(address.toString()).contains("John Doe, 123 Main St, Apt 4, Springfield, IL, USA. Postal Code: 62704. Phone Number: 555-1234");
    }
}
