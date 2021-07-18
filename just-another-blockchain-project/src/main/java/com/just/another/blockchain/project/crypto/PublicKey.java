package com.just.another.blockchain.project.crypto;

public class PublicKey extends Key {

  public PublicKey(String value, int radix) {
    super(value, radix);
  }

  public String getValue() {
    return this.value;
  }
}
