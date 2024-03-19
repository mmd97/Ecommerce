package com.team4.ecommerce;

import com.team4.ecommerce.entity.User;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class UserTests {

	@Test
	public void testCreateNewUser() {
		User user = new User("t4@java.net", "t2024", "Jane", "Doe");

		assertThat(user.getEmail()).isEqualTo("t4@java.net");
		assertThat(user.getPassword()).isEqualTo("t2024");
		assertThat(user.getFirstName()).isEqualTo("Jane");
		assertThat(user.getLastName()).isEqualTo("Doe");
	}
}
