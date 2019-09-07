package sdk.nrun.rn.c;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import sdk.nrun.rn.aa;
import sdk.nrun.rn.c.a.a;
import sdk.nrun.rn.l;
import sdk.nrun.rn.m;
import sdk.nrun.rn.w;
import sdk.nrun.rn.x;

public abstract class j
{
  static final String a = aa.a("cgkdEB4+CRJO");
  private static final String b = aa.a("KQkL");
  private Context c;
  private Map<String, String> d;
  private File e;
  private l f = x.a();
  private b g;

  public j(Context paramContext)
  {
    this.c = paramContext;
    this.g = new a(paramContext);
  }

  private f a(Map<String, Object> paramMap, h paramh, boolean paramBoolean)
  {
    if ((paramh.e() == null) || ("".equals(paramh.e())))
      paramh.c(b);
    f localf = f.a(h(), paramh);
    a().a(aa.a("IQMSF2o3FQIUGR5X") + paramh);
    if (!paramBoolean)
      localf.a(paramMap);
    return localf;
  }

  private boolean a(h paramh1, h paramh2)
  {
    if (!new File(paramh1.d()).exists())
    {
      a().b(aa.a("q+Phl/Hxn+H0lMvBRQ==") + paramh1.d() + aa.a("bYrv26zb8JH6zpX/1Q=="));
      return false;
    }
    if (paramh2 == null)
    {
      a().b(aa.a("q97SlcP5nP/DmM/ugN/V3I78qMPKlvDTnu33lv/lgcrV3I3Eq+3c") + paramh1.d() + " ");
      return false;
    }
    return true;
  }

  private void c(h paramh)
  {
    InputStream localInputStream = a(paramh.a());
    Object localObject = j(b(paramh.b()));
    localObject = new File(b(), (String)localObject + aa.a("Eg==") + paramh.c() + aa.a("Yw==") + ((String)localObject).substring(0, 2));
    try
    {
      if (!((File)localObject).exists())
      {
        if ((((File)localObject).getParentFile() != null) && (!((File)localObject).getParentFile().exists()))
          ((File)localObject).getParentFile().mkdirs();
        ((File)localObject).createNewFile();
      }
      paramh.b(((File)localObject).getPath());
      if ((((File)localObject).length() > 0L) && (((File)localObject).length() == paramh.e(aa.a("HgUJFg=="))))
      {
        a().a(aa.a("q+Phl/Hx") + ((File)localObject).getPath() + aa.a("bYnEwa/q4ZLv2J/L6Zfkqtfb2on526X79ZLDwZTP6JbEg9fv5YjJ9Q=="));
        return;
      }
    }
    catch (IOException paramh)
    {
      throw new g(aa.a("Lh4WEj4iWREaHBVX") + localObject + aa.a("bQoSGiY="), paramh);
    }
    a().a(aa.a("qNDzlu3MnM7BlsTMis3v35XeqObb") + paramh.a() + aa.a("qOTD") + ((File)localObject).getPath());
    try
    {
      m.a(localInputStream, (File)localObject);
      return;
    }
    catch (IOException localIOException)
    {
      throw new g(aa.a("IAMFFmohEBsWUA==") + paramh.a() + aa.a("bRgcUw==") + ((File)localObject).getPath() + aa.a("bQoSGiY="), localIOException);
    }
  }

  private String i(String paramString)
  {
    return w.a(this.c).e(aa.a("CAIQJzM3HFo=") + paramString, w.a(this.c).e(aa.a("CAIQJzM3HA=="), null));
  }

  private String j(String paramString)
  {
    return sdk.nrun.rn.h.a(paramString);
  }

  InputStream a(Uri paramUri)
  {
    if (paramUri == null)
      throw new g(aa.a("PQAGFCMpWQMSAhcSEVEKSxILOAAf"));
    try
    {
      if (aa.a("LB8AFj40").equals(paramUri.getScheme()))
        return this.c.getAssets().open(paramUri.getPath().substring(1));
      if (aa.a("KwUfFg==").equals(paramUri.getScheme()))
      {
        FileInputStream localFileInputStream = new FileInputStream(new File(paramUri.getPath()));
        return localFileInputStream;
      }
    }
    catch (IOException localIOException)
    {
      throw new g(aa.a("IhwWHWomCgQWBANX") + paramUri + aa.a("bQoSGiY="), localIOException);
    }
    throw new g(aa.a("IwMHUzkyCQcBBFAEBhkGVVdF") + paramUri.getScheme());
  }

  // ERROR //
  public f a(String paramString, Map<String, Object> paramMap)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic 272	sdk/nrun/rn/c/f:a	(Ljava/lang/String;)Lsdk/nrun/rn/c/f;
    //   6: astore 4
    //   8: aload 4
    //   10: ifnull +8 -> 18
    //   13: aload_0
    //   14: monitorexit
    //   15: aload 4
    //   17: areturn
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 275	sdk/nrun/rn/c/j:d	(Ljava/lang/String;)Lsdk/nrun/rn/c/h;
    //   23: astore 5
    //   25: aload 5
    //   27: ldc_w 277
    //   30: invokestatic 33	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   33: invokevirtual 279	sdk/nrun/rn/c/h:d	(Ljava/lang/String;)Ljava/lang/String;
    //   36: astore 6
    //   38: ldc 67
    //   40: astore 4
    //   42: aload 6
    //   44: ifnull +26 -> 70
    //   47: new 88	java/lang/StringBuilder
    //   50: dup
    //   51: invokespecial 89	java/lang/StringBuilder:<init>	()V
    //   54: getstatic 39	sdk/nrun/rn/c/j:a	Ljava/lang/String;
    //   57: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: aload 6
    //   62: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   68: astore 4
    //   70: aload_0
    //   71: new 88	java/lang/StringBuilder
    //   74: dup
    //   75: invokespecial 89	java/lang/StringBuilder:<init>	()V
    //   78: ldc_w 281
    //   81: invokestatic 33	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   84: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: aload 5
    //   89: invokevirtual 115	sdk/nrun/rn/c/h:d	()Ljava/lang/String;
    //   92: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: aload 4
    //   97: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   103: iconst_0
    //   104: invokevirtual 284	sdk/nrun/rn/c/j:a	(Ljava/lang/String;Z)Lsdk/nrun/rn/c/h;
    //   107: astore 4
    //   109: aload_2
    //   110: ifnull +254 -> 364
    //   113: aload_2
    //   114: ldc_w 286
    //   117: invokestatic 33	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   120: invokeinterface 291 2 0
    //   125: ifeq +239 -> 364
    //   128: aload_2
    //   129: ldc_w 286
    //   132: invokestatic 33	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   135: invokeinterface 295 2 0
    //   140: checkcast 297	java/lang/Boolean
    //   143: invokevirtual 300	java/lang/Boolean:booleanValue	()Z
    //   146: istore_3
    //   147: aload 5
    //   149: invokevirtual 142	sdk/nrun/rn/c/h:b	()Ljava/lang/String;
    //   152: ldc_w 302
    //   155: invokestatic 33	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   158: invokevirtual 73	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   161: ifne +175 -> 336
    //   164: aload_0
    //   165: aload 5
    //   167: aload 4
    //   169: invokespecial 304	sdk/nrun/rn/c/j:a	(Lsdk/nrun/rn/c/h;Lsdk/nrun/rn/c/h;)Z
    //   172: ifne +164 -> 336
    //   175: aload_0
    //   176: invokevirtual 86	sdk/nrun/rn/c/j:a	()Lsdk/nrun/rn/l;
    //   179: new 88	java/lang/StringBuilder
    //   182: dup
    //   183: invokespecial 89	java/lang/StringBuilder:<init>	()V
    //   186: aload 5
    //   188: invokevirtual 115	sdk/nrun/rn/c/h:d	()Ljava/lang/String;
    //   191: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: ldc_w 306
    //   197: invokestatic 33	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   200: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   206: invokeinterface 127 2 0
    //   211: aload_0
    //   212: aload 5
    //   214: invokevirtual 142	sdk/nrun/rn/c/h:b	()Ljava/lang/String;
    //   217: invokevirtual 308	sdk/nrun/rn/c/j:h	(Ljava/lang/String;)Lsdk/nrun/rn/c/h;
    //   220: pop
    //   221: aload_0
    //   222: aload_1
    //   223: invokevirtual 275	sdk/nrun/rn/c/j:d	(Ljava/lang/String;)Lsdk/nrun/rn/c/h;
    //   226: astore_1
    //   227: aload_0
    //   228: aload_1
    //   229: aload_1
    //   230: invokespecial 304	sdk/nrun/rn/c/j:a	(Lsdk/nrun/rn/c/h;Lsdk/nrun/rn/c/h;)Z
    //   233: ifne +118 -> 351
    //   236: new 195	sdk/nrun/rn/c/g
    //   239: dup
    //   240: ldc_w 310
    //   243: invokestatic 33	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   246: invokespecial 234	sdk/nrun/rn/c/g:<init>	(Ljava/lang/String;)V
    //   249: athrow
    //   250: astore_1
    //   251: aload_0
    //   252: monitorexit
    //   253: aload_1
    //   254: athrow
    //   255: astore_2
    //   256: aload_0
    //   257: invokevirtual 86	sdk/nrun/rn/c/j:a	()Lsdk/nrun/rn/l;
    //   260: new 88	java/lang/StringBuilder
    //   263: dup
    //   264: invokespecial 89	java/lang/StringBuilder:<init>	()V
    //   267: ldc 191
    //   269: invokestatic 33	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   272: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: aload_1
    //   276: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   279: ldc_w 312
    //   282: invokestatic 33	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   285: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   288: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   291: invokeinterface 127 2 0
    //   296: new 195	sdk/nrun/rn/c/g
    //   299: dup
    //   300: new 88	java/lang/StringBuilder
    //   303: dup
    //   304: invokespecial 89	java/lang/StringBuilder:<init>	()V
    //   307: ldc_w 314
    //   310: invokestatic 33	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   313: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   316: aload_1
    //   317: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   320: ldc_w 316
    //   323: invokestatic 33	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   326: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   329: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   332: invokespecial 234	sdk/nrun/rn/c/g:<init>	(Ljava/lang/String;)V
    //   335: athrow
    //   336: aload_0
    //   337: invokevirtual 86	sdk/nrun/rn/c/j:a	()Lsdk/nrun/rn/l;
    //   340: ldc_w 318
    //   343: invokestatic 33	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   346: invokeinterface 319 2 0
    //   351: aload_0
    //   352: aload_2
    //   353: aload 4
    //   355: iload_3
    //   356: invokespecial 321	sdk/nrun/rn/c/j:a	(Ljava/util/Map;Lsdk/nrun/rn/c/h;Z)Lsdk/nrun/rn/c/f;
    //   359: astore 4
    //   361: goto -348 -> 13
    //   364: iconst_0
    //   365: istore_3
    //   366: goto -219 -> 147
    //
    // Exception table:
    //   from	to	target	type
    //   2	8	250	finally
    //   18	25	250	finally
    //   25	38	250	finally
    //   47	70	250	finally
    //   70	109	250	finally
    //   113	147	250	finally
    //   147	250	250	finally
    //   256	336	250	finally
    //   336	351	250	finally
    //   351	361	250	finally
    //   18	25	255	sdk/nrun/rn/c/g
  }

  public abstract h a(String paramString);

  // ERROR //
  public h a(String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aconst_null
    //   3: astore_3
    //   4: aload_0
    //   5: invokevirtual 325	sdk/nrun/rn/c/j:d	()Lsdk/nrun/rn/c/j$b;
    //   8: aload_1
    //   9: new 88	java/lang/StringBuilder
    //   12: dup
    //   13: invokespecial 89	java/lang/StringBuilder:<init>	()V
    //   16: new 88	java/lang/StringBuilder
    //   19: dup
    //   20: invokespecial 89	java/lang/StringBuilder:<init>	()V
    //   23: aload_1
    //   24: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: invokestatic 329	sdk/nrun/rn/s:a	()Ljava/lang/String;
    //   30: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   36: invokestatic 231	sdk/nrun/rn/h:a	(Ljava/lang/String;)Ljava/lang/String;
    //   39: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: ldc_w 331
    //   45: invokestatic 33	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   48: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   54: invokeinterface 334 3 0
    //   59: astore 4
    //   61: aload 4
    //   63: astore_3
    //   64: aload_0
    //   65: aload 4
    //   67: invokeinterface 335 1 0
    //   72: invokevirtual 179	java/io/File:getPath	()Ljava/lang/String;
    //   75: invokevirtual 337	sdk/nrun/rn/c/j:a	(Ljava/lang/String;)Lsdk/nrun/rn/c/h;
    //   78: astore 5
    //   80: aload 4
    //   82: astore_3
    //   83: aload_1
    //   84: invokestatic 341	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   87: ldc_w 343
    //   90: invokestatic 33	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   93: invokevirtual 346	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   96: astore_1
    //   97: aload_1
    //   98: ifnull +18 -> 116
    //   101: aload 4
    //   103: astore_3
    //   104: aload 5
    //   106: ldc_w 277
    //   109: invokestatic 33	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   112: aload_1
    //   113: invokevirtual 349	sdk/nrun/rn/c/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   116: aload 5
    //   118: ifnonnull +85 -> 203
    //   121: aload 4
    //   123: astore_3
    //   124: aload_0
    //   125: invokevirtual 86	sdk/nrun/rn/c/j:a	()Lsdk/nrun/rn/l;
    //   128: ldc_w 351
    //   131: invokestatic 33	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   134: invokeinterface 127 2 0
    //   139: aload 4
    //   141: astore_3
    //   142: new 195	sdk/nrun/rn/c/g
    //   145: dup
    //   146: ldc_w 353
    //   149: invokestatic 33	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   152: invokespecial 234	sdk/nrun/rn/c/g:<init>	(Ljava/lang/String;)V
    //   155: athrow
    //   156: astore_1
    //   157: aload_3
    //   158: ifnull +38 -> 196
    //   161: iload_2
    //   162: ifeq +34 -> 196
    //   165: aload_3
    //   166: invokeinterface 335 1 0
    //   171: ifnull +25 -> 196
    //   174: aload_3
    //   175: invokeinterface 335 1 0
    //   180: invokevirtual 121	java/io/File:exists	()Z
    //   183: ifeq +13 -> 196
    //   186: aload_3
    //   187: invokeinterface 335 1 0
    //   192: invokevirtual 356	java/io/File:delete	()Z
    //   195: pop
    //   196: aload_1
    //   197: athrow
    //   198: astore_1
    //   199: aload_0
    //   200: monitorexit
    //   201: aload_1
    //   202: athrow
    //   203: aload 4
    //   205: astore_3
    //   206: aload 5
    //   208: aload 4
    //   210: invokeinterface 357 1 0
    //   215: invokevirtual 360	sdk/nrun/rn/c/h:a	(Landroid/net/Uri;)V
    //   218: aload 4
    //   220: ifnull +41 -> 261
    //   223: iload_2
    //   224: ifeq +37 -> 261
    //   227: aload 4
    //   229: invokeinterface 335 1 0
    //   234: ifnull +27 -> 261
    //   237: aload 4
    //   239: invokeinterface 335 1 0
    //   244: invokevirtual 121	java/io/File:exists	()Z
    //   247: ifeq +14 -> 261
    //   250: aload 4
    //   252: invokeinterface 335 1 0
    //   257: invokevirtual 356	java/io/File:delete	()Z
    //   260: pop
    //   261: aload_0
    //   262: monitorexit
    //   263: aload 5
    //   265: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   4	61	156	finally
    //   64	80	156	finally
    //   83	97	156	finally
    //   104	116	156	finally
    //   124	139	156	finally
    //   142	156	156	finally
    //   206	218	156	finally
    //   165	196	198	finally
    //   196	198	198	finally
    //   227	261	198	finally
  }

  public h a(h paramh)
  {
    i locali = c();
    if (locali == null)
      throw new g(aa.a("HQAGFCMpNR4ABFAeFlENTV4J"));
    if (paramh == null)
      throw new g(aa.a("PQAGFCMpWR4AUB4CCR0="));
    c(paramh);
    locali.a(paramh);
    return paramh;
  }

  public l a()
  {
    return this.f;
  }

  public void a(File paramFile)
  {
    this.e = paramFile;
  }

  public void a(b paramb)
  {
    this.g = paramb;
  }

  public void a(l paraml)
  {
    this.f = paraml;
  }

  public File b()
  {
    return this.e;
  }

  public String b(String paramString)
  {
    Map localMap = e();
    if (localMap.containsKey(paramString))
      return (String)localMap.get(paramString);
    return paramString;
  }

  public void b(h paramh)
  {
    i locali = c();
    if (locali == null)
      throw new g(paramh.b() + aa.a("bQIcB2ouFwQHERwbABU="));
    c(paramh);
    locali.b(paramh);
  }

  public h c(String paramString)
  {
    i locali = c();
    if (locali == null)
      throw new g(aa.a("HQAGFCMpNR4ABFAeFlENTV4J"));
    paramString = locali.a(paramString);
    if (new File(paramString.d()).exists())
      return paramString;
    throw new g(aa.a("IwMHUywoDBkXUAAbEBYKVhI=") + paramString.d());
  }

  public abstract i c();

  public h d(String paramString)
  {
    return c().a(paramString);
  }

  b d()
  {
    return this.g;
  }

  public Map<String, String> e()
  {
    if (this.d != null)
      return this.d;
    this.d = f();
    return this.d;
  }

  // ERROR //
  public h e(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aconst_null
    //   3: astore 4
    //   5: aload 4
    //   7: astore_2
    //   8: aload_0
    //   9: aload_1
    //   10: invokespecial 393	sdk/nrun/rn/c/j:i	(Ljava/lang/String;)Ljava/lang/String;
    //   13: astore 5
    //   15: aload 5
    //   17: ifnull +232 -> 249
    //   20: aload 4
    //   22: astore_2
    //   23: new 88	java/lang/StringBuilder
    //   26: dup
    //   27: invokespecial 89	java/lang/StringBuilder:<init>	()V
    //   30: getstatic 39	sdk/nrun/rn/c/j:a	Ljava/lang/String;
    //   33: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: aload 5
    //   38: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   44: astore_3
    //   45: aload 4
    //   47: astore_2
    //   48: aload_0
    //   49: invokevirtual 325	sdk/nrun/rn/c/j:d	()Lsdk/nrun/rn/c/j$b;
    //   52: new 88	java/lang/StringBuilder
    //   55: dup
    //   56: invokespecial 89	java/lang/StringBuilder:<init>	()V
    //   59: ldc_w 395
    //   62: invokestatic 33	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   65: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: aload_0
    //   69: aload_1
    //   70: invokevirtual 144	sdk/nrun/rn/c/j:b	(Ljava/lang/String;)Ljava/lang/String;
    //   73: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: aload_3
    //   77: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   83: new 88	java/lang/StringBuilder
    //   86: dup
    //   87: invokespecial 89	java/lang/StringBuilder:<init>	()V
    //   90: new 88	java/lang/StringBuilder
    //   93: dup
    //   94: invokespecial 89	java/lang/StringBuilder:<init>	()V
    //   97: aload_1
    //   98: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: invokestatic 329	sdk/nrun/rn/s:a	()Ljava/lang/String;
    //   104: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   110: invokestatic 231	sdk/nrun/rn/h:a	(Ljava/lang/String;)Ljava/lang/String;
    //   113: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: ldc_w 331
    //   119: invokestatic 33	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   122: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   128: invokeinterface 334 3 0
    //   133: astore_1
    //   134: aload_1
    //   135: astore_2
    //   136: aload_0
    //   137: aload_1
    //   138: invokeinterface 335 1 0
    //   143: invokevirtual 179	java/io/File:getPath	()Ljava/lang/String;
    //   146: invokevirtual 337	sdk/nrun/rn/c/j:a	(Ljava/lang/String;)Lsdk/nrun/rn/c/h;
    //   149: astore_3
    //   150: aload 5
    //   152: ifnull +17 -> 169
    //   155: aload_1
    //   156: astore_2
    //   157: aload_3
    //   158: ldc_w 277
    //   161: invokestatic 33	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   164: aload 5
    //   166: invokevirtual 349	sdk/nrun/rn/c/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   169: aload_3
    //   170: ifnonnull +85 -> 255
    //   173: aload_1
    //   174: astore_2
    //   175: aload_0
    //   176: invokevirtual 86	sdk/nrun/rn/c/j:a	()Lsdk/nrun/rn/l;
    //   179: ldc_w 351
    //   182: invokestatic 33	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   185: invokeinterface 127 2 0
    //   190: aload_1
    //   191: astore_2
    //   192: new 195	sdk/nrun/rn/c/g
    //   195: dup
    //   196: ldc_w 353
    //   199: invokestatic 33	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   202: invokespecial 234	sdk/nrun/rn/c/g:<init>	(Ljava/lang/String;)V
    //   205: athrow
    //   206: astore_1
    //   207: aload_2
    //   208: ifnull +34 -> 242
    //   211: aload_2
    //   212: invokeinterface 335 1 0
    //   217: ifnull +25 -> 242
    //   220: aload_2
    //   221: invokeinterface 335 1 0
    //   226: invokevirtual 121	java/io/File:exists	()Z
    //   229: ifeq +13 -> 242
    //   232: aload_2
    //   233: invokeinterface 335 1 0
    //   238: invokevirtual 356	java/io/File:delete	()Z
    //   241: pop
    //   242: aload_1
    //   243: athrow
    //   244: astore_1
    //   245: aload_0
    //   246: monitorexit
    //   247: aload_1
    //   248: athrow
    //   249: ldc 67
    //   251: astore_3
    //   252: goto -207 -> 45
    //   255: aload_1
    //   256: astore_2
    //   257: aload_3
    //   258: aload_1
    //   259: invokeinterface 357 1 0
    //   264: invokevirtual 360	sdk/nrun/rn/c/h:a	(Landroid/net/Uri;)V
    //   267: aload_1
    //   268: ifnull +34 -> 302
    //   271: aload_1
    //   272: invokeinterface 335 1 0
    //   277: ifnull +25 -> 302
    //   280: aload_1
    //   281: invokeinterface 335 1 0
    //   286: invokevirtual 121	java/io/File:exists	()Z
    //   289: ifeq +13 -> 302
    //   292: aload_1
    //   293: invokeinterface 335 1 0
    //   298: invokevirtual 356	java/io/File:delete	()Z
    //   301: pop
    //   302: aload_0
    //   303: monitorexit
    //   304: aload_3
    //   305: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   8	15	206	finally
    //   23	45	206	finally
    //   48	134	206	finally
    //   136	150	206	finally
    //   157	169	206	finally
    //   175	190	206	finally
    //   192	206	206	finally
    //   257	267	206	finally
    //   211	242	244	finally
    //   242	244	244	finally
    //   271	302	244	finally
  }

  public Map<String, String> f()
  {
    return new HashMap();
  }

  public h f(String paramString)
  {
    try
    {
      paramString = a(paramString, true);
      return paramString;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public void g()
  {
    c().b();
  }

  public boolean g(String paramString)
  {
    paramString = b(paramString);
    try
    {
      w.a(h(), paramString).close();
      return true;
    }
    catch (IOException paramString)
    {
    }
    return false;
  }

  Context h()
  {
    return this.c;
  }

  public h h(String paramString)
  {
    try
    {
      paramString = e(paramString);
      try
      {
        d(paramString.b());
        a().b(aa.a("q+Phl/HxWQ==") + paramString.b() + aa.a("bYnEwa/p8J/Q9VyS1eyLl6eAw9eV6P6h78eV/+KT3sc="));
        b(paramString);
        return paramString;
      }
      catch (g localg)
      {
        while (true)
          a(paramString);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  static abstract class a extends j
  {
    public a(Context paramContext)
    {
      super();
    }

    public h a(String paramString)
    {
      File localFile = new File(paramString);
      if (("".equals(paramString)) || (!localFile.exists()) || (!localFile.isFile()))
      {
        a().b(aa.a("pd7/l/b7kcjqlMjdjcbM3YzhbQ==") + paramString + aa.a("bYrk06zS8Q=="));
        throw new g(aa.a("pd7/l/b7kcjqlMjdjcbM3YzhbQ==") + paramString + aa.a("bYrk06zS8Q=="));
      }
      Object localObject = a(i(paramString));
      if (localObject != null)
      {
        localObject = new String((byte[])localObject).replace(aa.a("Ew=="), aa.a("ag=="));
        h localh = new h();
        localh.g((String)localObject);
        localh.a(aa.a("HgUJFg=="), localFile.length() + "");
        localh.b(paramString);
        return localh;
      }
      throw new g(aa.a("IQMSF2o=") + paramString + aa.a("bRwfBi0uF1caHhYYRRcCUV5JYUwaHyYiHhYfUAAbEBYKVg0="));
    }

    byte[] a(byte[] paramArrayOfByte)
    {
      return paramArrayOfByte;
    }

    public byte[] i(String paramString)
    {
      try
      {
        paramString = new c(paramString).a();
        if ((paramString != null) && (!"".equals(paramString)))
          return paramString.getBytes();
        throw new g(aa.a("IQMSF2o3FQIUGR5XDB8FVxIDLAUf"));
      }
      catch (IOException paramString)
      {
      }
      throw new g(aa.a("IQMSF2o3FQIUGR5XDB8FVxIDLAUf"), paramString);
    }
  }

  public static abstract interface b
  {
    public abstract j.c a(String paramString1, String paramString2);
  }

  public static abstract interface c
  {
    public abstract Uri a();

    public abstract File b();
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.c.j
 * JD-Core Version:    0.6.2
 */
 aa.a("cgkdEB4+CRJO") -> ?encType=

 aa.a("KQkL") -> dex

 aa.a("IQMSF2o3FQIUGR5X") -> load plugin 

 aa.a("q+Phl/Hxn+H0lMvBRQ==") -> 插件文件

 aa.a("bYrv26zb8JH6zpX/1Q==") ->  木有找�

 aa.a("q97SlcP5nP/DmM/ugN/V3I78qMPKlvDTnu33lv/lgcrV3I3Eq+3c") -> 没找到这家伙对应的插件信息

 aa.a("Eg==") -> 

 aa.a("Yw==") -> 

 aa.a("HgUJFg==") -> Siz

 aa.a("q+Phl/Hx") -> 插件

 aa.a("bYnEwa/q4ZLv2J/L6Zfkqtfb2on526X79ZLDwZTP6JbEg9fv5YjJ9Q==") ->  已存在，懒得动，就不移动�

 aa.a("Lh4WEj4iWREaHBVX") -> create file 

 aa.a("bQoSGiY=") ->  fa

 aa.a("qNDzlu3MnM7BlsTMis3v35XeqObb") -> 开始干活，移动

 aa.a("qOTD") -> 到

 aa.a("IAMFFmohEBsWUA==") -> move file

 aa.a("bRgcUw==") ->  to

 aa.a("bQoSGiY=") ->  fa

 aa.a("CAIQJzM3HFo=") -> EncTyp

 aa.a("CAIQJzM3HA==") -> EncTyp

 aa.a("PQAGFCMpWQMSAhcSEVEKSxILOAAf") -> plugin target is null

 aa.a("LB8AFj40") -> assets

 aa.a("KwUfFg==") -> fil

 aa.a("IhwWHWomCgQWBANX") -> open assets 

 aa.a("bQoSGiY=") ->  fa

 aa.a("IwMHUzkyCQcBBFAEBhkGVVdF") -> not supprt scheme 

 aa.a("HQAGFCMpNR4ABFAeFlENTV4J") -> PluginList is null

 aa.a("PQAGFCMpWR4AUB4CCR0=") -> plugin is nu

 aa.a("bQIcB2ouFwQHERwbABU=") ->  not install

 aa.a("HQAGFCMpNR4ABFAeFlENTV4J") -> PluginList is null

 aa.a("IwMHUywoDBkXUAAbEBYKVhI=") -> not found plugi

 aa.a("q+Phl/HxWQ==") -> 插件

 aa.a("bYnEwa/p8J/Q9VyS1eyLl6eAw9eV6P6h78eV/+KT3sc=") ->  已安装,尝试去更新插�

 aa.a("pd7/l/b7kcjqlMjdjcbM3YzhbQ==") -> 貌似这个路径

 aa.a("bYrk06zS8Q==") ->  无�

 aa.a("pd7/l/b7kcjqlMjdjcbM3YzhbQ==") -> 貌似这个路径

 aa.a("bYrk06zS8Q==") ->  无�

 aa.a("Ew==") -> 

 aa.a("ag==") -> 

 aa.a("HgUJFg==") -> Siz

 aa.a("IQMSF2o=") -> loa

 aa.a("bRwfBi0uF1caHhYYRRcCUV5JYUwaHyYiHhYfUAAbEBYKVg0=") ->  plugin info fail,, illegal plugi

 aa.a("IQMSF2o3FQIUGR5XDB8FVxIDLAUf") -> load plugin info fail

 aa.a("IQMSF2o3FQIUGR5XDB8FVxIDLAUf") -> load plugin info fail
