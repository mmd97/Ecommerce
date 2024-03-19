package com.team4.ecommerce;

import com.team4.ecommerce.entity.Country;
import com.team4.ecommerce.entity.State;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.HashSet;
import java.util.Set;

public class CountryTests {

    @Test
    public void testCreateNewCountry() {
        State state1 = new State();
        state1.setName("California");
        State state2 = new State();
        state2.setName("New York");

        Set<State> states = new HashSet<>();
        states.add(state1);
        states.add(state2);

        Country country = new Country();
        country.setId(1);
        country.setName("United States");
        country.setCode("US");


        assertThat(country.getName()).isEqualTo("United States");
        assertThat(country.getCode()).isEqualTo("US");


        assertThat(country.toString()).contains("United States", "US");
    }
}
