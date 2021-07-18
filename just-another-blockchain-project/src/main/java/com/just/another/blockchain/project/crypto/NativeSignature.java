package com.just.another.blockchain.project.crypto;

import com.just.another.blockchain.project.constants.Constants;
import com.just.another.blockchain.project.core.Transaction;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.jce.spec.ECPrivateKeySpec;

public class NativeSignature implements java.io.Serializable {

  public String value;
  public String key_factory_algorithm = Constants.KEY_FACTORY_ALGORITHM;
  public String ec_named_curve = Constants.EC_NAMED_CURVE;
  public String signing_algorithm = Constants.SIGNING_ALGORITHM;

  public NativeSignature() {
    // Empty for JSON serialization
  }

  public NativeSignature(Transaction transaction, PrivateKey key) {
    String transactionAsString =
      transaction.sender.getAsHex() +
      transaction.recipient.getAsHex() +
      transaction.timestamp +
      transaction.amount.hexValue;
    ECParameterSpec ecParameterSpec = ECNamedCurveTable.getParameterSpec(ec_named_curve);
    ECPrivateKeySpec ecPrivateKeySpec = new ECPrivateKeySpec(
      new BigInteger(key.value, 16),
      ecParameterSpec
    );
    try {
      KeyFactory keyFactory = KeyFactory.getInstance(key_factory_algorithm);
      java.security.PrivateKey privateKey = keyFactory.generatePrivate(ecPrivateKeySpec);
      Signature signature = Signature.getInstance(signing_algorithm);
      signature.initSign(privateKey);
      signature.update(transactionAsString.getBytes());

      this.value = Utils.digestToHex(signature.sign());
    } catch (
      NoSuchAlgorithmException
      | InvalidKeySpecException
      | InvalidKeyException
      | SignatureException e
    ) {
      e.printStackTrace();
    }
  }
}
