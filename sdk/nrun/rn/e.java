package sdk.nrun.rn;

import java.io.InputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class e
{
  public static InputStream a(InputStream paramInputStream, byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new DESKeySpec(paramArrayOfByte);
    paramArrayOfByte = SecretKeyFactory.getInstance(aa.a("CSkg")).generateSecret(paramArrayOfByte);
    Cipher localCipher = Cipher.getInstance(aa.a("CSkgXA8EO1g9HyAWARUKVlU="));
    localCipher.init(2, paramArrayOfByte);
    return new CipherInputStream(paramInputStream, localCipher);
  }

  private static byte[] a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return null;
    return (byte[])paramArrayOfByte.clone();
  }

  private static byte[] a(byte[] paramArrayOfByte, byte paramByte)
  {
    byte[] arrayOfByte = new byte[8 - paramArrayOfByte.length % 8];
    int i = 0;
    while (i < arrayOfByte.length)
    {
      arrayOfByte[i] = paramByte;
      i += 1;
    }
    return c(paramArrayOfByte, arrayOfByte);
  }

  public static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    paramArrayOfByte1 = a(paramArrayOfByte1, (byte)0);
    paramArrayOfByte2 = SecretKeyFactory.getInstance(aa.a("CQkA")).generateSecret(new DESKeySpec(paramArrayOfByte2));
    Cipher localCipher = Cipher.getInstance(aa.a("CQkAXA8EO1g9HyAWARUKVlU="));
    localCipher.init(1, paramArrayOfByte2);
    return localCipher.doFinal(paramArrayOfByte1);
  }

  public static byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    paramArrayOfByte2 = new DESKeySpec(paramArrayOfByte2);
    paramArrayOfByte2 = SecretKeyFactory.getInstance(aa.a("CQkA")).generateSecret(paramArrayOfByte2);
    Cipher localCipher = Cipher.getInstance(aa.a("CQkAXA8EO1g9HyAWARUKVlU="));
    localCipher.init(2, paramArrayOfByte2);
    return localCipher.doFinal(paramArrayOfByte1);
  }

  private static byte[] c(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1 == null)
      return a(paramArrayOfByte2);
    if (paramArrayOfByte2 == null)
      return a(paramArrayOfByte1);
    byte[] arrayOfByte = new byte[paramArrayOfByte1.length + paramArrayOfByte2.length];
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 0, paramArrayOfByte1.length);
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, paramArrayOfByte1.length, paramArrayOfByte2.length);
    return arrayOfByte;
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.e
 * JD-Core Version:    0.6.2
 */
 aa.a("CSkg") -> DES

 aa.a("CSkgXA8EO1g9HyAWARUKVlU=") -> DES/ECB/NoPaddi

 aa.a("CQkA") -> Des

 aa.a("CQkAXA8EO1g9HyAWARUKVlU=") -> Des/ECB/NoPaddi

 aa.a("CQkA") -> Des

 aa.a("CQkAXA8EO1g9HyAWARUKVlU=") -> Des/ECB/NoPaddi
