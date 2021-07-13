package com.just.another.blockchain.project.core;

import java.math.BigInteger;

public class TransactionValue implements java.io.Serializable {

  BigInteger actualValue;
  String hexValue;

  public TransactionValue() {}

  public TransactionValue(Coin coin) {
    this.actualValue = coin.value;
    this.hexValue = coin.hexValue;
  }

  public TransactionValue(String hexValue, int radix) {
    this(new Coin(hexValue, radix));
  }
}
