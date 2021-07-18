package com.just.another.blockchain.project.crypto;

import java.math.BigInteger;

public abstract class Key {

  String value;
  BigInteger asBigInteger;

  protected Key(String value, int radix) {
    this.value = value;
    this.asBigInteger = new BigInteger(this.value, radix);
  }
}
