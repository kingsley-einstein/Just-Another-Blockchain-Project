package com.just.another.blockchain.project.core;

public class Transaction {

  Address sender;
  Address recipient;
  TransactionValue amount;
  Long timestamp;
  Boolean isCoinBase;
}
