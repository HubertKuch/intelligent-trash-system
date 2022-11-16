package com.hubert.ietrash.models.user.vo;

import com.hubert.ietrash.utils.HashingUtils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public record PasswordData(
    String passwordHash
) {
    public static PasswordData fromPlain(String plain) {
        MessageDigest messageDigest = HashingUtils.getHashingAlogirthm("SHA-256");

        return new PasswordData(new String(messageDigest.digest(plain.getBytes(StandardCharsets.UTF_8))));
    }

    public boolean isValid(String password) {
        return passwordHash.equals(fromPlain(password).passwordHash);
    }

}