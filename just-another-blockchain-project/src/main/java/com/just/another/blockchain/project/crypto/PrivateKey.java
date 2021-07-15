package com.just.another.blockchain.project.crypto;

public class PrivateKey extends Key {

  public PrivateKey(String value, int radix) {
    super(value, radix);
  }

  public String getValue() {
    return this.value;
  }

  static PrivateKey fromString(String value) {
    return new PrivateKey(value, 16);
  }
}
