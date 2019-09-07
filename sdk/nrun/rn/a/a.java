package sdk.nrun.rn.a;

import java.io.UnsupportedEncodingException;

public final class a
{
  private static byte[] a(byte[] paramArrayOfByte, String paramString)
  {
    int m = paramArrayOfByte.length;
    int n = paramString.length();
    int i = 0;
    int j = 0;
    while (j < m)
    {
      int k = i;
      if (i >= n)
        k = 0;
      paramArrayOfByte[j] = ((byte)(paramArrayOfByte[j] ^ paramString.charAt(k)));
      j += 1;
      i = k + 1;
    }
    return paramArrayOfByte;
  }

  public String a(String paramString1, String paramString2)
  {
    try
    {
      String str = new String(a(sdk.nrun.rn.a.a(paramString1, 2), paramString2), "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    return new String(a(sdk.nrun.rn.a.a(paramString1, 2), paramString2));
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.a.a
 * JD-Core Version:    0.6.2
 */