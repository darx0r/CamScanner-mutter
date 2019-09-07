package sdk.nrun.rn.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import sdk.nrun.rn.aa;
import sdk.nrun.rn.b;
import sdk.nrun.rn.i.a;
import sdk.nrun.rn.i.b;
import sdk.nrun.rn.i.d;
import sdk.nrun.rn.o;
import sdk.nrun.rn.o.a;
import sdk.nrun.rn.p;
import sdk.nrun.rn.t;
import sdk.nrun.rn.w;
import sdk.nrun.rn.w.a;
import sdk.nrun.rn.x;
import sdk.nrun.rn.z;

public class e
{
  private static e a;
  private Context b;
  private Set<String> c;
  private j d;
  private boolean e = false;
  private k f;

  private e(Context paramContext)
  {
    this.b = paramContext;
    this.c = new HashSet();
    this.f = new k(this.b);
  }

  public static e a(Context paramContext)
  {
    try
    {
      if (a == null)
      {
        a = new e(paramContext);
        a.a(new l(paramContext));
      }
      paramContext = a;
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  private void a(String paramString)
  {
    a().h(paramString);
  }

  private void a(String paramString1, String paramString2, String paramString3)
  {
    b.b(this.b).e(aa.a("PggY")).a(paramString1).d(z.b).a(1, paramString2).a(2, paramString3).a(3, Build.MODEL).a(4, Build.PRODUCT).a(5, Build.VERSION.RELEASE).a(6, w.a(this.b).b(this.b).k()).h();
  }

  private void a(Map<String, k.a> paramMap)
  {
    while (true)
    {
      i locali;
      String str;
      try
      {
        locali = a().c();
        Iterator localIterator = locali.a().iterator();
        if (!localIterator.hasNext())
          break;
        str = (String)localIterator.next();
        try
        {
          if ((!w.a(this.b).a(aa.a("HQAGFCMpOhgdBAIYCQ=="), true)) || (paramMap.containsKey(str)))
            break label128;
          x.a().d(aa.a("LwAcECFnCRsGFxkZRQ==") + str);
        }
        catch (g localg)
        {
          a().a().a(localg);
        }
        continue;
      }
      finally
      {
      }
      label128: if (this.c.contains(str))
      {
        x.a().a(str + aa.a("bRwfBi0uF1caA1AFEB8NUVwC"));
      }
      else
      {
        x.a().a(aa.a("OR4KUyYoGBNTGR4EERAPVFcBbRwfBi0uF1c=") + str);
        h localh = locali.a(str);
        if (localh == null)
        {
          x.a().d(str + aa.a("bRwfBi0uF1caHhYYRRgQGFwQIQA="));
        }
        else
        {
          str = localh.f();
          if ((str != null) && (str.trim().length() > 0))
            a(localh);
        }
      }
    }
  }

  // ERROR //
  private void a(h paramh)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_1
    //   5: ldc 230
    //   7: invokestatic 80	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   10: invokevirtual 232	sdk/nrun/rn/c/h:d	(Ljava/lang/String;)Ljava/lang/String;
    //   13: astore 4
    //   15: new 234	java/util/HashMap
    //   18: dup
    //   19: invokespecial 235	java/util/HashMap:<init>	()V
    //   22: astore 5
    //   24: aload 5
    //   26: ldc 237
    //   28: invokestatic 80	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   31: ldc 239
    //   33: invokestatic 80	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   36: invokeinterface 243 3 0
    //   41: pop
    //   42: aload 4
    //   44: ifnull +259 -> 303
    //   47: aload 4
    //   49: ldc 245
    //   51: invokestatic 80	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   54: invokevirtual 249	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   57: ifeq +274 -> 331
    //   60: aload 4
    //   62: iconst_1
    //   63: invokevirtual 253	java/lang/String:substring	(I)Ljava/lang/String;
    //   66: astore 4
    //   68: new 255	android/os/Bundle
    //   71: dup
    //   72: invokespecial 256	android/os/Bundle:<init>	()V
    //   75: astore 6
    //   77: aload 6
    //   79: ldc_w 258
    //   82: invokestatic 80	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   85: aload_1
    //   86: invokevirtual 260	sdk/nrun/rn/c/h:b	()Ljava/lang/String;
    //   89: invokevirtual 264	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   92: aload_0
    //   93: getfield 34	sdk/nrun/rn/c/e:b	Landroid/content/Context;
    //   96: aload 4
    //   98: aload 6
    //   100: invokestatic 269	sdk/nrun/rn/q:a	(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Z
    //   103: ifne +18 -> 121
    //   106: iload_2
    //   107: ifeq +17 -> 124
    //   110: aload_0
    //   111: aload_1
    //   112: invokevirtual 260	sdk/nrun/rn/c/h:b	()Ljava/lang/String;
    //   115: aload 5
    //   117: invokevirtual 272	sdk/nrun/rn/c/e:a	(Ljava/lang/String;Ljava/util/Map;)Lsdk/nrun/rn/c/f;
    //   120: pop
    //   121: aload_0
    //   122: monitorexit
    //   123: return
    //   124: invokestatic 169	sdk/nrun/rn/x:a	()Lsdk/nrun/rn/l;
    //   127: new 171	java/lang/StringBuilder
    //   130: dup
    //   131: invokespecial 172	java/lang/StringBuilder:<init>	()V
    //   134: ldc_w 274
    //   137: invokestatic 80	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   140: invokevirtual 178	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: aload_1
    //   144: invokevirtual 260	sdk/nrun/rn/c/h:b	()Ljava/lang/String;
    //   147: invokevirtual 178	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: ldc_w 276
    //   153: invokestatic 80	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   156: invokevirtual 178	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: aload 4
    //   161: invokevirtual 178	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: ldc_w 278
    //   167: invokestatic 80	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   170: invokevirtual 178	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   176: invokeinterface 280 2 0
    //   181: goto -60 -> 121
    //   184: astore 4
    //   186: aload_0
    //   187: getfield 34	sdk/nrun/rn/c/e:b	Landroid/content/Context;
    //   190: invokestatic 113	sdk/nrun/rn/w:a	(Landroid/content/Context;)Lsdk/nrun/rn/w;
    //   193: ldc_w 282
    //   196: invokestatic 80	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   199: iconst_0
    //   200: invokevirtual 158	sdk/nrun/rn/w:a	(Ljava/lang/String;Z)Z
    //   203: istore_3
    //   204: iload_3
    //   205: ifeq +90 -> 295
    //   208: aload_0
    //   209: getfield 34	sdk/nrun/rn/c/e:b	Landroid/content/Context;
    //   212: invokestatic 73	sdk/nrun/rn/b:b	(Landroid/content/Context;)Lsdk/nrun/rn/b;
    //   215: getstatic 90	sdk/nrun/rn/z:b	Ljava/lang/String;
    //   218: invokevirtual 92	sdk/nrun/rn/b:d	(Ljava/lang/String;)Lsdk/nrun/rn/b;
    //   221: ldc 75
    //   223: invokestatic 80	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   226: invokevirtual 83	sdk/nrun/rn/b:e	(Ljava/lang/String;)Lsdk/nrun/rn/b;
    //   229: ldc_w 284
    //   232: invokestatic 80	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   235: invokevirtual 85	sdk/nrun/rn/b:a	(Ljava/lang/String;)Lsdk/nrun/rn/b;
    //   238: iconst_1
    //   239: aload_1
    //   240: invokevirtual 286	sdk/nrun/rn/c/h:e	()Ljava/lang/String;
    //   243: invokevirtual 95	sdk/nrun/rn/b:a	(ILjava/lang/String;)Lsdk/nrun/rn/b;
    //   246: iconst_2
    //   247: new 171	java/lang/StringBuilder
    //   250: dup
    //   251: invokespecial 172	java/lang/StringBuilder:<init>	()V
    //   254: aload_1
    //   255: invokevirtual 288	sdk/nrun/rn/c/h:c	()I
    //   258: invokevirtual 291	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   261: ldc_w 293
    //   264: invokevirtual 178	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   267: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   270: invokevirtual 95	sdk/nrun/rn/b:a	(ILjava/lang/String;)Lsdk/nrun/rn/b;
    //   273: iconst_3
    //   274: ldc 239
    //   276: invokestatic 80	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   279: invokevirtual 95	sdk/nrun/rn/b:a	(ILjava/lang/String;)Lsdk/nrun/rn/b;
    //   282: bipush 6
    //   284: aload 4
    //   286: invokestatic 296	sdk/nrun/rn/x:b	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   289: invokevirtual 95	sdk/nrun/rn/b:a	(ILjava/lang/String;)Lsdk/nrun/rn/b;
    //   292: invokevirtual 124	sdk/nrun/rn/b:h	()V
    //   295: aload 4
    //   297: athrow
    //   298: astore_1
    //   299: aload_0
    //   300: monitorexit
    //   301: aload_1
    //   302: athrow
    //   303: aload_0
    //   304: aload_1
    //   305: invokevirtual 260	sdk/nrun/rn/c/h:b	()Ljava/lang/String;
    //   308: aload 5
    //   310: invokevirtual 272	sdk/nrun/rn/c/e:a	(Ljava/lang/String;Ljava/util/Map;)Lsdk/nrun/rn/c/f;
    //   313: pop
    //   314: goto -193 -> 121
    //   317: astore_1
    //   318: invokestatic 169	sdk/nrun/rn/x:a	()Lsdk/nrun/rn/l;
    //   321: aload 4
    //   323: invokeinterface 189 2 0
    //   328: goto -33 -> 295
    //   331: iconst_0
    //   332: istore_2
    //   333: goto -265 -> 68
    //
    // Exception table:
    //   from	to	target	type
    //   4	42	184	sdk/nrun/rn/c/g
    //   47	68	184	sdk/nrun/rn/c/g
    //   68	106	184	sdk/nrun/rn/c/g
    //   110	121	184	sdk/nrun/rn/c/g
    //   124	181	184	sdk/nrun/rn/c/g
    //   303	314	184	sdk/nrun/rn/c/g
    //   4	42	298	finally
    //   47	68	298	finally
    //   68	106	298	finally
    //   110	121	298	finally
    //   124	181	298	finally
    //   186	204	298	finally
    //   208	295	298	finally
    //   295	298	298	finally
    //   303	314	298	finally
    //   318	328	298	finally
    //   208	295	317	java/lang/Exception
  }

  private void a(k.a parama, String paramString)
  {
    try
    {
      a().a().a(aa.a("KQMSHSYoGBNT") + parama.a + aa.a("bR8GEA=="));
      h localh = a().f(aa.a("KwUfFnBoVg==") + paramString + b(parama));
      localh = a().a(localh);
      x.a().a(aa.a("JAIABysrFVcAFQIBAANDSF4QKgUdUw==") + localh);
      Intent localIntent = new Intent(aa.a("LgMeXTkjElkDHF4UChwTVFcRKAg="));
      localIntent.putExtra(aa.a("HQAGFCMp"), parama);
      localIntent.setPackage(this.b.getPackageName());
      this.b.sendBroadcast(localIntent);
      if (!this.c.contains(localh.b()))
        a(localh);
    }
    catch (Exception localException)
    {
    }
    finally
    {
      new File(paramString).delete();
    }
    throw parama;
  }

  private boolean a(k.a parama)
  {
    boolean bool = false;
    if (!w.a(this.b).a(aa.a("HgQaFiYjJg==") + parama.a, false))
      bool = true;
    return bool;
  }

  private String b(k.a parama)
  {
    parama = Uri.parse(parama.b).getQueryParameters(aa.a("Lg=="));
    if (parama.size() <= 0)
      return "";
    parama = (String)parama.get(0);
    if (parama != null)
    {
      parama = new String(sdk.nrun.rn.e.b(Base64.decode(parama, 1), aa.a("ACA4Ox8IKTM=").getBytes())).trim();
      return aa.a("cgkdEB4+CRJO") + parama;
    }
    return "";
  }

  private void b(Map<String, k.a> paramMap)
  {
    Object localObject;
    i locali;
    String str;
    try
    {
      localObject = w.a(this.b).c().keySet();
      locali = a().c();
      Iterator localIterator = ((Set)localObject).iterator();
      while (true)
      {
        if (!localIterator.hasNext())
          break label209;
        str = (String)localIterator.next();
        if ((!w.a(this.b).a(aa.a("HQAGFCMpOhgdBAIYCQ=="), true)) || (paramMap.containsKey(str)))
          break;
        x.a().d(aa.a("LwAcECFnCRsGFxkZRQ==") + str);
      }
    }
    finally
    {
    }
    while (true)
    {
      try
      {
        while (true)
        {
          localObject = locali.a(str);
          if (localObject == null)
            break;
          try
          {
            str = ((h)localObject).f();
            if ((str == null) || (str.trim().length() <= 0))
              break;
            a((h)localObject);
          }
          catch (g localg1)
          {
            this.d.a().a(localg1);
          }
        }
      }
      catch (g localg2)
      {
        if (!this.d.g(str))
          break label212;
      }
      h localh = this.d.h(str);
      continue;
      label209: return;
      label212: localh = null;
    }
  }

  private Map<String, k.a> c()
  {
    List localList = this.f.a();
    return this.f.a(localList);
  }

  private boolean d()
  {
    boolean bool1 = false;
    while (true)
    {
      t localt;
      try
      {
        boolean bool2 = this.e;
        if (bool2)
          return bool1;
        this.e = true;
        String str1 = "";
        if (w.a(this.b).a(aa.a("ABkfByMXGBQYERcS"), false))
          str1 = sdk.nrun.rn.h.a(this.b.getPackageName());
        localt = new t();
        if (!localt.c(this.b, aa.a("HQAGFCMp") + str1).booleanValue())
        {
          a().a().a(aa.a("Og0aB2o3FQIUGR5XAR4UVl4KLAhTAC81DxIB"));
          this.b.getApplicationContext().registerReceiver(new BroadcastReceiver()
          {
            public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
            {
              paramAnonymousContext = (k.a)paramAnonymousIntent.getExtras().getParcelable(aa.a("HQAGFCMp"));
              if (!e.a(e.this).contains(paramAnonymousContext.a));
              try
              {
                e.this.a().g();
                paramAnonymousContext = e.this.a().d(paramAnonymousContext.a);
                e.a(e.this, paramAnonymousContext);
                return;
              }
              catch (Exception paramAnonymousContext)
              {
                e.this.a().a().a(paramAnonymousContext);
              }
            }
          }
          , new IntentFilter(aa.a("LgMeXTkjElkDHF4UChwTVFcRKAg=")));
          continue;
        }
      }
      finally
      {
      }
      localt.a(this.b, aa.a("HQAGFCMp") + str2);
      a().a().a(aa.a("PhgSAT5nCRsGFxkZRRUMT1wJIg0XUzkiCwEWAg=="));
      bool1 = true;
    }
  }

  private void e()
  {
    try
    {
      new Thread(new Runnable()
      {
        public void run()
        {
          try
          {
            if (!e.b(e.this))
              return;
            while (true)
            {
              e.c(e.this);
              SystemClock.sleep(((Integer)w.a(e.d(e.this)).a(aa.a("HQAGFCMpLAcXEQQSNgECVg=="), Integer.valueOf(21600000))).intValue());
            }
          }
          catch (Exception localException)
          {
            x.a().a(localException);
          }
        }
      }).start();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void f()
  {
    Object localObject = this.f.a();
    label52: final i.b localb;
    if ((w.a(this.b).a(aa.a("HQAGFCMpOhgdBAIYCQ=="), true)) && (((List)localObject).size() == 0))
    {
      x.a().b(aa.a("LAAfUzorDBAaHgNXBx0MW1k="));
      return;
    }
    else
    {
      x.a().a(aa.a("OB8WUyYuG1cFFQJXDAI=") + z.a);
      localb = new i.b();
      localObject = ((List)localObject).iterator();
    }
    while (true)
    {
      if (!((Iterator)localObject).hasNext())
        break label52;
      k.a locala = (k.a)((Iterator)localObject).next();
      if (!a(locala))
        break;
      try
      {
        int i = a().d(locala.a).c();
        int j = locala.a();
        if (i >= j)
          continue;
        label161: final i.d locald = new i.d();
        File localFile;
        try
        {
          localFile = new File(p.a(this.b, sdk.nrun.rn.h.a(p.a(this.b))).b(aa.a("PQAXHw==")), locala.a + aa.a("Yw0DGA=="));
          if ((locala.d == null) || (!localFile.exists()) || (!sdk.nrun.rn.h.a(locala.d, localFile)))
            break label292;
          a(locala, localFile.getPath());
          return;
        }
        catch (Exception localException)
        {
          a().a().a(localException);
        }
        continue;
        label292: locald.b(localFile.getPath());
        locald.a(localException.b);
        a().a().a(aa.a("KQMSHSYoGBNT") + localException.a + aa.a("bQ4WFCMp"));
        localb.a(locald, new i.a()
        {
          int a = 0;

          public void a(Exception paramAnonymousException)
          {
            e.this.a().a().a(paramAnonymousException);
            try
            {
              Thread.sleep(60000L);
              label22: if (this.a < 3)
              {
                this.a += 1;
                x.a().b(aa.a("OR4KUy4oDhkfHxETRQ==") + locald.a() + " " + this.a);
                localb.a(locald, this);
              }
              do
              {
                return;
                e.a(e.this, aa.a("PQAGFCMpPRgEHRwYBBUmSkAKPw=="), localException.a, localException.c);
              }
              while (this.a >= 4);
              this.a += 1;
              o.a(e.d(e.this), new o.a()
              {
                public void a(Context paramAnonymous2Context)
                {
                  e.3.this.c.a(e.3.this.b, jdField_this);
                }
              });
              return;
            }
            catch (InterruptedException paramAnonymousException)
            {
              break label22;
            }
          }

          public void a(i.d paramAnonymousd)
          {
            e.a(e.this, aa.a("PQAGFCMpPRgEHRwYBBUgV18VIQkHFi4="), localException.a, localException.c);
            e.a(e.this, localException, paramAnonymousd.b());
          }
        });
        a(aa.a("PQAGFCMpPRgEHRwYBBUhXVUMIw=="), localException.a, localException.c);
      }
      catch (g localg)
      {
        break label161;
      }
    }
  }

  // ERROR //
  public f a(String paramString, Map<String, Object> paramMap)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 39	sdk/nrun/rn/c/e:c	Ljava/util/Set;
    //   6: aload_1
    //   7: invokeinterface 192 2 0
    //   12: istore_3
    //   13: iload_3
    //   14: ifne +173 -> 187
    //   17: aconst_null
    //   18: astore 4
    //   20: aload_0
    //   21: invokevirtual 61	sdk/nrun/rn/c/e:a	()Lsdk/nrun/rn/c/j;
    //   24: aload_1
    //   25: invokevirtual 538	sdk/nrun/rn/c/j:c	(Ljava/lang/String;)Lsdk/nrun/rn/c/h;
    //   28: astore 5
    //   30: aload 5
    //   32: astore 4
    //   34: aload 4
    //   36: ifnull +151 -> 187
    //   39: aload 4
    //   41: ldc_w 540
    //   44: invokestatic 80	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   47: invokevirtual 543	sdk/nrun/rn/c/h:e	(Ljava/lang/String;)I
    //   50: ifeq +137 -> 187
    //   53: aload_0
    //   54: invokevirtual 61	sdk/nrun/rn/c/e:a	()Lsdk/nrun/rn/c/j;
    //   57: aload_1
    //   58: invokevirtual 415	sdk/nrun/rn/c/j:g	(Ljava/lang/String;)Z
    //   61: ifeq +126 -> 187
    //   64: aload_0
    //   65: invokevirtual 61	sdk/nrun/rn/c/e:a	()Lsdk/nrun/rn/c/j;
    //   68: aload 4
    //   70: invokevirtual 260	sdk/nrun/rn/c/h:b	()Ljava/lang/String;
    //   73: invokevirtual 545	sdk/nrun/rn/c/j:e	(Ljava/lang/String;)Lsdk/nrun/rn/c/h;
    //   76: astore 6
    //   78: aload 6
    //   80: ifnull +237 -> 317
    //   83: new 346	java/io/File
    //   86: dup
    //   87: aload 6
    //   89: invokevirtual 547	sdk/nrun/rn/c/h:d	()Ljava/lang/String;
    //   92: invokespecial 347	java/io/File:<init>	(Ljava/lang/String;)V
    //   95: astore 5
    //   97: aload 6
    //   99: ifnull +209 -> 308
    //   102: aload 4
    //   104: invokevirtual 288	sdk/nrun/rn/c/h:c	()I
    //   107: aload 6
    //   109: invokevirtual 288	sdk/nrun/rn/c/h:c	()I
    //   112: if_icmplt +41 -> 153
    //   115: aload 4
    //   117: invokevirtual 288	sdk/nrun/rn/c/h:c	()I
    //   120: aload 6
    //   122: invokevirtual 288	sdk/nrun/rn/c/h:c	()I
    //   125: if_icmpne +183 -> 308
    //   128: aload 4
    //   130: ldc_w 540
    //   133: invokestatic 80	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   136: invokevirtual 543	sdk/nrun/rn/c/h:e	(Ljava/lang/String;)I
    //   139: aload 6
    //   141: ldc_w 540
    //   144: invokestatic 80	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   147: invokevirtual 543	sdk/nrun/rn/c/h:e	(Ljava/lang/String;)I
    //   150: if_icmpeq +158 -> 308
    //   153: aload_0
    //   154: invokevirtual 61	sdk/nrun/rn/c/e:a	()Lsdk/nrun/rn/c/j;
    //   157: invokevirtual 186	sdk/nrun/rn/c/j:a	()Lsdk/nrun/rn/l;
    //   160: ldc_w 549
    //   163: invokestatic 80	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   166: invokeinterface 196 2 0
    //   171: aload_0
    //   172: invokevirtual 61	sdk/nrun/rn/c/e:a	()Lsdk/nrun/rn/c/j;
    //   175: aload 6
    //   177: invokevirtual 314	sdk/nrun/rn/c/j:a	(Lsdk/nrun/rn/c/h;)Lsdk/nrun/rn/c/h;
    //   180: pop
    //   181: aload 5
    //   183: invokevirtual 350	java/io/File:delete	()Z
    //   186: pop
    //   187: aload_0
    //   188: invokevirtual 61	sdk/nrun/rn/c/e:a	()Lsdk/nrun/rn/c/j;
    //   191: aload_1
    //   192: aload_2
    //   193: invokevirtual 550	sdk/nrun/rn/c/j:a	(Ljava/lang/String;Ljava/util/Map;)Lsdk/nrun/rn/c/f;
    //   196: astore_2
    //   197: aload_0
    //   198: invokevirtual 61	sdk/nrun/rn/c/e:a	()Lsdk/nrun/rn/c/j;
    //   201: invokevirtual 186	sdk/nrun/rn/c/j:a	()Lsdk/nrun/rn/l;
    //   204: new 171	java/lang/StringBuilder
    //   207: dup
    //   208: invokespecial 172	java/lang/StringBuilder:<init>	()V
    //   211: ldc_w 552
    //   214: invokestatic 80	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   217: invokevirtual 178	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   220: aload_2
    //   221: invokevirtual 557	sdk/nrun/rn/c/f:e	()Lsdk/nrun/rn/c/h;
    //   224: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   227: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   230: invokeinterface 196 2 0
    //   235: aload_0
    //   236: getfield 39	sdk/nrun/rn/c/e:c	Ljava/util/Set;
    //   239: aload_1
    //   240: invokeinterface 192 2 0
    //   245: ifne +14 -> 259
    //   248: aload_0
    //   249: getfield 39	sdk/nrun/rn/c/e:c	Ljava/util/Set;
    //   252: aload_1
    //   253: invokeinterface 560 2 0
    //   258: pop
    //   259: aload_0
    //   260: monitorexit
    //   261: aload_2
    //   262: areturn
    //   263: astore 5
    //   265: aload_0
    //   266: aload_1
    //   267: invokespecial 561	sdk/nrun/rn/c/e:a	(Ljava/lang/String;)V
    //   270: goto -236 -> 34
    //   273: astore_1
    //   274: aload_0
    //   275: monitorexit
    //   276: aload_1
    //   277: athrow
    //   278: astore 4
    //   280: aload 5
    //   282: invokevirtual 350	java/io/File:delete	()Z
    //   285: pop
    //   286: aload 4
    //   288: athrow
    //   289: astore 4
    //   291: aload_0
    //   292: invokevirtual 61	sdk/nrun/rn/c/e:a	()Lsdk/nrun/rn/c/j;
    //   295: invokevirtual 186	sdk/nrun/rn/c/j:a	()Lsdk/nrun/rn/l;
    //   298: aload 4
    //   300: invokeinterface 189 2 0
    //   305: goto -118 -> 187
    //   308: aload 5
    //   310: invokevirtual 350	java/io/File:delete	()Z
    //   313: pop
    //   314: goto -127 -> 187
    //   317: aload_0
    //   318: invokevirtual 61	sdk/nrun/rn/c/e:a	()Lsdk/nrun/rn/c/j;
    //   321: invokevirtual 186	sdk/nrun/rn/c/j:a	()Lsdk/nrun/rn/l;
    //   324: new 171	java/lang/StringBuilder
    //   327: dup
    //   328: invokespecial 172	java/lang/StringBuilder:<init>	()V
    //   331: ldc_w 563
    //   334: invokestatic 80	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   337: invokevirtual 178	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   340: aload 4
    //   342: invokevirtual 260	sdk/nrun/rn/c/h:b	()Ljava/lang/String;
    //   345: invokevirtual 178	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   348: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   351: invokeinterface 185 2 0
    //   356: goto -169 -> 187
    //
    // Exception table:
    //   from	to	target	type
    //   20	30	263	sdk/nrun/rn/c/g
    //   2	13	273	finally
    //   20	30	273	finally
    //   39	78	273	finally
    //   83	97	273	finally
    //   102	153	273	finally
    //   153	171	273	finally
    //   181	187	273	finally
    //   187	259	273	finally
    //   265	270	273	finally
    //   280	289	273	finally
    //   291	305	273	finally
    //   308	314	273	finally
    //   317	356	273	finally
    //   171	181	278	finally
    //   39	78	289	sdk/nrun/rn/c/g
    //   83	97	289	sdk/nrun/rn/c/g
    //   102	153	289	sdk/nrun/rn/c/g
    //   153	171	289	sdk/nrun/rn/c/g
    //   181	187	289	sdk/nrun/rn/c/g
    //   280	289	289	sdk/nrun/rn/c/g
    //   308	314	289	sdk/nrun/rn/c/g
    //   317	356	289	sdk/nrun/rn/c/g
  }

  public j a()
  {
    return this.d;
  }

  public void a(j paramj)
  {
    this.d = paramj;
  }

  public void b()
  {
    try
    {
      Map localMap = c();
      if ((w.a(this.b).a(aa.a("HQAGFCMpOhgdBAIYCQ=="), true)) && (localMap.size() == 0))
      {
        x.a().b(aa.a("LAAfUzorDBAaHgNXBx0MW1k="));
        x.a(this.b, aa.a("qdT+m8n6kcDilMrxRFBC"));
      }
      try
      {
        a(this.b).a(localMap);
        a(this.b).b(localMap);
        if (w.a(this.b).a(aa.a("HQAGFCMpLAcXEQQSIxQCTEcXKA=="), true))
        {
          a(this.b).e();
          return;
        }
      }
      catch (Exception localException1)
      {
        while (true)
          x.a().a(localException1);
      }
    }
    catch (Exception localException2)
    {
      a().a().a(localException2);
      return;
    }
    x.a().b(aa.a("LgAcAC9nCRsGFxkZRQQTXFMRKEwVFiszDAUW"));
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.c.e
 * JD-Core Version:    0.6.2
 */
 aa.a("PggY") -> sdk

 aa.a("HQAGFCMpOhgdBAIYCQ==") -> PluginContro

 aa.a("LwAcECFnCRsGFxkZRQ==") -> block plugin

 aa.a("bRwfBi0uF1caA1AFEB8NUVwC") ->  plugin is running

 aa.a("OR4KUyYoGBNTGR4EERAPVFcBbRwfBi0uF1c=") -> try load installed plugi

 aa.a("bRwfBi0uF1caHhYYRRgQGFwQIQA=") ->  plugin info is nu

 aa.a("KQMSHSYoGBNT") -> doanload 

 aa.a("bR8GEA==") ->  su

 aa.a("KwUfFnBoVg==") -> file:/

 aa.a("JAIABysrFVcAFQIBAANDSF4QKgUdUw==") -> install server plugin

 aa.a("LgMeXTkjElkDHF4UChwTVFcRKAg=") -> com.sdk.pl.complet

 aa.a("HQAGFCMp") -> Plugin

 aa.a("HgQaFiYjJg==") -> Shield

 aa.a("Lg==") -> 

 aa.a("ACA4Ox8IKTM=") -> MLKHUO

 aa.a("cgkdEB4+CRJO") -> ?encType=

 aa.a("HQAGFCMpOhgdBAIYCQ==") -> PluginContro

 aa.a("LwAcECFnCRsGFxkZRQ==") -> block plugin

 aa.a("ABkfByMXGBQYERcS") -> MultiPackage

 aa.a("HQAGFCMp") -> Plugin

 aa.a("Og0aB2o3FQIUGR5XAR4UVl4KLAhTAC81DxIB") -> wait plugin download server

 aa.a("HQAGFCMp") -> Plugin

 aa.a("LgMeXTkjElkDHF4UChwTVFcRKAg=") -> com.sdk.pl.complet

 aa.a("HQAGFCMp") -> Plugin

 aa.a("PhgSAT5nCRsGFxkZRRUMT1wJIg0XUzkiCwEWAg==") -> start plugin download serve

 aa.a("HQAGFCMpLAcXEQQSNgECVg==") -> PluginUpdateSpa

 aa.a("HQAGFCMpOhgdBAIYCQ==") -> PluginContro

 aa.a("LAAfUzorDBAaHgNXBx0MW1k=") -> all plugins blo

 aa.a("OB8WUyYuG1cFFQJXDAI=") -> use lib ver 

 aa.a("PQAXHw==") -> pld

 aa.a("Yw0DGA==") -> .ap

 aa.a("KQMSHSYoGBNT") -> doanload 

 aa.a("bQ4WFCMp") ->  begin

 aa.a("OR4KUy4oDhkfHxETRQ==") -> try download

 aa.a("PQAGFCMpPRgEHRwYBBUmSkAKPw==") -> pluginDowmloadErro

 aa.a("PQAGFCMpPRgEHRwYBBUgV18VIQkHFi4=") -> pluginDowmloadComplet

 aa.a("PQAGFCMpPRgEHRwYBBUhXVUMIw==") -> pluginDowmloadBegi

 aa.a("HQAGFCMpOhgdBAIYCQ==") -> PluginContro

 aa.a("LAAfUzorDBAaHgNXBx0MW1k=") -> all plugins blo

 aa.a("qdT+m8n6kcDilMrxRFBC") -> 不能跑了!!!

 aa.a("HQAGFCMpLAcXEQQSIxQCTEcXKA==") -> PluginUpdateFeatur

 aa.a("LgAcAC9nCRsGFxkZRQQTXFMRKEwVFiszDAUW") -> close plugin update feature
