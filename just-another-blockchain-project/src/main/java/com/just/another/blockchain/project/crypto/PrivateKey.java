package com.just.another.blockchain.project.crypto;

public class PrivateKey extends Key {

  public PrivateKey(String value, String entropy, int radix) {
    super(value, entropy, radix);
  }

  public String getValue() {
    return this.value;
  }
}
