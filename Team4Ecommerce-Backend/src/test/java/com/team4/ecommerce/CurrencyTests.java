package com.team4.ecommerce;

import com.team4.ecommerce.entity.Currency;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CurrencyTests {

    @Test
    public void testCreateNewCurrency() {
        Currency currency = new Currency("United States Dollar", "$", "USD");

        assertThat(currency.getName()).isEqualTo("United States Dollar");
        assertThat(currency.getSymbol()).isEqualTo("$");
        assertThat(currency.getCode()).isEqualTo("USD");

        assertThat(currency.toString()).isEqualTo("United States Dollar - USD - $");
    }
}
