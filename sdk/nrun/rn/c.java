package sdk.nrun.rn;

import android.os.Build;
import android.util.Base64;

public class c
{
  public static String a(String paramString)
  {
    return Build.MODEL + paramString;
  }

  public static final String a(byte[] paramArrayOfByte, String paramString)
  {
    paramString = a(paramString);
    try
    {
      paramArrayOfByte = Base64.encodeToString(e.a(paramArrayOfByte, paramString.getBytes()), 0);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      x.a().a(paramArrayOfByte);
    }
    return null;
  }

  public static final String b(byte[] paramArrayOfByte, String paramString)
  {
    return new String(c(paramArrayOfByte, paramString)).trim();
  }

  public static final byte[] c(byte[] paramArrayOfByte, String paramString)
  {
    try
    {
      paramString = a(paramString);
      paramArrayOfByte = e.b(Base64.decode(paramArrayOfByte, 0), paramString.getBytes());
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      x.a().a(paramArrayOfByte);
    }
    return null;
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.c
 * JD-Core Version:    0.6.2
 */