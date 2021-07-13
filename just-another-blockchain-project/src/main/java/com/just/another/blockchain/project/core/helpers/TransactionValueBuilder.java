package com.just.another.blockchain.project.core.helpers;

import com.just.another.blockchain.project.core.Coin;
import com.just.another.blockchain.project.core.TransactionValue;

public class TransactionValueBuilder {

  public static TransactionValue ONE = new TransactionValue(Coin.ONE);
  public static TransactionValue TWO = new TransactionValue(Coin.TWO);

  private TransactionValue value;

  public TransactionValueBuilder(TransactionValue value) {
    this.value = value;
  }

  public static TransactionValueBuilder fromHex(String hex) {
    TransactionValue value = new TransactionValue(hex, 16);
    return new TransactionValueBuilder(value);
  }

  public static TransactionValueBuilder fromCoin(Coin coin) {
    return new TransactionValueBuilder(new TransactionValue(coin));
  }

  public static TransactionValueBuilder fromPrimitive(long value) {
    return new TransactionValueBuilder(new TransactionValue(Coin.of(value)));
  }

  public TransactionValue build() {
    return value;
  }
}
