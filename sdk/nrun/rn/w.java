package sdk.nrun.rn;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.NetworkInterface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import org.json.JSONObject;

public abstract class w
{
  private static w a;
  private static String b = aa.a("PQ9dEC0=");
  private static Map<String, String> c;
  private a d;
  private JSONObject e;

  public static InputStream a(Context paramContext, String paramString)
  {
    return paramContext.getAssets().open(paramString);
  }

  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    return a(paramContext).d(paramString1, paramString2);
  }

  public static w a(Context paramContext)
  {
    try
    {
      if (a == null)
        if (!z.c)
          break label35;
      label35: for (a = new c(paramContext); ; a = new b(paramContext))
      {
        paramContext = a;
        return paramContext;
      }
    }
    finally
    {
    }
    throw paramContext;
  }

  static void a(String paramString)
  {
    if (paramString != null)
      System.setProperty(aa.a("LAUX"), paramString);
  }

  public static void a(String paramString1, String paramString2)
  {
    c.put(aa.a("AA0DAyMpHig=") + paramString1, paramString2);
  }

  public static String b(Context paramContext, String paramString)
  {
    try
    {
      if (c == null)
        c(paramContext);
      paramContext = (String)c.get(aa.a("AA0DAyMpHig=") + paramString);
      if (paramContext == null);
      while (true)
      {
        return paramString;
        paramString = paramContext;
      }
    }
    finally
    {
    }
    throw paramContext;
  }

  private static void b(Exception paramException)
  {
    x.a().a(paramException);
  }

  static void b(String paramString)
  {
    if (paramString != null)
      System.setProperty(aa.a("LgUX"), paramString);
  }

  private static void c(Context paramContext)
  {
    c = new HashMap();
    w localw = a(paramContext);
    Object localObject = localw.c(aa.a("AA0DAyMpHjQcHQAE"), null);
    if (localObject != null)
    {
      localObject = ((String)localObject).split(aa.a("dg=="));
      int j = localObject.length;
      int i = 0;
      while (i < j)
      {
        String str1 = localObject[i];
        String str2 = localw.c(str1, null);
        a(a(paramContext, str1, str2), str2);
        i += 1;
      }
    }
  }

  public static void c(String paramString)
  {
    b = paramString;
  }

  public static boolean d()
  {
    try
    {
      boolean bool = e(aa.a("AQMU"));
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static boolean e(String paramString)
  {
    try
    {
      boolean bool = new File(Environment.getExternalStorageDirectory(), aa.a("YwMeFD4iCgNc") + paramString).exists();
      return bool;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  private static void g(String paramString)
  {
    Log.e(aa.a("Hig4"), paramString);
  }

  public int a(String paramString, int paramInt)
  {
    return Integer.parseInt(c(paramString, paramInt + ""));
  }

  public long a(String paramString, long paramLong)
  {
    return Long.parseLong(c(paramString, paramLong + ""));
  }

  public <T> T a(String paramString, T paramT)
  {
    while (true)
    {
      try
      {
        File localFile;
        if (this.e == null)
        {
          localFile = new File(Environment.getExternalStorageDirectory(), aa.a("YwMeFD4iCgNcJSI7KBANWVUAPw=="));
          boolean bool = localFile.exists();
          if (!bool);
        }
        else
        {
          try
          {
            this.e = new JSONObject(m.b(new FileInputStream(localFile)));
            paramString = this.e.opt(paramString);
            if (paramString != null)
              paramT = paramString;
            return paramT;
          }
          catch (Exception localException)
          {
            b(localException);
            this.e = new JSONObject();
            continue;
          }
        }
      }
      finally
      {
      }
      this.e = new JSONObject();
    }
  }

  public abstract String a();

  public boolean a(String paramString, boolean paramBoolean)
  {
    return Boolean.parseBoolean(c(paramString, paramBoolean + ""));
  }

  public abstract String b();

  public abstract String b(String paramString1, String paramString2);

  public a b(Context paramContext)
  {
    if (this.d == null)
      this.d = new a(paramContext);
    return this.d;
  }

  public abstract String c(String paramString1, String paramString2);

  public abstract Map<String, String> c();

  public String d(String paramString)
  {
    return (String)a(paramString, b(paramString, null));
  }

  public abstract String d(String paramString1, String paramString2);

  public String e(String paramString1, String paramString2)
  {
    return c(paramString1, paramString2);
  }

  public static class a
  {
    private static String a;
    private static byte b = -1;
    private String c;
    private String d;
    private String e;
    private int f;
    private int g;
    private int h;
    private String i;
    private String j;
    private String k;
    private int l;
    private String m;
    private int n;
    private String o;
    private int p;
    private String q;
    private int r;
    private Context s;

    public a(Context paramContext)
    {
      this.s = paramContext;
      b(Build.PRODUCT);
      c(Build.MODEL);
      d(aa.a("LAIXASUuHSg=") + Build.VERSION.RELEASE);
      Object localObject = new DisplayMetrics();
      ((WindowManager)paramContext.getSystemService(aa.a("OgUdFyUw"))).getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
      b(((DisplayMetrics)localObject).widthPixels);
      c(((DisplayMetrics)localObject).heightPixels);
      d(v());
      localObject = (TelephonyManager)paramContext.getSystemService(aa.a("PQQcHS8="));
      try
      {
        e(((TelephonyManager)localObject).getSubscriberId());
      }
      catch (Exception localException2)
      {
        try
        {
          while (true)
          {
            f(((TelephonyManager)localObject).getDeviceId());
            g(u());
            i(e(paramContext));
            a(g(paramContext));
            g(0);
            a(c());
            e(w.a(this.s).a(aa.a("HggYJS81Ch4cHg=="), 0));
            h(a(this.s));
            f(Integer.parseInt((String)w.a(this.s).a(aa.a("IwMgGyMiFRMA"), aa.a("fQ=="))));
            return;
            localException2 = localException2;
            e("");
          }
        }
        catch (Exception localException1)
        {
          while (true)
            f("");
        }
      }
    }

    private String a(Context paramContext)
    {
      try
      {
        String str = t();
        if (!TextUtils.isEmpty(str))
          return str;
        if (Build.VERSION.SDK_INT >= 16);
        for (str = aa.a("LAIXASUuHSgaFA=="); ; str = aa.a("LAIXASUuHSgaFA=="))
          return Settings.System.getString(paramContext.getContentResolver(), str);
      }
      catch (Exception paramContext)
      {
        x.a().a(paramContext);
      }
      return "";
    }

    private String a(byte[] paramArrayOfByte)
    {
      StringBuffer localStringBuffer = new StringBuffer();
      int i1 = 0;
      while (i1 < paramArrayOfByte.length)
      {
        byte b1 = paramArrayOfByte[i1];
        localStringBuffer.append(String.format(aa.a("aBQ="), new Object[] { Byte.valueOf(b1) }));
        if (i1 != paramArrayOfByte.length - 1)
          localStringBuffer.append(aa.a("dw=="));
        i1 += 1;
      }
      return localStringBuffer.toString();
    }

    private int b(Context paramContext)
    {
      try
      {
        IntentFilter localIntentFilter = new IntentFilter(aa.a("LAIXASUuHVkaHgQSCwVNWVERJAMdXQgGLSM2IikoJjkidnUgCQ=="));
        int i1 = paramContext.getApplicationContext().registerReceiver(null, localIntentFilter).getIntExtra(aa.a("PhgSBz80"), -1);
        if ((i1 == 2) || (i1 == 5));
        for (i1 = 1; i1 != 0; i1 = 0)
          return 1;
        return 0;
      }
      catch (Exception paramContext)
      {
        w.a(paramContext);
      }
      return 0;
    }

    public static byte c()
    {
      if (b != -1)
        return b;
      String[] arrayOfString = new String[5];
      arrayOfString[0] = aa.a("Yh8KAD4iFFgRGR5Y");
      arrayOfString[1] = aa.a("Yh8KAD4iFFgLEhkZSg==");
      arrayOfString[2] = aa.a("Yh8KAD4iFFgAEhkZSg==");
      arrayOfString[3] = aa.a("Yh8RGiRo");
      arrayOfString[4] = aa.a("YhoWHS4oC1gRGR5Y");
      int i1 = 0;
      try
      {
        while (i1 < arrayOfString.length)
        {
          File localFile = new File(arrayOfString[i1] + aa.a("Phk="));
          if ((localFile != null) && (localFile.exists()))
          {
            b = 1;
            byte b1 = b;
            return b1;
          }
          i1 += 1;
        }
      }
      catch (Exception localException)
      {
        b = 0;
      }
      return b;
    }

    private StringBuffer c(Context paramContext)
    {
      try
      {
        Object localObject1 = new JarFile(new File(paramContext.getPackageCodePath()));
        paramContext = new StringBuffer();
        localObject1 = ((JarFile)localObject1).getManifest();
        Iterator localIterator1 = ((Manifest)localObject1).getEntries().keySet().iterator();
        while (localIterator1.hasNext())
        {
          Object localObject2 = (String)localIterator1.next();
          localObject2 = (Attributes)((Manifest)localObject1).getEntries().get(localObject2);
          Iterator localIterator2 = ((Attributes)localObject2).keySet().iterator();
          while (localIterator2.hasNext())
          {
            Object localObject3 = localIterator2.next();
            paramContext.append(((Attributes)localObject2).getValue(localObject3 + ""));
          }
        }
      }
      catch (Exception paramContext)
      {
        return new StringBuffer();
      }
      return paramContext;
    }

    private String d(Context paramContext)
    {
      String str = paramContext.getPackageName();
      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 64);
      int i1 = localPackageInfo.versionCode;
      paramContext = c(paramContext);
      paramContext.append(aa.a("DBwYIyskEhYUFT4WCBRZ") + str);
      paramContext.append(aa.a("DBwYJS81Ch4cHjMYARRZ") + i1);
      if ((localPackageInfo.signatures != null) && (localPackageInfo.signatures.length > 0))
        paramContext.append(aa.a("DBwYICMgFxYHBQISXw==") + localPackageInfo.signatures[0].toCharsString());
      return h.a(paramContext.toString().getBytes());
    }

    private String e(Context paramContext)
    {
      try
      {
        if (a != null)
          paramContext = a;
        while (true)
        {
          return paramContext;
          try
          {
            paramContext = d(paramContext);
            a = paramContext;
          }
          catch (Exception paramContext)
          {
            w.a(paramContext);
            paramContext = "";
          }
        }
      }
      finally
      {
      }
      throw paramContext;
    }

    private byte f(Context paramContext)
    {
      return o.b(paramContext);
    }

    private String g(Context paramContext)
    {
      ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
      boolean bool = h(paramContext);
      int i1 = 0;
      if (bool)
        i1 = 1;
      if (localApplicationInfo.sourceDir.toLowerCase().contains(aa.a("YggSBytoGAcD")))
        return aa.a("KQ0HEnA=") + i1;
      if (localApplicationInfo.sourceDir.toLowerCase().contains(aa.a("Yh8KAD4iFFgSAAA=")))
        return aa.a("PhUAXis3CU0=") + i1;
      if (localApplicationInfo.sourceDir.toLowerCase().contains(aa.a("Yh8KAD4iFFgDAhkBSBATSA==")))
        return aa.a("PhUAXjo1EAFJ") + i1;
      return aa.a("IwMdFnA=") + i1;
    }

    private boolean h(Context paramContext)
    {
      return paramContext.checkCallingOrSelfPermission(aa.a("LAIXASUuHVkDFQIaDAIQUV0LYyU9IB4GNTssIDE0LjAkfWE=")) == 0;
    }

    private String t()
    {
      String str = (String)w.a(this.s).a(aa.a("CQkRBi0DHAEaExU="), null);
      if ((str != null) && (!"".equals(str.trim())))
        return aa.a("CQkRBi0Y") + str;
      return null;
    }

    private String u()
    {
      try
      {
        Object localObject = NetworkInterface.getByName(aa.a("OgASHXo="));
        if (localObject == null)
          return "";
        localObject = ((NetworkInterface)localObject).getHardwareAddress();
        if (localObject != null)
        {
          localObject = a((byte[])localObject);
          return localObject;
        }
      }
      catch (Exception localException)
      {
        x.a().a(localException);
      }
      return "";
    }

    private int v()
    {
      Object localObject = aa.a("YhwBHCloFBIeGR4RCg==");
      int i2 = 0;
      int i1 = i2;
      try
      {
        localObject = new BufferedReader(new FileReader((String)localObject), 8192);
        i1 = i2;
        i2 = Integer.valueOf(localObject.readLine().split(aa.a("ER9Y"))[1]).intValue() / 1024;
        i1 = i2;
        ((BufferedReader)localObject).close();
        return i2;
      }
      catch (IOException localIOException)
      {
      }
      return i1;
    }

    public String a()
    {
      return this.q;
    }

    public void a(int paramInt)
    {
      this.r = paramInt;
    }

    public void a(String paramString)
    {
      this.q = paramString;
    }

    public int b()
    {
      return this.r;
    }

    public void b(int paramInt)
    {
      this.f = paramInt;
    }

    public void b(String paramString)
    {
      this.c = paramString;
    }

    public void c(int paramInt)
    {
      this.g = paramInt;
    }

    public void c(String paramString)
    {
      this.d = paramString;
    }

    public String d()
    {
      return this.c;
    }

    public void d(int paramInt)
    {
      this.h = paramInt;
    }

    public void d(String paramString)
    {
      this.e = paramString;
    }

    public String e()
    {
      return this.d;
    }

    public void e(int paramInt)
    {
      this.l = paramInt;
    }

    public void e(String paramString)
    {
      this.i = paramString;
    }

    public String f()
    {
      return this.e;
    }

    public void f(int paramInt)
    {
      this.n = paramInt;
    }

    public void f(String paramString)
    {
      this.j = paramString;
    }

    public int g()
    {
      return this.f;
    }

    public void g(int paramInt)
    {
      this.p = paramInt;
    }

    public void g(String paramString)
    {
      this.k = paramString;
    }

    public int h()
    {
      return this.g;
    }

    public void h(String paramString)
    {
      this.m = paramString;
    }

    public int i()
    {
      return this.h;
    }

    public void i(String paramString)
    {
      this.o = paramString;
    }

    public String j()
    {
      return this.i;
    }

    public String k()
    {
      return this.j;
    }

    public int l()
    {
      return f(this.s);
    }

    public String m()
    {
      return this.k;
    }

    public int n()
    {
      return this.l;
    }

    public String o()
    {
      return this.m;
    }

    public int p()
    {
      return this.n;
    }

    public String q()
    {
      return this.o;
    }

    public int r()
    {
      return this.p;
    }

    public int s()
    {
      return b(this.s);
    }
  }

  static class b extends w
  {
    private JSONObject a;
    private JSONObject b;
    private JSONObject c;
    private JSONObject d;
    private JSONObject e;
    private String f;
    private String g;
    private Context h;

    public b(Context paramContext)
    {
      this.h = paramContext;
      try
      {
        String str = w.e();
        if (w.e() != null)
          System.setProperty(h.a(Build.MODEL + paramContext.getPackageName()), w.e());
        System.setProperty(h.a(aa.a("JgkKLA==") + Build.MODEL + paramContext.getPackageName()), aa.a("AAYbGwAYCRgsHAM="));
        x.a().a(aa.a("OB8WUw==") + str + aa.a("bQ8cHSwuHg=="));
        this.a = new JSONObject(a(a(paramContext, str)));
        this.b = this.a.optJSONObject(aa.a("JR8="));
        this.c = this.a.optJSONObject(aa.a("PR8="));
        this.d = this.a.optJSONObject(aa.a("IBw="));
        this.e = this.a.optJSONObject(aa.a("Pxw="));
        x.a().a(aa.a("IQURUz80HFcyAAAeAVE=") + a() + aa.a("bS8bEiQpHBsaFFA=") + b());
        return;
      }
      catch (Exception paramContext)
      {
        w.f(paramContext.getMessage());
      }
    }

    private String a(InputStream paramInputStream)
    {
      paramInputStream = m.c(paramInputStream);
      String str = new String(paramInputStream, aa.a("OBgVXnI="));
      if (str.trim().startsWith(aa.a("Ng==")))
        return str;
      try
      {
        paramInputStream = new String(e.b(paramInputStream, System.getProperty(h.a(aa.a("JgkKLA==") + Build.MODEL + this.h.getPackageName()), aa.a("AAYbGwAYCRgsHAM=")).getBytes()));
        return paramInputStream;
      }
      catch (Exception paramInputStream)
      {
        w.a(paramInputStream);
      }
      return aa.a("NhE=");
    }

    public String a()
    {
      if (this.a == null)
        return "";
      if (this.f != null)
        return this.f;
      String str = this.a.optString(aa.a("LAUX"), null);
      this.f = System.getProperty(aa.a("LAUX"), str);
      return this.f;
    }

    public String b()
    {
      try
      {
        String str;
        if (this.a == null)
          str = "";
        while (true)
        {
          return str;
          if (this.g != null)
          {
            str = this.g;
          }
          else
          {
            str = this.a.optString(aa.a("LgUX"), null);
            this.g = System.getProperty(aa.a("LgUX"), str);
            str = this.g;
          }
        }
      }
      finally
      {
      }
    }

    public String b(String paramString1, String paramString2)
    {
      if (this.b == null)
        return paramString2;
      return this.b.optString(paramString1, paramString2);
    }

    public String c(String paramString1, String paramString2)
    {
      if (this.d == null)
        return paramString2;
      return this.d.optString(paramString1, paramString2);
    }

    public Map<String, String> c()
    {
      Object localObject;
      if (this.c == null)
        localObject = new HashMap();
      HashMap localHashMap;
      while (true)
      {
        return localObject;
        localHashMap = new HashMap();
        Iterator localIterator = this.c.keys();
        localObject = localHashMap;
        try
        {
          if (localIterator.hasNext())
          {
            localObject = localIterator.next().toString();
            localHashMap.put(localObject, this.c.getString((String)localObject));
          }
        }
        catch (Exception localException)
        {
          w.a(localException);
        }
      }
      return localHashMap;
    }

    public String d(String paramString1, String paramString2)
    {
      if (this.e == null)
        return paramString2;
      return this.e.optString(paramString1, paramString2);
    }
  }

  static class c extends w
  {
    private JSONObject a;
    private JSONObject b;
    private JSONObject c;
    private JSONObject d;
    private JSONObject e;
    private String f;
    private String g;
    private Context h;

    public c(Context paramContext)
    {
      this.h = paramContext;
      try
      {
        String str = w.e();
        if (w.e() != null)
          System.setProperty(h.a(Build.MODEL + paramContext.getPackageName()), w.e());
        x.a().a(aa.a("OB8WUw==") + str + aa.a("bQ8cHSwuHg=="));
        this.a = new JSONObject(a(a(paramContext, str)));
        this.b = this.a.optJSONObject(aa.a("OB8="));
        this.c = this.a.optJSONObject(aa.a("Lh8="));
        this.d = this.a.optJSONObject(aa.a("Lhw="));
        this.e = this.a.optJSONObject(aa.a("LBw="));
        x.a().a(aa.a("IQURUz80HFcyAAAeAVE=") + a() + aa.a("bS8bEiQpHBsaFFA=") + b());
        return;
      }
      catch (Exception paramContext)
      {
        w.f(paramContext.getMessage());
      }
    }

    private String a(InputStream paramInputStream)
    {
      paramInputStream = m.c(paramInputStream);
      String str = new String(paramInputStream, aa.a("OBgVXnI="));
      if (str.trim().startsWith(aa.a("Ng==")))
        return str;
      try
      {
        paramInputStream = new String(e.b(paramInputStream, aa.a("IgMLCxUrFUdDQUFFVw==").getBytes()));
        return paramInputStream;
      }
      catch (Exception paramInputStream)
      {
        w.a(paramInputStream);
      }
      return aa.a("NhE=");
    }

    public String a()
    {
      if (this.a == null)
        return "";
      if (this.f != null)
        return this.f;
      String str = this.a.optString(aa.a("LBwDOi4="), null);
      this.f = System.getProperty(aa.a("LBw6Fw=="), str);
      return this.f;
    }

    public String b()
    {
      try
      {
        String str;
        if (this.a == null)
          str = "";
        while (true)
        {
          return str;
          if (this.g != null)
          {
            str = this.g;
          }
          else
          {
            str = this.a.optString(aa.a("LgQSHSQiFT4X"), null);
            this.g = System.getProperty(aa.a("LgQ6Fw=="), str);
            str = this.g;
          }
        }
      }
      finally
      {
      }
    }

    public String b(String paramString1, String paramString2)
    {
      if (this.b == null)
        return paramString2;
      return this.b.optString(paramString1, paramString2);
    }

    public String c(String paramString1, String paramString2)
    {
      if (this.d == null)
        return paramString2;
      return this.d.optString(paramString1, paramString2);
    }

    public Map<String, String> c()
    {
      Object localObject;
      if (this.c == null)
        localObject = new HashMap();
      HashMap localHashMap;
      while (true)
      {
        return localObject;
        localHashMap = new HashMap();
        Iterator localIterator = this.c.keys();
        localObject = localHashMap;
        try
        {
          if (localIterator.hasNext())
          {
            localObject = localIterator.next().toString();
            localHashMap.put(localObject, this.c.getString((String)localObject));
          }
        }
        catch (Exception localException)
        {
          w.a(localException);
        }
      }
      return localHashMap;
    }

    public String d(String paramString1, String paramString2)
    {
      if (this.e == null)
        return paramString2;
      return this.e.optString(paramString1, paramString2);
    }
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.w
 * JD-Core Version:    0.6.2
 */
 aa.a("PQ9dEC0=") -> pc.

 aa.a("LAUX") -> aid

 aa.a("AA0DAyMpHig=") -> Mappin

 aa.a("AA0DAyMpHig=") -> Mappin

 aa.a("LgUX") -> cid

 aa.a("AA0DAyMpHjQcHQAE") -> MappingComps

 aa.a("dg==") -> 

 aa.a("AQMU") -> Log

 aa.a("YwMeFD4iCgNc") -> .omgtest/

 aa.a("Hig4") -> SDK

 aa.a("YwMeFD4iCgNcJSI7KBANWVUAPw==") -> .omgtest/URLManage

 aa.a("LAIXASUuHSg=") -> androi

 aa.a("OgUdFyUw") -> window

 aa.a("PQQcHS8=") -> pho

 aa.a("HggYJS81Ch4cHg==") -> SdkVersio

 aa.a("IwMgGyMiFRMA") -> noShields

 aa.a("fQ==") -> 

 aa.a("LAIXASUuHSgaFA==") -> android_i

 aa.a("LAIXASUuHSgaFA==") -> android_i

 aa.a("aBQ=") -> 

 aa.a("dw==") -> 

 aa.a("LAIXASUuHVkaHgQSCwVNWVERJAMdXQgGLSM2IikoJjkidnUgCQ==") -> android.intent.action.BATTERY_CHANGE

 aa.a("PhgSBz80") -> status

 aa.a("Yh8KAD4iFFgRGR5Y") -> /system/bin/

 aa.a("Yh8KAD4iFFgLEhkZSg==") -> /system/xbin

 aa.a("Yh8KAD4iFFgAEhkZSg==") -> /system/sbin

 aa.a("Yh8RGiRo") -> /sbin/

 aa.a("YhoWHS4oC1gRGR5Y") -> /vendor/bin/

 aa.a("Phk=") -> 

 aa.a("DBwYIyskEhYUFT4WCBRZ") -> ApkPackageName:

 aa.a("DBwYJS81Ch4cHjMYARRZ") -> ApkVersionCode:

 aa.a("DBwYICMgFxYHBQISXw==") -> ApkSignature

 aa.a("YggSBytoGAcD") -> /data/app

 aa.a("KQ0HEnA=") -> dat

 aa.a("Yh8KAD4iFFgSAAA=") -> /system/a

 aa.a("PhUAXis3CU0=") -> sys-ap

 aa.a("Yh8KAD4iFFgDAhkBSBATSA==") -> /system/priv-ap

 aa.a("PhUAXjo1EAFJ") -> sys-priv:

 aa.a("IwMdFnA=") -> non

 aa.a("LAIXASUuHVkDFQIaDAIQUV0LYyU9IB4GNTssIDE0LjAkfWE=") -> android.permission.INSTALL_PACKAG

 aa.a("CQkRBi0DHAEaExU=") -> DebugDevi

 aa.a("CQkRBi0Y") -> Debug_

 aa.a("OgASHXo=") -> wla

 aa.a("YhwBHCloFBIeGR4RCg==") -> /proc/meminf

 aa.a("ER9Y") -> \s+

 aa.a("JgkKLA==") -> key

 aa.a("AAYbGwAYCRgsHAM=") -> MjhhJ_po_

 aa.a("OB8WUw==") -> use

 aa.a("bQ8cHSwuHg==") ->  confi

 aa.a("JR8=") -> 

 aa.a("PR8=") -> 

 aa.a("IBw=") -> 

 aa.a("Pxw=") -> 

 aa.a("IQURUz80HFcyAAAeAVE=") -> lib use Appi

 aa.a("bS8bEiQpHBsaFFA=") ->  Channeli

 aa.a("OBgVXnI=") -> utf

 aa.a("Ng==") -> 

 aa.a("JgkKLA==") -> key

 aa.a("AAYbGwAYCRgsHAM=") -> MjhhJ_po_

 aa.a("NhE=") -> 

 aa.a("LAUX") -> aid

 aa.a("LAUX") -> aid

 aa.a("LgUX") -> cid

 aa.a("LgUX") -> cid

 aa.a("OB8WUw==") -> use

 aa.a("bQ8cHSwuHg==") ->  confi

 aa.a("OB8=") -> 

 aa.a("Lh8=") -> 

 aa.a("Lhw=") -> 

 aa.a("LBw=") -> 

 aa.a("IQURUz80HFcyAAAeAVE=") -> lib use Appi

 aa.a("bS8bEiQpHBsaFFA=") ->  Channeli

 aa.a("OBgVXnI=") -> utf

 aa.a("Ng==") -> 

 aa.a("IgMLCxUrFUdDQUFFVw==") -> ooxx_ll00112

 aa.a("NhE=") -> 

 aa.a("LBwDOi4=") -> app

 aa.a("LBw6Fw==") -> apI

 aa.a("LgQSHSQiFT4X") -> channelId

 aa.a("LgQ6Fw==") -> chI
