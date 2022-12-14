package com.hubert.ietrash.models.user;

import com.hubert.ietrash.models.amount.Amount;
import com.hubert.ietrash.models.user.vo.PasswordData;
import com.hubert.ietrash.models.user.vo.UserName;

import java.util.UUID;

public class User {
  private UUID uuid;
  private UserName userName;
  private PasswordData passwordData;
  private Amount amount;
}