package sdk.nrun.rn;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class n
{
  private static Random a = new Random();

  private static int b(Map<Integer, Integer> paramMap, int paramInt)
  {
    int i = paramInt;
    if (paramMap.containsKey(Integer.valueOf(paramInt)))
      i = ((Integer)paramMap.get(Integer.valueOf(paramInt))).intValue();
    return i;
  }

  private static Map<Integer, Integer> b(int paramInt)
  {
    HashMap localHashMap = new HashMap();
    Random localRandom = new Random(paramInt);
    ArrayList localArrayList = new ArrayList();
    for (paramInt = -128; paramInt < 127; paramInt = (byte)(paramInt + 1))
      if (paramInt != -1)
        localArrayList.add(Integer.valueOf(paramInt));
    localArrayList.add(Integer.valueOf(127));
    while (localArrayList.size() > 1)
    {
      paramInt = localRandom.nextInt(localArrayList.size() - 1) + 1;
      localHashMap.put(localArrayList.get(0), localArrayList.get(paramInt));
      localHashMap.put(localArrayList.get(paramInt), localArrayList.get(0));
      localArrayList.remove(paramInt);
      localArrayList.remove(0);
    }
    if (localArrayList.size() != 0)
      localHashMap.put(localArrayList.get(0), localArrayList.get(0));
    return localHashMap;
  }

  public static class a extends InputStream
  {
    private InputStream a;
    private Map<Integer, Integer> b;

    public a(InputStream paramInputStream, int paramInt)
    {
      this.a = paramInputStream;
      paramInputStream = new DataInputStream(paramInputStream);
      paramInt = paramInputStream.readInt() ^ paramInt;
      paramInputStream.skipBytes((paramInputStream.readByte() ^ paramInt) & 0xFF);
      this.b = n.a(paramInt);
    }

    public int read()
    {
      return n.a(this.b, this.a.read());
    }

    public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      paramInt2 = this.a.read(paramArrayOfByte, paramInt1, paramInt2);
      while (paramInt1 < paramInt2)
      {
        paramArrayOfByte[paramInt1] = ((byte)n.a(this.b, paramArrayOfByte[paramInt1]));
        paramInt1 += 1;
      }
      return paramInt2;
    }
  }

  public static class b extends InputStream
  {
    private InputStream a;
    private Map<Integer, Integer> b;

    public b(InputStream paramInputStream, int paramInt)
    {
      this.a = paramInputStream;
      this.b = n.a(new DataInputStream(paramInputStream).readInt() ^ paramInt);
    }

    public int read()
    {
      return n.a(this.b, this.a.read());
    }

    public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      paramInt2 = this.a.read(paramArrayOfByte, paramInt1, paramInt2);
      while (paramInt1 < paramInt2)
      {
        paramArrayOfByte[paramInt1] = ((byte)n.a(this.b, paramArrayOfByte[paramInt1]));
        paramInt1 += 1;
      }
      return paramInt2;
    }
  }

  public static class c extends OutputStream
  {
    private OutputStream a;
    private Map<Integer, Integer> b;

    public c(OutputStream paramOutputStream, int paramInt)
    {
      this.a = paramOutputStream;
      paramOutputStream = new DataOutputStream(paramOutputStream);
      int i = (int)System.nanoTime();
      this.b = n.a(i);
      paramOutputStream.writeInt(i ^ paramInt);
    }

    public void write(int paramInt)
    {
      this.a.write(n.a(this.b, paramInt));
    }

    public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      int i = paramInt1;
      while (i < paramInt2)
      {
        paramArrayOfByte[i] = ((byte)n.a(this.b, paramArrayOfByte[i]));
        i += 1;
      }
      this.a.write(paramArrayOfByte, paramInt1, paramInt2);
    }
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.n
 * JD-Core Version:    0.6.2
 */