package com.hubert.ietrash.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashingUtils {

    public static MessageDigest getHashingAlogirthm(String name) {
        try {
            return MessageDigest.getInstance(name);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

}