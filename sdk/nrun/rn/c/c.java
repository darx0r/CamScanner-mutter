package sdk.nrun.rn.c;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import sdk.nrun.rn.aa;

public class c
{
  private byte[] a = { 80, 75, 5, 6 };
  private String b;
  private String c;

  public c(String paramString)
  {
    this.b = paramString;
  }

  private String a(RandomAccessFile paramRandomAccessFile)
  {
    paramRandomAccessFile.readByte();
    paramRandomAccessFile.readByte();
    paramRandomAccessFile.readByte();
    paramRandomAccessFile.readByte();
    paramRandomAccessFile.readByte();
    paramRandomAccessFile.readByte();
    paramRandomAccessFile.readByte();
    paramRandomAccessFile.readByte();
    paramRandomAccessFile.readByte();
    paramRandomAccessFile.readByte();
    paramRandomAccessFile.readByte();
    paramRandomAccessFile.readByte();
    paramRandomAccessFile.readByte();
    paramRandomAccessFile.readByte();
    paramRandomAccessFile.readByte();
    paramRandomAccessFile.readByte();
    int i = paramRandomAccessFile.readByte() & 0xFF | (paramRandomAccessFile.readByte() & 0xFF) << 8;
    if (i <= 0)
      throw new IOException(aa.a("IwMHUywoDBkXUBMYCBwGVkZFPQMA"));
    byte[] arrayOfByte = new byte[i];
    paramRandomAccessFile.read(arrayOfByte, 0, arrayOfByte.length);
    return new String(arrayOfByte);
  }

  private boolean a(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool = true;
    int i = 0;
    while (i < 4)
    {
      if (paramInt + i >= paramArrayOfByte.length)
        return false;
      if (paramArrayOfByte[(paramInt + i)] != this.a[i])
        bool = false;
      i += 1;
    }
    return bool;
  }

  private long b(RandomAccessFile paramRandomAccessFile)
  {
    byte[] arrayOfByte = new byte[256];
    int i = 0;
    while (true)
    {
      long l2 = 256 * i + 256L;
      if (l2 >= paramRandomAccessFile.length())
        return -1L;
      long l1 = l2;
      if (i != 0)
        l1 = l2 - 8L;
      paramRandomAccessFile.seek(paramRandomAccessFile.length() - 1L - l1);
      paramRandomAccessFile.read(arrayOfByte, 0, arrayOfByte.length);
      int j = 0;
      while (true)
      {
        if ((j >= 256) || (a(arrayOfByte, j)))
        {
          if (j == 256)
            break;
          return l1 - j;
        }
        j += 1;
      }
      i += 1;
    }
  }

  private String b()
  {
    RandomAccessFile localRandomAccessFile = new RandomAccessFile(new File(this.b), aa.a("Pxs="));
    long l = b(localRandomAccessFile);
    localRandomAccessFile.seek(localRandomAccessFile.length() - 1L - l);
    Object localObject = new byte[4];
    localRandomAccessFile.read((byte[])localObject, 0, localObject.length);
    if (a((byte[])localObject, 0))
    {
      localObject = a(localRandomAccessFile);
      localRandomAccessFile.close();
      return localObject;
    }
    localRandomAccessFile.close();
    throw new IOException(aa.a("IwMHUywoDBkXUAoeFVEAV18IKAIH"));
  }

  public String a()
  {
    if (this.c != null)
      return this.c;
    String str = b();
    this.c = str;
    return str;
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.c.c
 * JD-Core Version:    0.6.2
 */
 aa.a("IwMHUywoDBkXUBMYCBwGVkZFPQMA") -> not found comment pos

 aa.a("Pxs=") -> 

 aa.a("IwMHUywoDBkXUAoeFVEAV18IKAIH") -> not found zip comment
