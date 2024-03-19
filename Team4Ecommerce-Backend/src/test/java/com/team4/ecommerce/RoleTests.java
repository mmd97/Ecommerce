package com.team4.ecommerce;

import com.team4.ecommerce.entity.Role;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RoleTests {

    @Test
    public void testCreateNewRole() {
        Role role = new Role("Admin", "Administrator role with all permissions");

        assertThat(role.getName()).isEqualTo("Admin");
        assertThat(role.getDescription()).isEqualTo("Administrator role with all permissions");

        assertThat(role.toString()).isEqualTo("Admin");
    }
}
