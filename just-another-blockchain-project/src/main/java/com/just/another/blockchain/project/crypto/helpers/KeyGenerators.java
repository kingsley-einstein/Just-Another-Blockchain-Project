package com.just.another.blockchain.project.crypto.helpers;

import com.just.another.blockchain.project.constants.Constants;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.spec.ECParameterSpec;

public class KeyGenerators {

  public static KeyPair generateKeyPair()
    throws InvalidAlgorithmParameterException, NoSuchAlgorithmException {
    ECParameterSpec ecParameterSpec = ECNamedCurveTable.getParameterSpec(Constants.EC_NAMED_CURVE);
    try {
      KeyPairGenerator kpg = KeyPairGenerator.getInstance(Constants.KEY_FACTORY_ALGORITHM);
      kpg.initialize(ecParameterSpec);

      return kpg.genKeyPair();
    } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException exc) {
      throw exc;
    }
  }
}
