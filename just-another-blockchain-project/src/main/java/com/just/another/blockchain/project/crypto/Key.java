package com.just.another.blockchain.project.crypto;

import java.math.BigInteger;

public abstract class Key {

  String value;
  BigInteger asBigInteger;
  String entropy;

  protected Key(String value, String entropy, int radix) {
    this.value = value;
    this.entropy = entropy;
    this.asBigInteger = new BigInteger(this.value, radix);
  }
}
