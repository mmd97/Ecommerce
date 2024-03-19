package com.team4.ecommerce;

import com.team4.ecommerce.entity.Country;
import com.team4.ecommerce.entity.ShippingRate;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ShippingRateTests {

    @Test
    public void testCreateNewShippingRate() {
        Country country = new Country();
        country.setName("United States");

        ShippingRate shippingRate = new ShippingRate();
        shippingRate.setRate(5.99f);
        shippingRate.setDays(3);
        shippingRate.setCodSupported(true);
        shippingRate.setCountry(country);
        shippingRate.setState("California");

        assertThat(shippingRate.getRate()).isEqualTo(5.99f);
        assertThat(shippingRate.getDays()).isEqualTo(3);
        assertThat(shippingRate.isCodSupported()).isTrue();
        assertThat(shippingRate.getCountry()).isEqualTo(country);
        assertThat(shippingRate.getState()).isEqualTo("California");

        assertThat(shippingRate.toString()).contains("5.99", "3", "true", "United States", "California");
    }
}
