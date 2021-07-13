package com.just.another.blockchain.project.core.helpers;

import java.math.BigInteger;

import com.just.another.blockchain.project.core.Address;

public class AddressBuilder {
  public static Address fromHex(String hex) {
    return new Address(hex);
  }

  public static Address fromBigInteger(BigInteger i) {
    return new Address(i.toString(16));
  }
}
