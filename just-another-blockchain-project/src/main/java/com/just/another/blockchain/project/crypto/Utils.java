package com.just.another.blockchain.project.crypto;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Utils {

  public static String digestToHex(byte[] bytes) throws NoSuchAlgorithmException {
    try {
      MessageDigest md = MessageDigest.getInstance("SHA256");
      StringBuilder res = new StringBuilder();
      byte[] bts = md.digest(bytes);

      for (byte b : bts) res.append(Integer.toHexString(b & 0xff));

      return res.toString();
    } catch (NoSuchAlgorithmException e) {
      throw e;
    }
  }
}
