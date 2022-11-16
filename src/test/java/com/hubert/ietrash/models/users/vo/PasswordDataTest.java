package com.hubert.ietrash.models.users.vo;

import com.hubert.ietrash.models.user.vo.PasswordData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordDataTest {

    @Test
    public void testFromPlain() {
        PasswordData passwordData = PasswordData.fromPlain("test");
        assertNotSame(passwordData.passwordHash(), "test");
    }

    @Test
    public void testMatchingPassword() {
        PasswordData passwordData = PasswordData.fromPlain("test");

        assertTrue(passwordData.isValid("test"));
    }

}