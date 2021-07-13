package com.just.another.blockchain.project.crypto;

public class PublicKey extends Key {

  public PublicKey(String value, String entropy, int radix) {
    super(value, entropy, radix);
  }

  public String getValue() {
    return this.value;
  }

  public String getEntropy() {
    return this.entropy;
  }
}
