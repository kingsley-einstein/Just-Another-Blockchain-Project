package com.just.another.blockchain.project.core;

import java.math.BigInteger;

public class Coin {

  BigInteger value;
  String hexValue;
  public static Coin ONE = new Coin(BigInteger.ONE);
  public static Coin TWO = new Coin(BigInteger.TWO);

  private Coin(BigInteger value) {
    this(value.toString(16), 16);
  }

  public Coin(String value, int radix) {
    this.value = new BigInteger(value, radix);
    this.hexValue = this.value.toString(16);
  }

  public static Coin of(long value) {
    return new Coin(BigInteger.valueOf(value));
  }
}
