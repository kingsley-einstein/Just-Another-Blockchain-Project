package com.just.another.blockchain.project.core;

public class Transaction implements java.io.Serializable {

  public Address sender;
  public Address recipient;
  public TransactionValue amount;
  public Long timestamp;
  public Boolean isCoinBase;
}
