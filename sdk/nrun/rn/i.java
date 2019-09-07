package sdk.nrun.rn;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class i
{
  public abstract void a(d paramd, c paramc);

  public static abstract class a
    implements i.c
  {
    public void a()
    {
    }

    public void a(Exception paramException)
    {
    }

    public void a(i.d paramd)
    {
    }

    public boolean a(long paramLong1, long paramLong2)
    {
      return false;
    }
  }

  public static class b extends i
  {
    private boolean a(InputStream paramInputStream, OutputStream paramOutputStream, long paramLong, i.c paramc)
    {
      long l1 = 0L;
      byte[] arrayOfByte = new byte[4096];
      long l2;
      do
      {
        do
        {
          int i = paramInputStream.read(arrayOfByte, 0, arrayOfByte.length);
          if (i <= 0)
            break;
          paramOutputStream.write(arrayOfByte, 0, i);
          paramOutputStream.flush();
          l2 = l1 + i;
          l1 = l2;
        }
        while (paramc == null);
        l1 = l2;
      }
      while (!paramc.a(paramLong, l2));
      return false;
      return true;
    }

    private void b(i.d paramd, i.c paramc)
    {
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(paramd.a()).openConnection();
      localHttpURLConnection.setRequestMethod(aa.a("Cikn"));
      localHttpURLConnection.setDoInput(true);
      localHttpURLConnection.setConnectTimeout(((Integer)paramd.a(aa.a("DgMdHS8kDSMaHRUYEAU="), Integer.valueOf(15000))).intValue());
      localHttpURLConnection.setReadTimeout(((Integer)paramd.a(aa.a("HwkSFx4uFBIcBQQ="), Integer.valueOf(180000))).intValue());
      localHttpURLConnection.setRequestProperty(aa.a("DgMdHS8kDR4cHg=="), aa.a("LgAcAC8="));
      localHttpURLConnection.setRequestProperty(aa.a("GB8WAWcGHhIdBA=="), aa.a("AAMJGiYrGFhHXkBXTRIMVUIEOQURHy98WTogOTVXUF9TAxIyJAIXHD00WTknS1AzDBYmQEZM"));
      Object localObject1 = paramd.d().keySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        localHttpURLConnection.setRequestProperty((String)localObject2, (String)paramd.d().get(localObject2));
      }
      int i = localHttpURLConnection.getResponseCode();
      localObject1 = (Set)paramd.a(aa.a("DA8QAz4EFhMWAw=="), new HashSet()
      {
      });
      if (!((Set)localObject1).contains(Integer.valueOf(i)))
        throw new IOException(aa.a("JRgHA2o1HAQDHx4EAFEKSxI=") + i + aa.a("bQIcB2ouF1c=") + localObject1);
      localObject1 = localHttpURLConnection.getInputStream();
      Object localObject2 = new File(paramd.b());
      if (!((File)localObject2).exists())
      {
        if ((((File)localObject2).getParentFile() != null) && (!((File)localObject2).getParentFile().exists()))
          ((File)localObject2).getParentFile().mkdirs();
        ((File)localObject2).createNewFile();
      }
      if (((Boolean)paramd.a(aa.a("BB88BS81EBMW"), Boolean.valueOf(true))).booleanValue())
        paramd = new FileOutputStream((File)localObject2);
      try
      {
        while (true)
        {
          if ((!a((InputStream)localObject1, paramd, localHttpURLConnection.getContentLength(), paramc)) && (paramc != null))
            paramc.a();
          ((InputStream)localObject1).close();
          paramd.close();
          localHttpURLConnection.disconnect();
          return;
          paramd = new FileOutputStream((File)localObject2, true);
        }
      }
      finally
      {
        ((InputStream)localObject1).close();
        paramd.close();
      }
      throw paramc;
    }

    public void a(final i.d paramd, final i.c paramc)
    {
      new Thread(new Runnable()
      {
        public void run()
        {
          try
          {
            i.b.a(i.b.this, paramd, paramc);
            if (paramc != null)
              paramc.a(paramd);
            return;
          }
          catch (Exception localException)
          {
            while (paramc == null);
            paramc.a(localException);
          }
        }
      }
      , aa.a("CQMEHSYoGBMnGAISBBU=")).start();
    }
  }

  public static abstract interface c
  {
    public abstract void a();

    public abstract void a(Exception paramException);

    public abstract void a(i.d paramd);

    public abstract boolean a(long paramLong1, long paramLong2);
  }

  public static class d
  {
    private String a;
    private String b;
    private Map<String, Object> c = new HashMap();
    private Map<String, String> d = new HashMap();

    public <T> T a(String paramString, T paramT)
    {
      paramString = c().get(paramString);
      if (paramString == null)
        return paramT;
      return paramString;
    }

    public String a()
    {
      return this.a;
    }

    public void a(String paramString)
    {
      this.a = paramString;
    }

    public String b()
    {
      return this.b;
    }

    public void b(String paramString)
    {
      this.b = paramString;
    }

    public Map<String, Object> c()
    {
      return this.c;
    }

    public Map<String, String> d()
    {
      return this.d;
    }
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.i
 * JD-Core Version:    0.6.2
 */
 aa.a("Cikn") -> GET

 aa.a("DgMdHS8kDSMaHRUYEAU=") -> ConnectTimeo

 aa.a("HwkSFx4uFBIcBQQ=") -> ReadTimeo

 aa.a("DgMdHS8kDR4cHg==") -> Connectio

 aa.a("LgAcAC8=") -> clo

 aa.a("GB8WAWcGHhIdBA==") -> User-Agen

 aa.a("AAMJGiYrGFhHXkBXTRIMVUIEOQURHy98WTogOTVXUF9TAxIyJAIXHD00WTknS1AzDBYmQEZM") -> Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)

 aa.a("DA8QAz4EFhMWAw==") -> AccptCode

 aa.a("JRgHA2o1HAQDHx4EAFEKSxI=") -> http response i

 aa.a("bQIcB2ouF1c=") ->  not i

 aa.a("BB88BS81EBMW") -> IsOveride

 aa.a("CQMEHSYoGBMnGAISBBU=") -> DownloadThre
