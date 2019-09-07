package sdk.nrun.rn.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import dalvik.system.DexClassLoader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import sdk.nrun.rn.aa;
import sdk.nrun.rn.l;
import sdk.nrun.rn.m;
import sdk.nrun.rn.x;
import sdk.nrun.rn.z;

public abstract class f
{
  public static final String a = aa.a("KQkF");
  public static final String b = aa.a("KQkL");
  public static final String c = aa.a("PwkA");
  static Map<String, f> d;
  private static l g = x.a();
  boolean e = true;
  String f = "";
  private boolean h = false;
  private Map<String, WeakReference<c>> i = new HashMap();
  private h j;

  public static Iterable<f> a()
  {
    if (d == null)
      return new ArrayList();
    return d.values();
  }

  private static f a(Context paramContext, String paramString, h paramh)
  {
    try
    {
      paramContext = a(paramContext, new b(), paramString, paramh);
      return paramContext;
    }
    finally
    {
      paramContext = finally;
    }
    throw paramContext;
  }

  private static f a(Context paramContext, f paramf, String paramString, h paramh)
  {
    if (d == null)
      d = new HashMap();
    if (d.containsKey(paramString))
      return (f)d.get(paramString);
    paramf.a(paramh);
    paramf.b(paramContext, paramh);
    d.put(paramString, paramf);
    return paramf;
  }

  public static f a(Context paramContext, h paramh)
  {
    if (a.equals(paramh.e()))
      return b(paramContext, paramh.b(), paramh);
    if (b.equals(paramh.e()))
      return a(paramContext, paramh.b(), paramh);
    if (c.equals(paramh.e()))
      return c(paramContext, paramh.b(), paramh);
    throw new g(aa.a("IwMHUw==") + paramh.e() + aa.a("bRgKAy9nKRsGFxkZJh4NTFcdOUwWCyM0DQ=="));
  }

  public static f a(String paramString)
  {
    if (d == null)
      return null;
    return (f)d.get(paramString);
  }

  private void a(Exception paramException)
  {
    g.a(paramException);
  }

  private void a(h paramh)
  {
    this.j = paramh;
  }

  private static f b(Context paramContext, String paramString, h paramh)
  {
    try
    {
      paramContext = a(paramContext, new a(), paramString, paramh);
      return paramContext;
    }
    finally
    {
      paramContext = finally;
    }
    throw paramContext;
  }

  private static f c(Context paramContext, String paramString, h paramh)
  {
    try
    {
      paramContext = a(paramContext, new d(), paramString, paramh);
      return paramContext;
    }
    finally
    {
      paramContext = finally;
    }
    throw paramContext;
  }

  private static void c(String paramString)
  {
    g.a(paramString);
  }

  InputStream a(ClassLoader paramClassLoader, h paramh)
  {
    paramh = paramh.d(aa.a("PggYIS80FgIBExU="));
    if (paramh != null)
    {
      paramClassLoader = paramClassLoader.getResourceAsStream(paramh);
      paramh = new ByteArrayOutputStream();
      m.a(paramClassLoader, paramh);
      paramClassLoader.close();
      return new ByteArrayInputStream(paramh.toByteArray());
    }
    return null;
  }

  public void a(Map<String, Object> paramMap)
  {
    try
    {
      if (!this.h)
      {
        this.h = true;
        String str = e().f();
        if (str != null)
          b(str).a(paramMap);
      }
      return;
    }
    finally
    {
    }
    throw paramMap;
  }

  public abstract Context b();

  public c b(String paramString)
  {
    try
    {
      c localc = new c(this, c().loadClass(paramString).newInstance());
      c(aa.a("HQAGFCMpWRQfEQMERQpD") + paramString + aa.a("bRFTHyUmHVcABRM="));
      this.i.put(paramString, new WeakReference(localc));
      return localc;
    }
    catch (Exception paramString)
    {
    }
    throw new g(paramString);
  }

  public abstract void b(Context paramContext, h paramh);

  public abstract ClassLoader c();

  public abstract Context d();

  public h e()
  {
    return this.j;
  }

  public LayoutInflater f()
  {
    if (d().equals(b()))
      return LayoutInflater.from(b());
    return LayoutInflater.from(d()).cloneInContext(b());
  }

  static class a extends f
  {
    private Context g;

    public Context b()
    {
      return this.g;
    }

    public void b(Context paramContext, h paramh)
    {
      this.g = paramContext;
    }

    public ClassLoader c()
    {
      return this.g.getClassLoader();
    }

    public Context d()
    {
      return this.g;
    }
  }

  static class b extends f
  {
    private ClassLoader g;
    private Context h;

    public Context b()
    {
      return this.h;
    }

    public void b(Context paramContext, h paramh)
    {
      while (true)
      {
        File localFile3;
        try
        {
          File localFile2 = new File(paramContext.getFilesDir(), sdk.nrun.rn.h.a(Build.MODEL + aa.a("KQkLHDoz") + paramh.b()).substring(0, 6));
          if (!localFile2.exists())
            localFile2.mkdirs();
          File localFile1 = new File(paramh.d());
          localFile3 = new File(localFile2, sdk.nrun.rn.h.a(new StringBuilder().append(Build.MANUFACTURER).append(paramh.b()).append(paramh.c()).toString()) + aa.a("YwYSAQ=="));
          try
          {
            m.a(localFile1, localFile3);
            if (localFile3.exists())
            {
              if (!paramh.f(aa.a("IQ0GHSkv")))
                break label326;
              this.g = new DexClassLoader(localFile3.getPath(), localFile3.getParent(), null, getClass().getClassLoader());
              this.h = new ContextWrapper(paramContext)
              {
                public Object getSystemService(String paramAnonymousString)
                {
                  if (aa.a("PggYIS80FgIBExU=").equals(paramAnonymousString))
                    return this.a;
                  return super.getSystemService(paramAnonymousString);
                }
              };
              if (paramh.f(aa.a("KQkf")))
                m.a(localFile2);
            }
            return;
          }
          catch (IOException paramContext)
          {
            throw new g(aa.a("IAMFFmo=") + localFile1.getPath() + aa.a("bRgcUz4iFAdTABEDDVEFWVsJ"), paramContext);
          }
        }
        catch (Exception paramContext)
        {
          throw new g(paramContext);
        }
        finally
        {
          new File(paramh.d()).delete();
        }
        label326: this.g = new DexClassLoader(localFile3.getPath(), localFile3.getParent(), null, getClass().getClassLoader());
      }
    }

    public ClassLoader c()
    {
      return this.g;
    }

    public Context d()
    {
      return this.h;
    }
  }

  public class c
  {
    private Object b;
    private f c;

    public c(f paramObject, Object arg3)
    {
      this.c = paramObject;
      Object localObject;
      this.b = localObject;
    }

    public <TPlugin> TPlugin a()
    {
      if (this.b != null)
        return this.b;
      return null;
    }

    public void a(Map<String, Object> paramMap)
    {
      Object localObject;
      if (this.b != null)
      {
        localObject = paramMap;
        if (paramMap != null);
      }
      try
      {
        localObject = new HashMap();
        paramMap = this.b.getClass().getDeclaredMethod(aa.a("PQAGFCMpNRgSFBUT"), new Class[] { Object.class, Map.class, Map.class });
        paramMap.setAccessible(true);
        Map localMap = this.c.e().h();
        localMap.put(aa.a("DBwDMCUpDRILBA=="), this.c.d());
        localMap.put(aa.a("HQAGFCMpOhgdBBUPEQ=="), this.c.b());
        localMap.put(aa.a("BB8jEjgiFwM="), Boolean.valueOf(z.c));
        paramMap.invoke(this.b, new Object[] { this.c, localMap, localObject });
        return;
      }
      catch (Exception paramMap)
      {
        f.a(f.this, paramMap);
      }
    }
  }

  static class d extends f
  {
    private Context g;
    private Context h;
    private ClassLoader i;

    private File c(Context paramContext, h paramh)
    {
      File localFile2;
      while (true)
      {
        try
        {
          localFile2 = new File(paramContext.getFilesDir(), sdk.nrun.rn.h.a(Build.MODEL + aa.a("KQkLHDoz") + paramh.b()).substring(0, 6));
          if (!localFile2.exists())
            localFile2.mkdirs();
          File localFile1 = new File(paramh.d());
          localFile2 = new File(localFile2, sdk.nrun.rn.h.a(new StringBuilder().append(Build.MANUFACTURER).append(paramh.b()).append(paramh.c()).toString()) + aa.a("YwYSAQ=="));
          try
          {
            m.a(localFile1, localFile2);
            if (!localFile2.exists())
              break;
            if (paramh.f(aa.a("IQ0GHSkv")))
            {
              this.i = new DexClassLoader(localFile2.getPath(), localFile2.getParent(), null, getClass().getClassLoader());
              this.h = paramContext;
              return localFile2;
            }
          }
          catch (IOException paramContext)
          {
            throw new g(aa.a("IAMFFmo=") + localFile1.getPath() + aa.a("bRgcUz4iFAdTABEDDVEFWVsJ"), paramContext);
          }
        }
        catch (Exception paramContext)
        {
          throw new g(paramContext);
        }
        this.i = new DexClassLoader(localFile2.getPath(), localFile2.getParent(), null, getClass().getClassLoader());
      }
      throw new g(localFile2 + aa.a("bRgWHjpnWRkcBFASHRgQTEE="));
    }

    public Context b()
    {
      return this.g;
    }

    // ERROR //
    public void b(final Context paramContext, final h paramh)
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore 4
      //   3: aload_0
      //   4: aload_1
      //   5: aload_2
      //   6: invokespecial 159	sdk/nrun/rn/c/f$d:c	(Landroid/content/Context;Lsdk/nrun/rn/c/h;)Ljava/io/File;
      //   9: astore_3
      //   10: aload_2
      //   11: invokevirtual 85	sdk/nrun/rn/c/h:d	()Ljava/lang/String;
      //   14: ifnonnull +110 -> 124
      //   17: new 137	sdk/nrun/rn/c/g
      //   20: dup
      //   21: ldc 161
      //   23: invokestatic 55	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
      //   26: invokespecial 153	sdk/nrun/rn/c/g:<init>	(Ljava/lang/String;)V
      //   29: athrow
      //   30: astore_1
      //   31: new 137	sdk/nrun/rn/c/g
      //   34: dup
      //   35: ldc 163
      //   37: invokestatic 55	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
      //   40: aload_1
      //   41: invokespecial 144	sdk/nrun/rn/c/g:<init>	(Ljava/lang/String;Ljava/lang/Exception;)V
      //   44: athrow
      //   45: astore 4
      //   47: aload_3
      //   48: astore_1
      //   49: aload 4
      //   51: astore_3
      //   52: new 137	sdk/nrun/rn/c/g
      //   55: dup
      //   56: aload_3
      //   57: invokespecial 147	sdk/nrun/rn/c/g:<init>	(Ljava/lang/Throwable;)V
      //   60: athrow
      //   61: astore 4
      //   63: aload_1
      //   64: astore_3
      //   65: aload 4
      //   67: astore_1
      //   68: new 29	java/io/File
      //   71: dup
      //   72: aload_2
      //   73: invokevirtual 85	sdk/nrun/rn/c/h:d	()Ljava/lang/String;
      //   76: invokespecial 88	java/io/File:<init>	(Ljava/lang/String;)V
      //   79: invokevirtual 166	java/io/File:delete	()Z
      //   82: pop
      //   83: aload_2
      //   84: aload_3
      //   85: invokevirtual 115	java/io/File:getPath	()Ljava/lang/String;
      //   88: invokevirtual 168	sdk/nrun/rn/c/h:b	(Ljava/lang/String;)V
      //   91: aload_3
      //   92: ifnull +30 -> 122
      //   95: aload_2
      //   96: ldc 170
      //   98: invokestatic 55	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
      //   101: invokevirtual 110	sdk/nrun/rn/c/h:f	(Ljava/lang/String;)Z
      //   104: ifeq +18 -> 122
      //   107: aload_3
      //   108: invokevirtual 173	java/io/File:getParentFile	()Ljava/io/File;
      //   111: ifnull +11 -> 122
      //   114: aload_3
      //   115: invokevirtual 173	java/io/File:getParentFile	()Ljava/io/File;
      //   118: invokestatic 176	sdk/nrun/rn/m:a	(Ljava/io/File;)Z
      //   121: pop
      //   122: aload_1
      //   123: athrow
      //   124: ldc 178
      //   126: invokevirtual 182	java/lang/Class:newInstance	()Ljava/lang/Object;
      //   129: checkcast 178	android/content/res/AssetManager
      //   132: astore 4
      //   134: ldc 178
      //   136: ldc 184
      //   138: invokestatic 55	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
      //   141: iconst_1
      //   142: anewarray 126	java/lang/Class
      //   145: dup
      //   146: iconst_0
      //   147: ldc 69
      //   149: aastore
      //   150: invokevirtual 188	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      //   153: astore 5
      //   155: aload 5
      //   157: iconst_1
      //   158: invokevirtual 194	java/lang/reflect/Method:setAccessible	(Z)V
      //   161: aload 5
      //   163: aload 4
      //   165: iconst_1
      //   166: anewarray 120	java/lang/Object
      //   169: dup
      //   170: iconst_0
      //   171: aload_3
      //   172: invokevirtual 115	java/io/File:getPath	()Ljava/lang/String;
      //   175: aastore
      //   176: invokevirtual 198	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      //   179: pop
      //   180: aload_0
      //   181: aload_0
      //   182: getfield 21	sdk/nrun/rn/c/f$d:i	Ljava/lang/ClassLoader;
      //   185: aload_2
      //   186: invokevirtual 201	sdk/nrun/rn/c/f$d:a	(Ljava/lang/ClassLoader;Lsdk/nrun/rn/c/h;)Ljava/io/InputStream;
      //   189: astore 5
      //   191: aload_0
      //   192: new 7	sdk/nrun/rn/c/f$d$1
      //   195: dup
      //   196: aload_0
      //   197: aload_1
      //   198: aload 4
      //   200: new 203	android/content/res/Resources
      //   203: dup
      //   204: aload 4
      //   206: aload_1
      //   207: invokevirtual 207	android/content/Context:getResources	()Landroid/content/res/Resources;
      //   210: invokevirtual 211	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
      //   213: aload_1
      //   214: invokevirtual 207	android/content/Context:getResources	()Landroid/content/res/Resources;
      //   217: invokevirtual 215	android/content/res/Resources:getConfiguration	()Landroid/content/res/Configuration;
      //   220: invokespecial 218	android/content/res/Resources:<init>	(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V
      //   223: aload_1
      //   224: aload 5
      //   226: aload_2
      //   227: invokespecial 221	sdk/nrun/rn/c/f$d$1:<init>	(Lsdk/nrun/rn/c/f$d;Landroid/content/Context;Landroid/content/res/AssetManager;Landroid/content/res/Resources;Landroid/content/Context;Ljava/io/InputStream;Lsdk/nrun/rn/c/h;)V
      //   230: putfield 156	sdk/nrun/rn/c/f$d:g	Landroid/content/Context;
      //   233: new 29	java/io/File
      //   236: dup
      //   237: aload_2
      //   238: invokevirtual 85	sdk/nrun/rn/c/h:d	()Ljava/lang/String;
      //   241: invokespecial 88	java/io/File:<init>	(Ljava/lang/String;)V
      //   244: invokevirtual 166	java/io/File:delete	()Z
      //   247: pop
      //   248: aload_2
      //   249: aload_3
      //   250: invokevirtual 115	java/io/File:getPath	()Ljava/lang/String;
      //   253: invokevirtual 168	sdk/nrun/rn/c/h:b	(Ljava/lang/String;)V
      //   256: aload_3
      //   257: ifnull +30 -> 287
      //   260: aload_2
      //   261: ldc 170
      //   263: invokestatic 55	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
      //   266: invokevirtual 110	sdk/nrun/rn/c/h:f	(Ljava/lang/String;)Z
      //   269: ifeq +18 -> 287
      //   272: aload_3
      //   273: invokevirtual 173	java/io/File:getParentFile	()Ljava/io/File;
      //   276: ifnull +11 -> 287
      //   279: aload_3
      //   280: invokevirtual 173	java/io/File:getParentFile	()Ljava/io/File;
      //   283: invokestatic 176	sdk/nrun/rn/m:a	(Ljava/io/File;)Z
      //   286: pop
      //   287: return
      //   288: astore_1
      //   289: aconst_null
      //   290: astore_3
      //   291: goto -223 -> 68
      //   294: astore_1
      //   295: goto -227 -> 68
      //   298: astore_3
      //   299: aload 4
      //   301: astore_1
      //   302: goto -250 -> 52
      //
      // Exception table:
      //   from	to	target	type
      //   10	30	30	java/lang/Exception
      //   124	180	30	java/lang/Exception
      //   31	45	45	java/lang/Exception
      //   180	233	45	java/lang/Exception
      //   52	61	61	finally
      //   3	10	288	finally
      //   10	30	294	finally
      //   31	45	294	finally
      //   124	180	294	finally
      //   180	233	294	finally
      //   3	10	298	java/lang/Exception
    }

    public ClassLoader c()
    {
      return this.i;
    }

    public Context d()
    {
      return this.h;
    }
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.c.f
 * JD-Core Version:    0.6.2
 */
 aa.a("KQkF") -> dev

 aa.a("KQkL") -> dex

 aa.a("PwkA") -> res

 aa.a("IwMHUw==") -> not

 aa.a("bRgKAy9nKRsGFxkZJh4NTFcdOUwWCyM0DQ==") ->  type PluginContext exis

 aa.a("PggYIS80FgIBExU=") -> sdkResour

 aa.a("HQAGFCMpWRQfEQMERQpD") -> Plugin class { 

 aa.a("bRFTHyUmHVcABRM=") ->  } load s

 aa.a("KQkLHDoz") -> dexopt

 aa.a("YwYSAQ==") -> .ja

 aa.a("IQ0GHSkv") -> launch

 aa.a("PggYIS80FgIBExU=") -> sdkResour

 aa.a("KQkf") -> del

 aa.a("IAMFFmo=") -> mov

 aa.a("bRgcUz4iFAdTABEDDVEFWVsJ") ->  to temp path fail

 aa.a("PQAGFCMpNRgSFBUT") -> pluginLoaded

 aa.a("DBwDMCUpDRILBA==") -> AppContex

 aa.a("HQAGFCMpOhgdBBUPEQ==") -> PluginContex

 aa.a("BB8jEjgiFwM=") -> IsPare

 aa.a("KQkLHDoz") -> dexopt

 aa.a("YwYSAQ==") -> .ja

 aa.a("IQ0GHSkv") -> launch

 aa.a("IAMFFmo=") -> mov

 aa.a("bRgcUz4iFAdTABEDDVEFWVsJ") ->  to temp path fail

 aa.a("bRgWHjpnWRkcBFASHRgQTEE=") ->  temp  not exis
