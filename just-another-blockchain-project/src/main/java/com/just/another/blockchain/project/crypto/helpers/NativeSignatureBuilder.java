package com.just.another.blockchain.project.crypto.helpers;

import com.just.another.blockchain.project.core.Transaction;
import com.just.another.blockchain.project.crypto.NativeSignature;
import com.just.another.blockchain.project.crypto.PrivateKey;

public class NativeSignatureBuilder {

  private PrivateKey key;
  private Transaction transaction;

  private NativeSignatureBuilder(PrivateKey key) {
    this.key = key;
  }

  private NativeSignatureBuilder(PrivateKey key, Transaction transaction) {
    this(key);
    this.transaction = transaction;
  }

  public static NativeSignatureBuilder fromPrivateKey(PrivateKey key) {
    return new NativeSignatureBuilder(key, null);
  }

  public NativeSignatureBuilder transaction(Transaction transaction) {
    return new NativeSignatureBuilder(this.key, transaction);
  }

  public NativeSignature build() {
    return new NativeSignature(this.transaction, this.key);
  }
}
