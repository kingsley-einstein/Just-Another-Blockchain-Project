package com.just.another.blockchain.project.core;

import java.math.BigInteger;

public class Address implements java.io.Serializable {
  private String asHex;
  private BigInteger asBigInteger;

  public Address() {}

  public Address(String hexValue) {
    this.asHex = hexValue;
    this.asBigInteger = new BigInteger(this.asHex, 16);
  }

  public String getAsHex() {
    return asHex;
  }

  public BigInteger getAsBigInteger() {
    return asBigInteger;
  }
}
