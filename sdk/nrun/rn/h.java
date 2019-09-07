package sdk.nrun.rn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;

public class h
{
  public static String a(String paramString)
  {
    return a(paramString.getBytes());
  }

  public static String a(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder;
    try
    {
      paramArrayOfByte = MessageDigest.getInstance(aa.a("AChG")).digest(paramArrayOfByte);
      localStringBuilder = new StringBuilder(paramArrayOfByte.length * 2);
      int j = paramArrayOfByte.length;
      int i = 0;
      while (i < j)
      {
        int k = paramArrayOfByte[i];
        if ((k & 0xFF) < 16)
          localStringBuilder.append(aa.a("fQ=="));
        localStringBuilder.append(Integer.toHexString(k & 0xFF));
        i += 1;
      }
    }
    catch (Exception paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      return null;
    }
    return localStringBuilder.toString();
  }

  public static boolean a(String paramString, File paramFile)
  {
    try
    {
      boolean bool = paramString.equals(a(m.c(new FileInputStream(paramFile))));
      return bool;
    }
    catch (IOException paramString)
    {
    }
    return false;
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.h
 * JD-Core Version:    0.6.2
 */
 aa.a("AChG") -> MD5

 aa.a("fQ==") -> 
