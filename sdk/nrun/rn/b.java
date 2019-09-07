package sdk.nrun.rn;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import android.text.TextUtils;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b
{
  private static ExecutorService a = Executors.newFixedThreadPool(1);
  private static String o;
  private static Context p;
  private static SSLContext q;
  private JSONObject b;
  private String c;
  private String d;
  private Context e;
  private String f;
  private String g;
  private String h;
  private String i;
  private String j;
  private String k;
  private String l;
  private String m;
  private long n;

  private b()
  {
  }

  private b(Context paramContext)
  {
    this.e = paramContext;
    k localk = k.a(paramContext);
    this.k = ((String)localk.a(aa.a("CQkFGikiMDM="), ""));
    this.d = k();
    if (TextUtils.isEmpty(this.k))
    {
      this.k = k();
      localk.a(aa.a("CQkFGikiMDM="), this.k);
    }
    this.h = d(paramContext);
    this.l = f(paramContext);
    b(w.a(paramContext).a());
    c(w.a(paramContext).b());
    this.n = System.currentTimeMillis();
  }

  private HttpURLConnection a(URL paramURL)
  {
    if (paramURL.getProtocol().equals(aa.a("JRgHAw==")))
      return (HttpURLConnection)paramURL.openConnection();
    paramURL = (HttpsURLConnection)paramURL.openConnection();
    paramURL.setHostnameVerifier(new HostnameVerifier()
    {
      public boolean verify(String paramAnonymousString, SSLSession paramAnonymousSSLSession)
      {
        return true;
      }
    });
    if (q == null)
    {
      q = SSLContext.getInstance(aa.a("GSAg"));
      SSLContext localSSLContext = q;
      a locala = new a(null);
      SecureRandom localSecureRandom = new SecureRandom();
      localSSLContext.init(null, new TrustManager[] { locala }, localSecureRandom);
    }
    paramURL.setSSLSocketFactory(q.getSocketFactory());
    return paramURL;
  }

  private boolean a(b paramb)
  {
    int i1;
    label370: 
    do
    {
      Object localObject1;
      try
      {
        JSONArray localJSONArray = new JSONArray();
        localObject1 = new StringBuilder();
        Object localObject2 = new ArrayList();
        ((List)localObject2).add(paramb);
        paramb = ((List)localObject2).iterator();
        for (i1 = 0; paramb.hasNext(); i1 = 1)
        {
          localObject2 = (b)paramb.next();
          ((b)localObject2).a(this.e);
          localObject2 = ((b)localObject2).l();
          localJSONArray.put(localObject2);
          ((StringBuilder)localObject1).append(localObject2 + "\n");
        }
        x.a().c(aa.a("OR4KUzkiFxNT") + localObject1 + "");
        if (localJSONArray.length() <= 0)
          return false;
        localObject1 = (String)w.a(this.e).a(aa.a("DCggLA4GLTY2JjU5MS42an4="), "");
        paramb = (b)localObject1;
        if ("".equals(((String)localObject1).trim()))
        {
          if (z.c)
            paramb = w.a(this.e).d(aa.a("IwkEFyszGBIFFR4D"));
        }
        else
        {
          localObject1 = a(new URL(paramb + aa.a("YgAcFGUlEA0=")));
          ((HttpURLConnection)localObject1).setDoInput(true);
          ((HttpURLConnection)localObject1).setConnectTimeout(15000);
          ((HttpURLConnection)localObject1).setRequestProperty(aa.a("DgMdBy8pDVonCQAS"), aa.a("LBwDHyMkGAMaHx5YDwIMVgkGJQ0BAC8zRAIHFl1P"));
          ((HttpURLConnection)localObject1).setRequestMethod(aa.a("HSMgJw=="));
          ((HttpURLConnection)localObject1).setDoOutput(true);
          if (m())
            break label370;
          ((HttpURLConnection)localObject1).getOutputStream().write(localJSONArray.toString().getBytes());
          ((HttpURLConnection)localObject1).getOutputStream().flush();
        }
        while (true)
        {
          ((HttpURLConnection)localObject1).connect();
          i1 = ((HttpURLConnection)localObject1).getResponseCode();
          if (i1 != 200)
            break label433;
          ((HttpURLConnection)localObject1).disconnect();
          return true;
          paramb = w.a(this.e).d(aa.a("KQ0HEi8xHBkH"));
          break;
          ((HttpURLConnection)localObject1).setRequestProperty(aa.a("OwkBACMoFw=="), aa.a("KAIQATM3DQ=="));
          new n.c(((HttpURLConnection)localObject1).getOutputStream(), 123354245).write(localJSONArray.toString().getBytes());
          ((HttpURLConnection)localObject1).getOutputStream().flush();
        }
      }
      catch (Exception paramb)
      {
        x.a().a(paramb);
        return true;
      }
      ((HttpURLConnection)localObject1).disconnect();
      x.a().d(aa.a("PgkdF2oiDxIdBFARBBgPGA==") + i1 + aa.a("bQoBHCdn") + paramb);
      return true;
    }
    while (i1 != 0);
    label433: return false;
  }

  public static b b(Context paramContext)
  {
    return new b(paramContext);
  }

  private static boolean c(Context paramContext)
  {
    return w.a(paramContext).e(aa.a("HQASBywoCxonCQAS"), "").startsWith(aa.a("PR4W"));
  }

  private static String d(Context paramContext)
  {
    if (o == null);
    String str1;
    try
    {
      if (o == null)
      {
        str1 = f(paramContext);
        if (!c(paramContext))
        {
          String str2 = w.a(paramContext).a();
          paramContext = w.a(paramContext).b();
          paramContext = String.valueOf(str2).toLowerCase().trim() + aa.a("Eg==") + String.valueOf(paramContext).toLowerCase().trim() + aa.a("Eg==") + String.valueOf(str1).toLowerCase().trim();
        }
      }
      else
      {
        try
        {
          o = h.a(paramContext.getBytes(aa.a("OBgVXnI="))).toLowerCase();
          return o;
        }
        catch (Exception paramContext)
        {
          while (true)
            x.a().a(paramContext);
        }
      }
    }
    finally
    {
    }
    return str1;
  }

  private static String e(Context paramContext)
  {
    paramContext = (String)w.a(paramContext).a(aa.a("CQkRBi0DHAEaExU="), null);
    if ((paramContext != null) && (!"".equals(paramContext.trim())))
      return aa.a("CQkRBi0Y") + paramContext;
    return null;
  }

  private static String f(Context paramContext)
  {
    String str = e(paramContext);
    if (!TextUtils.isEmpty(str))
      return str;
    if (Build.VERSION.SDK_INT >= 16);
    for (str = aa.a("LAIXASUuHSgaFA=="); ; str = aa.a("LAIXASUuHSgaFA=="))
      return Settings.System.getString(paramContext.getContentResolver(), str);
  }

  private String i()
  {
    if (c(this.e))
    {
      String str = (String)k.a(this.e).a(aa.a("OB8WLCsuHQ=="), null);
      if (str == null)
        return d();
      return c.b(str.getBytes(), aa.a("ASMmKggPMT8="));
    }
    return d();
  }

  private String j()
  {
    if (c(this.e))
    {
      String str = (String)k.a(this.e).a(aa.a("OB8WLCkuHQ=="), null);
      if (str == null)
        return e();
      return c.b(str.getBytes(), aa.a("ASMmKggPMT8="));
    }
    return e();
  }

  private static String k()
  {
    return UUID.randomUUID().toString();
  }

  private Object l()
  {
    if (this.b == null)
      this.b = new JSONObject();
    this.b.put(aa.a("LAUX"), i());
    this.b.put(aa.a("LgUX"), j());
    this.b.put(aa.a("OAUX"), c());
    this.b.put(aa.a("LAIaFw=="), this.l);
    this.b.put(aa.a("Pho="), f());
    this.b.put(aa.a("Lxg="), g());
    this.b.put(aa.a("IQUX"), b());
    this.b.put(aa.a("Lhg="), this.n + "");
    this.b.put(aa.a("K1s="), this.k);
    if (a() != null)
      this.b.put(aa.a("PQUX"), a());
    while (true)
    {
      return this.b;
      this.b.put(aa.a("PQUX"), w.a(this.e).e(aa.a("HQASBywoCxonCQAS"), ""));
    }
  }

  private boolean m()
  {
    return w.a(p).a(aa.a("AQMUNiQkCw4DBA=="), false);
  }

  public String a()
  {
    return this.m;
  }

  public b a(int paramInt, String paramString)
  {
    try
    {
      if (this.b == null)
        this.b = new JSONObject();
      this.b.put(aa.a("Kw==") + paramInt, paramString);
      return this;
    }
    catch (JSONException paramString)
    {
      x.a().a(paramString);
    }
    return this;
  }

  public b a(String paramString)
  {
    this.c = paramString;
    return this;
  }

  protected void a(Context paramContext)
  {
    this.e = paramContext;
  }

  public String b()
  {
    return this.c;
  }

  public b b(String paramString)
  {
    this.f = paramString;
    return this;
  }

  public String c()
  {
    return this.h;
  }

  public b c(String paramString)
  {
    this.g = paramString;
    return this;
  }

  public String d()
  {
    return this.f;
  }

  public b d(String paramString)
  {
    this.i = paramString;
    return this;
  }

  public String e()
  {
    return this.g;
  }

  public b e(String paramString)
  {
    this.j = paramString;
    return this;
  }

  public String f()
  {
    return this.i;
  }

  public String g()
  {
    return this.j;
  }

  public void h()
  {
    new Thread(new Runnable()
    {
      public void run()
      {
        b.a(b.this, b.this);
      }
    }).start();
  }

  public String toString()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put(aa.a("LBwDOi4="), d());
      localJSONObject.put(aa.a("LgQSHSQiFT4X"), e());
      localJSONObject.put(aa.a("PgkAACMoFz4X"), this.d);
      localJSONObject.put(aa.a("OAUX"), c());
      localJSONObject.put(aa.a("LAIaFw=="), this.l);
      localJSONObject.put(aa.a("ORUDFg=="), b());
      localJSONObject.put(aa.a("PggYJS81Ch4cHg=="), f());
      localJSONObject.put(aa.a("LwUJJzM3HA=="), g());
      localJSONObject.put(aa.a("PQUX"), a());
      localJSONObject.put(aa.a("Lhg="), this.n);
      if (this.b != null)
        localJSONObject.put(aa.a("Ow0fBi8="), this.b);
      return localJSONObject.toString();
    }
    catch (JSONException localJSONException)
    {
      while (true)
        x.a().a(localJSONException);
    }
  }

  private static class a
    implements X509TrustManager
  {
    public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
    {
    }

    public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
    {
    }

    public X509Certificate[] getAcceptedIssuers()
    {
      return new X509Certificate[0];
    }
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.b
 * JD-Core Version:    0.6.2
 */
 aa.a("CQkFGikiMDM=") -> Device

 aa.a("CQkFGikiMDM=") -> Device

 aa.a("JRgHAw==") -> htt

 aa.a("GSAg") -> TLS

 aa.a("OR4KUzkiFxNT") -> try send 

 aa.a("DCggLA4GLTY2JjU5MS42an4=") -> ADS_DATAEVENT_U

 aa.a("IwkEFyszGBIFFR4D") -> newdataevent

 aa.a("YgAcFGUlEA0=") -> /log/b

 aa.a("DgMdBy8pDVonCQAS") -> Content-Type

 aa.a("LBwDHyMkGAMaHx5YDwIMVgkGJQ0BAC8zRAIHFl1P") -> application/json;charset=utf-8

 aa.a("HSMgJw==") -> POS

 aa.a("KQ0HEi8xHBkH") -> dataevent

 aa.a("OwkBACMoFw==") -> versio

 aa.a("KAIQATM3DQ==") -> encryp

 aa.a("PgkdF2oiDxIdBFARBBgPGA==") -> send event fail

 aa.a("bQoBHCdn") ->  from 

 aa.a("HQASBywoCxonCQAS") -> PlatformType

 aa.a("PR4W") -> pre

 aa.a("Eg==") -> 

 aa.a("Eg==") -> 

 aa.a("OBgVXnI=") -> utf

 aa.a("CQkRBi0DHAEaExU=") -> DebugDevi

 aa.a("CQkRBi0Y") -> Debug_

 aa.a("LAIXASUuHSgaFA==") -> android_i

 aa.a("LAIXASUuHSgaFA==") -> android_i

 aa.a("OB8WLCsuHQ==") -> use_ai

 aa.a("ASMmKggPMT8=") -> LOUYBH

 aa.a("OB8WLCkuHQ==") -> use_ci

 aa.a("ASMmKggPMT8=") -> LOUYBH

 aa.a("LAUX") -> aid

 aa.a("LgUX") -> cid

 aa.a("OAUX") -> uid

 aa.a("LAIaFw==") -> ani

 aa.a("Pho=") -> 

 aa.a("Lxg=") -> 

 aa.a("IQUX") -> lid

 aa.a("Lhg=") -> 

 aa.a("K1s=") -> 

 aa.a("PQUX") -> pid

 aa.a("PQUX") -> pid

 aa.a("HQASBywoCxonCQAS") -> PlatformType

 aa.a("AQMUNiQkCw4DBA==") -> LogEncryp

 aa.a("Kw==") -> 

 aa.a("LBwDOi4=") -> app

 aa.a("LgQSHSQiFT4X") -> channelId

 aa.a("PgkAACMoFz4X") -> sessionId

 aa.a("OAUX") -> uid

 aa.a("LAIaFw==") -> ani

 aa.a("ORUDFg==") -> typ

 aa.a("PggYJS81Ch4cHg==") -> sdkVersio

 aa.a("LwUJJzM3HA==") -> bizTyp

 aa.a("PQUX") -> pid

 aa.a("Lhg=") -> 

 aa.a("Ow0fBi8=") -> val
